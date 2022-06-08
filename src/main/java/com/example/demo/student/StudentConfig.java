package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student izzat = new Student("Izzat Ramazanli", "izzat@gmail.com",
                    LocalDate.of(2002, Month.MAY, 28));

            Student alex = new Student("Alex Alexli", "alex@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 14));

            repository.saveAll(List.of(izzat, alex));
        };
    }
}
