package io.springpragmaticpractices.chapter.fifteen.one;

import jdk.jfr.Event;
import jdk.jfr.EventType;
import lombok.Builder;
import lombok.Getter;

import java.time.Clock;
import java.util.Collections;
import java.util.List;

@Getter
@Builder
public class User {

    private String email;
    private long lastLoginTimestamp;

    public List<Event> login(ClockHolder clockHolder) {
        // ...
        this.lastLoginTimestamp = clockHolder.now();
        return Collections.singletonList(Event.builder()
                .type(EventType.AUDIT_LOG)
                .message("User(" + email + ") login!")
                .build());
    }
}
