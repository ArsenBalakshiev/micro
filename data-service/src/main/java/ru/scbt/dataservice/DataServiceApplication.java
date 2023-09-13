package ru.scbt.dataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
public class DataServiceApplication {

    public static void main(String[] args) {
        System.out.println("-----ARGS-----");
        Arrays.stream(args).forEach(System.out::println);
        SpringApplication.run(DataServiceApplication.class, args);
    }

}
