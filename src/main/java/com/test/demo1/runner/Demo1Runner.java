package com.test.demo1.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Huawei
 */
@Component
public class Demo1Runner implements ApplicationRunner {
    private static final Logger logger = LoggerFactory.getLogger(Demo1Runner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 0; i < 60; i++) {
            Thread.sleep(1000);
            logger.info("Demo1Runner " + i);
        }
    }
}
