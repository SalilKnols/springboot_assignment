package controller;

import service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    @Autowired
    TimeService timeService;

    @GetMapping("/status")
    public String getTime(){
        return "Running ," + timeService.getTime();
    }
}