package io.springpragmaticpractices.chapter.fifteen.one;

import lombok.Builder;
import lombok.Getter;

import java.time.Clock;

@Getter
@Builder
public class User {

    private String email;
    private long lastLoginTimestamp;

    public LoginSuccess login(ClockHolder clockHolder) {
        // ...
        this.lastLoginTimestamp = clockHolder.now();
        return LoginSuccess.builder()
                .auditMessage("User(" + email + ") login!")
                .build();
    }
}
