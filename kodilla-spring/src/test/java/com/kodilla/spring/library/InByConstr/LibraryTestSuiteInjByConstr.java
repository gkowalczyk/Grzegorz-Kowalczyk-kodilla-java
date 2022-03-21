package com.kodilla.spring.library.InByConstr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class LibraryTestSuiteInjByConstr {

    @Test
    void loadFromDb() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library1 library = applicationContext.getBean(Library1.class);
        //When
        library.loadFromDb();
    }
    @Test
    void testSaveToDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library1 library = context.getBean(Library1.class);

        //When
        library.saveToDb();

        //Then
        //do nothing
    }
}
