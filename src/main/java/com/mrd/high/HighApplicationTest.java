package com.mrd.high;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
@SpringBootApplication
public class HighApplicationTest {
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(HighApplicationTest.class);
        builder
                .web(WebApplicationType.SERVLET)
                .profiles("prod")
                .run(args).start();
    }
}
