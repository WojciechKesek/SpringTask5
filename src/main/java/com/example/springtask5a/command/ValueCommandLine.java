package com.example.springtask5a.command;

import com.example.springtask5a.logger.WelcomeMessageLogger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Slf4j
@Component
@RequiredArgsConstructor
public class ValueCommandLine implements CommandLineRunner {

    private final WelcomeMessageLogger logger;


    @Override
    public void run(String... args) throws Exception {
        if(logger.getShouldLog()){
            log.info(logger.getText());
        }

    }
}
