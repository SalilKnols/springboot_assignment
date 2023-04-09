package service;

import org.springframework.stereotype.Service;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {
    public String getTime(){
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        return formatTime.format(time);
    }
}