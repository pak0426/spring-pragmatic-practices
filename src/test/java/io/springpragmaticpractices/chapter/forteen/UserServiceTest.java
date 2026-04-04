package io.springpragmaticpractices.chapter.forteen;


import io.springpragmaticpractices.chapter.forteen.one.StubEmptyRepository;
import io.springpragmaticpractices.chapter.forteen.one.StubExistUserRepository;
import io.springpragmaticpractices.chapter.forteen.three.FakeUserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @Test
    public void 이메일_회원가입을_하면_가입_보류_상태가_된다() {
        // given
        UserCreateDto userCreateDto = UserCreateDto.builder()
                .email("email@email.com")
                .nickname("nickname")
                .build();

        // when
        UserService.builder()
                .verificationEmailSender(new DummyVerificationEmailSender())
                .userRepository(userRepository)
                .build();
        User user = userRepository.register(userCreateDto);

        // then
        assertThat(user.isPending()).isTrue();
    }

    @Test
    void 이메일_회원가입을_하면_보류_상태가_된다() {
        // given
        UserCreateDto userCreateDto = UserCreateDto.builder()
                .email("foobar@email.com")
                .nickname("foobar")
                .build();

        // when
        UserService userService = UserService.builder()
                .verificationEmailSender(new DummyVerificationEmailSender())
                .userRepository(new StubEmptyRepository())
                .build();

        User user = userService.register(userCreateDto);

        // then
        assertThat(user.isPending()).isTrue();
    }

    @Test
    public void 중복된_이메일_회원가입_요청이_오면_에러가_발생() {
        // given
        UserCreateDto userCreateDto = UserCreateDto.builder()
                .email("foobar@email.com")
                .nickname("foobar")
                .build();

        // then
        assertThrows(DuplicatedEmailException.class, () -> {
            // when
            UserService userService = UserService.builder()
                    .verificationEmailSender(new DummyVerificationEmailSender())
                    .userRepository(new StubExistUserRepository())
                    .build();
            User user = userService.register(userCreateDto);
        });
    }

    @Test
    void 중복된_이메일_회원가입_요청이_오면_에러가_발생한다() {
        // given
        UserCreateDto userCreateDto = UserCreateDto.builder()
                .email("foobar@email.com")
                .nickname("foobar")
                .build();

        FakeUserRepository userRepository = new FakeUserRepository();
        userRepository.save(User.builder()
                        .id(1L)
                        .email("foobar@email.com")
                        .nickname("foobar")
                        .status(UserStatus.ACTIVE)
                        .verificationCode("aaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .build());

        // then
        assertThrows(DuplicatedEmailException.class, () -> {
            // when
            UserService userService = UserService.builder()
                    .verificationEmailSender(new DummyVerificationEmailSender())
                    .userRepository(userRepository)
                    .build();
            User user = userService.register(userCreateDto);
        });
    }

    @Test
    void 이메일_회원가입을_하면_가입_보류_상태가_됨() {
        // given
        UserCreateDto userCreateDto = UserCreateDto.builder()
                .email("foobar@email.com")
                .nickname("foobar")
                .build();

        // when
        UserService userService = UserService.builder()
                .verificationEmailSender(new DummyVerificationEmailSender())
                .userRepository(new StubEmptyRepository())
                .build();

        User user = userService.register(userCreateDto);

        // then
        assertThat(user.isPending()).isTrue();
    }
}