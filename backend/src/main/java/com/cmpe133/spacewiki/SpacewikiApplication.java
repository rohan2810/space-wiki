package com.cmpe133.spacewiki;

import com.cmpe133.spacewiki.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class SpacewikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpacewikiApplication.class, args);
    }

}
