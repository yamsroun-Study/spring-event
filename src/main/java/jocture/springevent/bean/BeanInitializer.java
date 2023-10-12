package jocture.springevent.bean;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component //@Controller, @Service, @Repository, @Bean, @Configuration
public class BeanInitializer {

    @PostConstruct //postConstruct(), setUp(), init()
    public void postConstruct() {
        log.info(">>> [임재진] postConstruct()");
    }
}
