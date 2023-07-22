package com.example.springtask5a.logger;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Getter
@Component
public class WelcomeMessageLogger {

    private final String text;

    private final Boolean shouldLog;

    public WelcomeMessageLogger(@Value("${pl.sdacademy.welcome.text.value:none}") String text,
                                @Value("${pl.sdacademy.welcome.text.enable}") Boolean shouldLog) {
        this.text = text;
        this.shouldLog = shouldLog;
    }

}
