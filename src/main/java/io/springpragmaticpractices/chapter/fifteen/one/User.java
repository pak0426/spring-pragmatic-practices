package io.springpragmaticpractices.chapter.fifteen.one;

import lombok.Builder;
import lombok.Getter;

import java.time.Clock;

@Getter
@Builder
public class User {

    private String email;
    private long lastLoginTimestamp;

    public void login(long currentTimestamp) {
        // ...
        this.lastLoginTimestamp = currentTimestamp;
    }
}
