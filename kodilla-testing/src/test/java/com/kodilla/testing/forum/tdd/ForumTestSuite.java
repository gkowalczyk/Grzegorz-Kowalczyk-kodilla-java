package com.kodilla.testing.forum.tdd;


import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;


@DisplayName("TDD: Forum Test Suite \uD83D\uDE31")
class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName ("tests for posts")
    class TestPost {

        @Test
        void testAddPost() {
            //Given
            ForumUser forumuser = new ForumUser("mrssmith", "John Smith");
            //When
            forumuser.addPost("msrsmith", "Hello everyone, this is my first contribution here!");
            //Then
            Assertions.assertEquals(1, forumuser.getPostsQuantity());
        }

        @Test
        void testAddComment() {
            //Given
            ForumUser forumuser = new ForumUser("mrssmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            //When
            forumuser.addComment(thePost, "mrssmith", "Thank you for all good words!");
            //Then
            Assertions.assertEquals(1, forumuser.getCommentsQuantity());
        }

        @Test
        void testGetPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //When
            ForumPost retrievedPost;
            retrievedPost = forumUser.getPosts(0);
            //Then
            Assertions.assertEquals(thePost, retrievedPost);
        }

        @Test
        void testGetComment() {
            //Given
            ForumUser forumuser = new ForumUser("mrssmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone this is my first contribution here!", "mrssmith");
            ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrssmith");
            forumuser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
            //when
            ForumComment retrievedComment = forumuser.getComment(0);
            //Then
            Assertions.assertEquals(theComment, retrievedComment);
        }

        @Test
        void testRemovePostNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            //When
            boolean result = forumUser.removePost(thePost);
            //Then
            Assertions.assertFalse(result);

        }

        @Test
        void testRemoveCommentNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith",
                    "Thank you for all good words!");

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertFalse(result);

        }

        @Test
        void testRemovePost() {
            //given
            ForumUser forumuser = new ForumUser("mrssmith", "John Smith");
            ForumPost thePost = new ForumPost("this is my first contribution here", "mrssmith");
            forumuser.addPost(thePost.getAuthor(), thePost.getPostBody());
            //when
            boolean result = forumuser.removePost(thePost);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumuser.getPostsQuantity());
        }

        @Test
        void testRemoveComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith",
                    "Thank you for all good words!");
            forumUser.addComment(thePost, theComment.getAuthor(),
                    theComment.getCommentBody());

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, forumUser.getCommentsQuantity());
        }

    }
}