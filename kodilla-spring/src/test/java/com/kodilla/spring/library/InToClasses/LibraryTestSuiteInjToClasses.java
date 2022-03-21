package com.kodilla.spring.library.InToClasses;

import com.kodilla.spring.library.InToPropClasses.Library3;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class LibraryTestSuiteInjToClasses {

    @Test
    void loadFromDb() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library3 library = applicationContext.getBean(Library3.class);
        //When
        library.loadFromDb();
    }
    @Test
    void testSaveToDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Library3 library = context.getBean(Library3.class);

        //When
        library.saveToDb();

        //Then
        //do nothing
    }
}
