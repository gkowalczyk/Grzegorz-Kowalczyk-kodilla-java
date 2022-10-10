package com.example.restapi.mapper;

import com.example.restapi.dto.PostDto;
import com.example.restapi.model.Post;

import java.util.List;
import java.util.stream.Collectors;


public class PostDtoMapper {

    private PostDtoMapper() {

    }

    public static List<PostDto> mapToPostDtoList(List<Post> posts) {
        return posts.stream()
                .map(post -> mapToPostDto(post))
                .collect(Collectors.toList());
    }

    public static PostDto mapToPostDto(Post post) {
        return new PostDto.PostDtoBuilder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .created(post.getCreated())
                .build();
    }
}
