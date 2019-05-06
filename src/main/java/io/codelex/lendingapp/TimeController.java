package io.codelex.lendingapp;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/testing-api")
public class TimeController {
    
    private final TimeMachine timeMachine;

    public TimeController(TimeMachine timeMachine) {
        this.timeMachine = timeMachine;
    }

    @PutMapping("/time")
    public void doSomethingWithTime(@RequestBody LocalDateTime localDateTime) {
        timeMachine.useFixedClockAt(localDateTime);
    }
    
    @GetMapping("/time")
    public LocalDateTime getTime() {
        return timeMachine.now();
    }
    
    @PostMapping("/reset-time")
    public LocalDateTime resetTime() {
        return timeMachine.useSystemDefaultZoneClock();
    }
}
