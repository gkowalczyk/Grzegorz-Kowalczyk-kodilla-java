package com.kodilla.testing.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StatisticsCalculatorTest {


    @Mock
    private Statistics statisticsMock;
    @InjectMocks
    private StatisticsCalculator statisticsCalculator;

     public List<String> generateUserList(int count) {
         List<String> userList = new ArrayList<>();
         for(int n = 1 ; n <= count; n++) {
             String user = "Name"  + n + "Surname" + n;
             userList.add(user);
         }
         return userList;
     }

    @Test
    void getUserCount() {

        //Given
        //  StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        List<String> userList = new ArrayList<>();
        String user1 = new String("Jan Kowalski");
        String user2 = new String("Piotr Kowalski");
        userList.add(user1);
        userList.add(user2);
        //when
        when(statisticsMock.userNames()).thenReturn(userList);
        Long usersCount = statisticsCalculator.getUserCount();
        //Then
        assertEquals(usersCount, 2);
        verify(statisticsMock, atLeast(1)).userNames();
        System.out.println(usersCount);

    }


    @Test
    void getPostsCount() {

        //Given
        //  StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        List<String> userList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();
        List<Comment> commentList = new ArrayList<>();

        String user1 = new String("Jan Kowalski");
        String user2 = new String("Piotr Kowalski");
        userList.add(user1);
        userList.add(user2);
        Post post1 = new Post("post body", "Jan Kowalski");
        Post post2 = new Post("post body1", "Jan Kowalski");
        postList.add(post1);
        postList.add(post2);
        Comment comment1 = new Comment(post1, "comment body", "Piotr Kupisza");
        commentList.add(comment1);


        //when
        when(statisticsMock.postsCount()).thenReturn(postList.size());
        int postsCount = statisticsCalculator.getPostsCount();
        //Then
        assertEquals(postsCount, 2);
        verify(statisticsMock, atLeast(1)).postsCount();
        System.out.println(postsCount);


    }

    @Test
    void getCommentsCount() {

        //Given
        //  StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        List<String> userList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();
        List<Comment> commentList = new ArrayList<>();

        String user1 = new String("Jan Kowalski");
        String user2 = new String("Piotr Kowalski");
        userList.add(user1);
        userList.add(user2);
        Post post1 = new Post("post body", "Jan Kowalski");
        Post post2 = new Post("post body1", "Jan Kowalski");
        postList.add(post1);
        postList.add(post2);
        Comment comment1 = new Comment(post1, "comment body", "Piotr Kupisza");
        commentList.add(comment1);


        //when
        when(statisticsMock.commentsCount()).thenReturn(commentList.size());
        int commentsCount = (int) statisticsCalculator.getCommentCount();

        //Then
        assertEquals(commentsCount, 1);

        System.out.println(commentsCount);


    }

    @Test
    void getAveragePostByUser() {

        //Given
        //  StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);
        List<String> userList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();
        List<Comment> commentList = new ArrayList<>();

        String user1 = new String("Jan Kowalski");
        String user2 = new String("Piotr Kowalski");
        userList.add(user1);
        userList.add(user2);
        Post post1 = new Post("post body", "Jan Kowalski");
        Post post2 = new Post("post body1", "Jan Kowalski");
        postList.add(post1);
        postList.add(post2);
        Comment comment1 = new Comment(post1, "comment body", "Piotr Kupisza");
        commentList.add(comment1);


        //when
        when(statisticsMock.postsCount()).thenReturn(postList.size());
        when(statisticsMock.userNames()).thenReturn(userList);
        int postsCount = statisticsCalculator.getPostsCount();
        Long usersCount = statisticsCalculator.getUserCount();
        int result = (int) (postsCount / usersCount);
        int result1 = statisticsCalculator.getPostByUser();
        System.out.println(result1);
        System.out.println(result);

        //Then
        assertEquals(result, 1);
    }

    }
