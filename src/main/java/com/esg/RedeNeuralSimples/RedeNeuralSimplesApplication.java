package com.esg.RedeNeuralSimples;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Arrays;

@SpringBootApplication
public class RedeNeuralSimplesApplication {

    private static Logger logger = LoggerFactory.getLogger(RedeNeuralSimplesApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RedeNeuralSimplesApplication.class, args);
    }

}
