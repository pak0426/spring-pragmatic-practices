package io.springpragmaticpractices.chapter.fifteen.one;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Clock;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void 로그인을_호출할_경우_사용자의_마지막_로그인_시간이_갱신된다() {
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
}