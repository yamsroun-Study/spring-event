package jocture.springevent.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Custom2CommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info(">>> [임재진] run()");
    }
}
