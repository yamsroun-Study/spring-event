package jocture.springevent.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringEventHandler {

    @EventListener(ApplicationStartingEvent.class)
    public void starting() {
        log.info(">>> [임재진] starting()");
    }

    @EventListener(ApplicationStartedEvent.class)
    public void started() {
        log.info(">>> [임재진] started()");
    }

    @EventListener(ApplicationReadyEvent.class)
    public void ready() {
        log.info(">>> [임재진] ready()");
    }
}
