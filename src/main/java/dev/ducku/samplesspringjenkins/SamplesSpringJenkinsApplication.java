package dev.ducku.samplesspringjenkins;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SamplesSpringJenkinsApplication {

    private static Logger logger = Logger.getLogger(SamplesSpringJenkinsApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(SamplesSpringJenkinsApplication.class, args);
        logger.info("Trying to log something out....");
    }

    @PostConstruct
    public void init() {
        logger.info("Logging statement.... 🤔");
    }

}
