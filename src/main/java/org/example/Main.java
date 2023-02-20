package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import static org.example.config.JpaQuery.doNameQuery;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        List result = doNameQuery(2);

        System.out.println("input value : " + result.get(0));
        System.out.println("result : " + result.get(1));
    }
}