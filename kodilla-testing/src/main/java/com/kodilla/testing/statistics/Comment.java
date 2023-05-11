package com.kodilla.testing.statistics;

import java.util.Objects;

public class Comment {


    private Post post;
    private String commentBody;
    private String author;

    public Comment(Post post, String commentBody, String author) {
        this.post = post;
        this.commentBody = commentBody;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(post, comment.post) && Objects.equals(commentBody, comment.commentBody) && Objects.equals(author, comment.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(post, commentBody, author);
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "post=" + post +
                ", commentBody='" + commentBody + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
