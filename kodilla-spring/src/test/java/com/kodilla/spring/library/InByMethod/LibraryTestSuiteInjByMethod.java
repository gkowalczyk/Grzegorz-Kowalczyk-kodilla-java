package com.kodilla.spring.library.InByMethod;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class LibraryTestSuiteInjByMethod {

    @Test
    void loadFromDb() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library2 library = applicationContext.getBean(Library2.class);
        //When
        library.loadFromDb();
    }
    @Test
    void testSaveToDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library2 library = context.getBean(Library2.class);

        //When
        library.saveToDb();

        //Then
        //do nothing
    }
}
