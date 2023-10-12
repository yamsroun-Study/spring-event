package jocture.springevent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringEventApplication {

    public static void main(String[] args) {
        //log.info(">>> [임재진] main() 111");
        SpringApplication.run(SpringEventApplication.class, args);
        //log.info(">>> [임재진] main() 222");
    }

}
