package com.kodilla.spring.library;

import com.kodilla.spring.library.InToPropClasses.LibraryDbController3;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


@SpringBootTest
class LibraryTestSuite {

  //  @Autowired//wyciąganie beanów przez metodę getBean()
   // private Library library;

    @Test
    void testLoadFromDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);
        //When
        library.loadFromDb();
        //Then
        //do nothing
    }

    @Test
    void testSaveToDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library library = context.getBean(Library.class);

        //When
        library.saveToDb();

        //Then
        //do nothing
    }
    @Test
    void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryDbController3.class);
        //When & Then
        System.out.println("=====Beans List:========");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("=====Beans List:========");
    }
    @Test
    void loadFromAndSaveDb() {

//library.loadFromDb();
//library.saveToDb();






    }
}

