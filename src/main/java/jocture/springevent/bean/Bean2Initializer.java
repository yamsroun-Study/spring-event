package jocture.springevent.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Bean2Initializer implements InitializingBean {
    
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info(">>> [임재진] afterPropertiesSet()");
    }
}
