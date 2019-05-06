package io.codelex.lendingapp;

import org.springframework.stereotype.Component;

import java.time.*;

@Component
public class TimeMachine {

    private static Clock clock = Clock.systemDefaultZone();
    private static ZoneId zoneId = ZoneId.systemDefault();

    LocalDateTime now() {
        return LocalDateTime.now(getClock());
    }

    void useFixedClockAt(LocalDateTime date){
        clock = Clock.fixed(date.atZone(zoneId).toInstant(), zoneId);
    }

    LocalDateTime useSystemDefaultZoneClock(){
        clock = Clock.systemDefaultZone();
        return LocalDateTime.now();
    }

    private Clock getClock() {
        return clock ;
    }
    
}