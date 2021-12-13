package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

    @Test
    public void testGetUserName() {
        //Given
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = applicationContext.getBean(ForumUser.class);
        //When
        String name = forumUser.getName();
        //Then
        Assert.assertEquals("John Smith", name);
    }
}
