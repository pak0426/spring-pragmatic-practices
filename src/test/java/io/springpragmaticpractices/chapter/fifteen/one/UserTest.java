package io.springpragmaticpractices.chapter.fifteen.one;

import io.springpragmaticpractices.chapter.forteen.UserRepository;
import io.springpragmaticpractices.chapter.forteen.UserService;
import io.springpragmaticpractices.chapter.forteen.three.FakeUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Clock;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void 로그인을_호출할_경우_사용자의_마지막_로그인_시간이_갱신된다1() {
        // given
        User user = User.builder()
                .email("foobar@email.com")
                .build();

        // when
        long currentTimestamp = Clock.systemUTC().millis();
        user.login(currentTimestamp);

        // then
        assertThat(user.getLastLoginTimestamp()).isEqualTo(currentTimestamp);
    }

    @Test
    void 로그인을_호출할_경우_사용자의_마지막_로그인_시간이_갱신된다2() {
        // given
        User user = User.builder()
                .email("foobar@email.com")
                .build();

        // when
        long currentTimestamp = Clock.systemUTC().millis();
        user.login(currentTimestamp);

        // then
        long expected = Clock.systemUTC().millis();
        assertThat(user.getLastLoginTimestamp()).isGreaterThan(0);
    }

    @Test
    void 로그인을_호출할_경우_사용자의_마지막_로그인_시각이_갱신된다3() {
        // given
        UserRepository userRepository = new FakeUserRepository();
        userRepository.save(User.builder()
                .email("foobar@email.com")
                .build());

        // when
        UserService userService = UserService.builder()
                .userRepository(userRepository)
                .build();
        User result = userService.login("foobar@email.com");

        // then
        long expected = ???; // 기대값은 어떤게 들어가야할까???
        assertThat(result.getLastLoginTimestamp()).isEqualsTo(expected);
    }

    @Test
    void 로그인을_호출할_경우_사용자의_마지막_로그인_시각이_갱신된다4() {
        // given
        final long currentTimeStamp = 1672498800000L;
        ClockHolder clockHolder = new ClockHolder() {
            @Override
            public long now() {
                return currentTimeStamp;
            }
        };

        UserRepository userRepository = new FakeUserRepository();
        userRepository.save(User.builder()
                .email("foobar@email.com")
                .build());

        // when
        UserService userService = UserService.builder()
                .userRepository(userRepository)
                .build();
        User result = userService.login("foobar@email.com");

        // then
        long expected = currentTimeStamp; // 기대값은 어떤게 들어가야할까???
        assertThat(result.getLastLoginTimestamp()).isEqualsTo(expected);
    }
}