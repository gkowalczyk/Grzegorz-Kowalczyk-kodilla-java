package com.example.restapi.model;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity //dla Hibernate

public class Post {
    public Post() {

    }

    public Post(long id, String title, String content, LocalDateTime created) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.created = created;
    }

    private long id;
    private String title;
    private String content;
    private LocalDateTime created;
    private List<Comment> comment;
    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    //FetchType.LAZY  – pobieramy dane dopiero wtedy, gdy ich potrzebujemy. W praktyce wtedy, gdy użyjemy gettera na powiązanej kolekcji, Hibernate wykonuje zapytanie do bazy danych.
//FetchType.EAGER – pobieramy dane, gdy zostaje wykonane zapytanie pobierające nadrzędną część relacji.
    @OneToMany(fetch = FetchType.LAZY)
   @JoinColumn(name = "postId")
    public List<Comment> getComment() {
        return comment;


    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

   /* @OneToMany
    @JoinColumn(name = "postID")

*/

}
