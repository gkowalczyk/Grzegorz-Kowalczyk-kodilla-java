package com.kodilla.stream.forum;

import com.kodilla.stream.forumuser.ForumUser;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUsers {
    private final String username;
    private final String realName;
    private final String location;
    private final Set<ForumUsers> friends = new HashSet<>();

    public ForumUsers(final String username, final String realName,
                      final String location) {
        this.username = username;
        this.realName = realName;
        this.location = location;
    }

    public void addFriend(ForumUsers user) {
        friends.add(user);
    }

    public boolean removeFriend(ForumUsers user) {

        return friends.remove(user);
    }

    public Set<String> getLocationOfFriend() {
        return friends.stream()

                .map(ForumUsers::getLocation) //friend -> friend.getLocation()
                .collect(Collectors.toSet());
    }

    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()
                .flatMap(user -> user.getFriends().stream())
                .filter(user -> user != this)
                .map(ForumUsers::getLocation) //friend -> friend.getLocation()
                .collect(Collectors.toSet());
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUsers> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + username + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUsers)) return false;
        ForumUsers forumUser = (ForumUsers) o;
        return username.equals(forumUser.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

}
