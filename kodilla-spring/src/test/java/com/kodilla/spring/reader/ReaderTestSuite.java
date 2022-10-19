package com.kodilla.spring.reader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ReaderTestSuite {
/*@Autowired
Reader reader;*/
    @Test
    void testRead() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ReaderConfig.class);
Reader reader = context.getBean(Reader.class);
//When and Then
        reader.read();
    }
    @Test
    void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext();
        //When
        boolean book2Exists = context.containsBean("book2");
        //Then
        System.out.println("Bean book2 was found in the container: " + book2Exists);
    }
}
