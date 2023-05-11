package com.kodilla.testing.statistics;

import java.util.Objects;

public class Post {

    private String postBody;
    private String author;

    public Post(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postBody='" + postBody + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(postBody, post.postBody) && Objects.equals(author, post.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postBody, author);
    }
}
