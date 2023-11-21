package com.tomson;

import com.tomson.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "Marian",
                        "mariam@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21


                )
		);
    }


}
