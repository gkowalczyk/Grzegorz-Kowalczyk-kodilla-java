package forum;

import com.kodilla.stream.forum.ForumUsers;
import com.kodilla.stream.invoice.simple.SimpleInvoice;
import com.kodilla.stream.invoice.simple.SimpleItem;
import com.kodilla.stream.invoice.simple.SimpleProduct;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForumUserTestSuite {

    @Test
    void testGetLocationsOfFriend() {
        //Given
        ForumUsers user1 = new ForumUsers("alan01", "Alan Kosovsky", "Washington");
        ForumUsers user2 = new ForumUsers("ethanreard", "Ethan Reard", "Miami");
        ForumUsers user3 = new ForumUsers("eRiK", "Erik Hull", "Key West");
        ForumUsers user4 = new ForumUsers("booth", "Mya Booth", "Washington");
        ForumUsers user5 = new ForumUsers("nicole1987", "Nicole Lee", "Orlando");
        ForumUsers user6 = new ForumUsers("nobody", "Briana Williams", "Miami");
        ForumUsers user7 = new ForumUsers("bigmac", "Robert Macdonald", "Washington");
        ForumUsers user8 = new ForumUsers("thebigone", "Clay Small", "Orlando");
        ForumUsers user9 = new ForumUsers("user121212", "Marisa Frank", "Washington");
        ForumUsers user10 = new ForumUsers("lawyer", "Lexie John", "Miami");

        //When
        //Create relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //Create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //Create relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //Create relations for user10
        user10.addFriend(user1);
        //Create relations for user2
        user2.addFriend(user3);
        //Create relations for user9
        user9.addFriend(user3);
//Then
        assertEquals(3, user1.getLocationOfFriend().size());
        assertTrue(user1.getLocationOfFriend().contains("Key West"));
        assertTrue(user1.getLocationOfFriend().contains("Key West"));
        assertTrue(user1.getLocationOfFriend().contains("Washington"));
        assertTrue(user1.getLocationOfFriend().contains("Miami"));
        assertFalse(user1.getLocationOfFriend().contains("Orlando"));
        System.out.println(user1.getLocationOfFriend());
    }

    @Test
    void testGetLocationsOfFriendsOfFriends() {
        //Given
        //Create users
        ForumUsers user1 = new ForumUsers("alan01", "Alan Kosovsky", "Washington");
        ForumUsers user2 = new ForumUsers("ethanreard", "Ethan Reard", "Miami");
        ForumUsers user3 = new ForumUsers("eRiK", "Erik Hull", "Key West");
        ForumUsers user4 = new ForumUsers("booth", "Mya Booth", "Washington");
        ForumUsers user5 = new ForumUsers("nicole1987", "Nicole Lee", "Orlando");
        ForumUsers user6 = new ForumUsers("nobody", "Briana Williams", "Miami");
        ForumUsers user7 = new ForumUsers("bigmac", "Robert Macdonald", "Washington");
        ForumUsers user8 = new ForumUsers("thebigone", "Clay Small", "Orlando");
        ForumUsers user9 = new ForumUsers("user121212", "Marisa Frank", "Washington");
        ForumUsers user10 = new ForumUsers("lawyer", "Lexie John", "Miami");

        //When
        //Create relations for user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);
        //Create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user7);
        user3.addFriend(user2);
        user3.addFriend(user9);
        //Create relations for user7
        user7.addFriend(user1);
        user7.addFriend(user3);
        //Create relations for user10
        user10.addFriend(user1);
        //Create relations for user2
        user2.addFriend(user3);
        //Create relations for user9
        user9.addFriend(user3);
//Then
    assertEquals(3, user1.getLocationsOfFriendsOfFriends().size());
        assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Key West"));
        assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Washington"));
        assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Miami"));
        assertFalse(user1.getLocationsOfFriendsOfFriends().contains("Orlando"));
        System.out.println(user1.getLocationsOfFriendsOfFriends());
        }
@Test
    void testGetValueToPay() {
        //Given
    SimpleInvoice simpleInvoice = new SimpleInvoice();
    //When
    simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product 1",17.28),2.0));
    simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
    simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));
    //Then
    assertEquals(108.975,simpleInvoice.getValueToPay(),0.001);







}
}