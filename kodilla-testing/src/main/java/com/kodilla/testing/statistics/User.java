package com.kodilla.testing.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String realName;
    private final List<Post> postList = new ArrayList<>();
    private final List<Comment> commentList = new ArrayList<>();

    public User(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public long getPostCount() {

        return postList.stream().count();
    }

    public long getCommentCount() {

        return commentList.stream().count();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", postList=" + postList +
                ", commentList=" + commentList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(realName, user.realName) && Objects.equals(postList, user.postList) && Objects.equals(commentList, user.commentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, realName, postList, commentList);
    }
}
