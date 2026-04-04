package io.springpragmaticpractices.chapter.forteen;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.assertj.core.api.Assertions.*;

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

}