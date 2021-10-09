package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;


public class ForumTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }
@AfterEach
public void after() {
    System.out.println("Test case : end");
}
@BeforeAll
public static void beforerAll() {
    System.out.println("Test suite: begin");
}
@AfterAll
public static void afterAll() {
    System.out.println("Test suite: end");
}
    @DisplayName(
            "When created SimpleUser with realname, " +
                    "then getRealName should return real name")
@Test

    public void testCaseRealname() {

        //given
        SimpleUser simpleUser = new SimpleUser("forum USer", "Grzesiek");

        //when
        String result = simpleUser.getRealName();

        System.out.println("Testing:" + result);

        //Then
        Assertions.assertEquals("Grzesiek", result);
    }
        @DisplayName("when create SimpleUser with name, " +
                "then getUsername should return correct name"
        )
        @Test
        void testCaseUsername() {
            //Given
            SimpleUser simpleUser = new SimpleUser("forum USer", "John Smith");

            //When
            String expectedResult = simpleUser.getUsername();
            System.out.println("Testing:" + expectedResult);
            //Then
            Assertions.assertEquals("forum USer", expectedResult);
        }
    }