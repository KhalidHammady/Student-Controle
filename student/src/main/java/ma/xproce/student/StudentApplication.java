package ma.xproce.student;

import ma.xproce.student.dao.entities.Student;

import ma.xproce.student.dao.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }


    @Bean
    CommandLineRunner start(StudentRepository studentRepository){
        return  args -> {

            List<Student> students = List.of(
                    Student.builder().name("khalid").dateNaissance("2001-01-01").email("khalid@gamil.com").build(),
                    Student.builder().name("youssef").dateNaissance("2002-02-02").email("youssef@gamil.com").build(),
                    Student.builder().name("aziz").dateNaissance("2002-02-02").email("aziz@gamil.com").build(),
                    Student.builder().name("omar").dateNaissance("2002-02-02").email("omar@gmail.com").build()

                    );

            studentRepository.saveAll(students);
        };



//
        };
    }

