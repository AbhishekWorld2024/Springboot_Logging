package com.example.Springboot_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger= LoggerFactory.getLogger(LoggingController.class);
    @RequestMapping("/log")
    public void Seelogs(){
        logger.warn("This is the warning message");
        logger.debug("Debug is ongoing");
        logger.info("This is the Springboot application");
        logger.error("Application is not working");
    }
}
