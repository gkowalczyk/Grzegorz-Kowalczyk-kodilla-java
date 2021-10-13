package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {

    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<>();
    private List<ForumComment> comments = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }
    public void addPost(String author,String postBody) {
ForumPost thePost = new ForumPost(postBody,author);
posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author,String commentBody ) {
ForumComment theComment = new ForumComment(thePost,commentBody,author);
comments.add(theComment);
    }
    public int getPostsQuantity() {
        return posts.size();
    }
    public int getCommentsQuantity() {
        return comments.size();
    }
    public ForumPost getPosts(int postNumber) {
        if (postNumber >= 0 && postNumber < posts.size()) {
            return posts.get(postNumber);

        }
        return null;
    }
    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if (commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }
    public boolean removePost(ForumPost thePost) {              // [30]
        boolean result = false;
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            result = true;
        }
             return result;                                      // [31]
    }                                                           // [32]

    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }                                                           // [35]

    public String getName() {                                   // [36]
        return name;                                             // [37]
    }                                                           // [38]

    public String getRealName() {                               // [39]
        return realName;                                         // [40]
    }

}




