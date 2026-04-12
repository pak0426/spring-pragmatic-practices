package io.springpragmaticpractices.chapter.fifteen.one;

import lombok.Builder;
import lombok.Getter;

import java.time.Clock;

@Getter
@Builder
public class User {

    private String email;
    private long lastLoginTimestamp;

    public void login(ClockHolder clockHolder) {
        // ...
        this.lastLoginTimestamp = clockHolder.now();
        System.out.println("User(" + email + ") login!");
    }
}
