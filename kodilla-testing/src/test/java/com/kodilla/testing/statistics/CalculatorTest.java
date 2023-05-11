package com.kodilla.testing.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculatorTest {


    @Mock
    private Statistics statisticsMock;
    @InjectMocks
    private Calculator calculator;

    @BeforeEach
    public void beforeEveryTest() {
        List<String> userList = new ArrayList<>();
        for (int n = 1; n <= 10; n++) {
            String user = "Name" + n + "Surname" + n;
            userList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(30);
    }

    @Test
    void testCalculateAdvStatisticsWithZeroPosts() {


        //when
        when(statisticsMock.postsCount()).thenReturn(0);
        calculator.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(0, calculator.calculateAvgCommentsByPostQty());
        Assertions.assertEquals(0, calculator.calculateAvgPostsByUserQty());
        Assertions.assertEquals(3, calculator.calculateAvgCommentsByUserQty());
    }

    @Test
    void testCalculateAdvStatisticsWith1000Posts() {


        //when
        when(statisticsMock.postsCount()).thenReturn(1000);
        calculator.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(0.03, calculator.calculateAvgCommentsByPostQty());
        Assertions.assertEquals(100.0, calculator.calculateAvgPostsByUserQty());
        Assertions.assertEquals(3.0, calculator.calculateAvgCommentsByUserQty());
    }

    @Test
    void testCalculateAdvStatisticsWith0Comments() {


        //when
        when(statisticsMock.postsCount()).thenReturn(1000);
        calculator.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(0.03, calculator.calculateAvgCommentsByPostQty());
        Assertions.assertEquals(100.0, calculator.calculateAvgPostsByUserQty());
        Assertions.assertEquals(3.0, calculator.calculateAvgCommentsByUserQty());
    }

    @Test
    void testCalculateAdvStatisticsWithPostsIsMoreThanComments() {


        //when
        when(statisticsMock.postsCount()).thenReturn(1000);
        calculator.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(0.03, calculator.calculateAvgCommentsByPostQty());
        Assertions.assertEquals(100, calculator.calculateAvgPostsByUserQty());
        Assertions.assertEquals(3, calculator.calculateAvgCommentsByUserQty());
    }

    @Test
    void testCalculateAdvStatisticsWithCommentsIsMoreThanPosts() {


        //when
        when(statisticsMock.postsCount()).thenReturn(10);
        calculator.calculateAdvStatistics(statisticsMock);

        //then
        Assertions.assertEquals(3.0, calculator.calculateAvgCommentsByPostQty());
        Assertions.assertEquals(1.0, calculator.calculateAvgPostsByUserQty());
        Assertions.assertEquals(3.0, calculator.calculateAvgCommentsByUserQty());
    }

    @Test
    void testCalculateAdvStatisticsWithUsersEqual0() {

        //when
        List<String> list = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(list);
        calculator.calculateAdvStatistics(statisticsMock);
        //then
        Assertions.assertEquals(1.5, calculator.calculateAvgCommentsByPostQty());
        Assertions.assertEquals(0, calculator.calculateAvgPostsByUserQty());
        Assertions.assertEquals(0, calculator.calculateAvgCommentsByUserQty());
    }

    @Test
    void testCalculateAdvStatisticsWithUsersEqual100() {


        //when
        List<String> list = new ArrayList<>();
        when(statisticsMock.userNames()).thenReturn(list);
        calculator.calculateAdvStatistics(statisticsMock);

        //then

        Assertions.assertEquals(1.5, calculator.calculateAvgCommentsByPostQty());
        Assertions.assertEquals(0, calculator.calculateAvgPostsByUserQty());
        Assertions.assertEquals(0, calculator.calculateAvgCommentsByUserQty());
    }
}