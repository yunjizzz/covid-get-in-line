package com.yunji.covidgetinline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class CovidGetInLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CovidGetInLineApplication.class, args);
    }

}
