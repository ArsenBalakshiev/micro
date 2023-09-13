package ru.scbt.baseservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
public class BaseServiceApplication {

    public static void main(String[] args) {
        System.out.println("-----ARGS-----");
        Arrays.stream(args).forEach(System.out::println);
        SpringApplication.run(BaseServiceApplication.class, args);
    }

}
