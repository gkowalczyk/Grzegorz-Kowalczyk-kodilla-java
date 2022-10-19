package com.example.restapi.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
//@Builder
public final class PostDto {
    private final long id;
    private final String title;
    private final String content;
    private final LocalDateTime created;

    public PostDto(long id, String title, String content, LocalDateTime created) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.created = created;
    }


    public static class PostDtoBuilder {
        private long id;
        private String title;
        private String content;
        private LocalDateTime created;


        public PostDtoBuilder id(long id) {
            this.id = id;
            return this;
        }

        public PostDtoBuilder content(String content) {
            this.content = content;
            return this;
        }

        public PostDtoBuilder created(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public PostDtoBuilder title(String title) {
            this.title = title;
            return this;
        }

        public PostDto build() {
            return new PostDto(id, title, content, created);
        }
    }


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                '}';
    }
}