package io.springpragmaticpractices.chapter.fifteen.one;

import java.time.Clock;

public class SystemClockHolder implements ClockHolder {

    @Override
    public long now() {
        return Clock.systemUTC().millis();
    }
}
