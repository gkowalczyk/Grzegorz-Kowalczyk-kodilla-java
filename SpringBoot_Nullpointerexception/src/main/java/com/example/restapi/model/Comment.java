package com.example.restapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

// BatchSize(size=5)  Spowoduje to, że powiązane encje będą pobierane porcjami.
@Entity
public class Comment {

    private long id;
    private long postId;
    private String content;
    private LocalDateTime created;


    public Comment(long id, long postId, String content, LocalDateTime created) {
        this.id = id;
        this.postId = postId;
        this.content = content;
        this.created = created;
    }



    public Comment() {

    }
     @Id
     public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }
}
