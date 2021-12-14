package com.kodilla.spring.forum;

import com.kodilla.spring.library.LibraryDbController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ForumUser.class)
public class ForumUserTestSuite {

    @Test
    public void testGetUserName() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = applicationContext.getBean(ForumUser.class);
        //When
        String name = forumUser.getName();
        //Then
        assertEquals("John Smith", name);
        System.out.println(name);
    }
}
