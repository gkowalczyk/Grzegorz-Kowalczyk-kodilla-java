package com.example.restapi.controller;

import com.example.restapi.dto.PostDto;
import com.example.restapi.mapper.PostDtoMapper;
import com.example.restapi.model.Post;
import com.example.restapi.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // 1 - 5
   /* @GetMapping("/posts")
    public List<PostDto> getPosts() {
        return postService.getPosts();
    }*/
    //7
   // @GetMapping("/posts")
    //public List<PostDto> getPosts() {
// return PostDtoMapper.mapToPostDtoList(postService.getPosts());

//8
        @GetMapping("/posts")
        public List<PostDto> getPosts(@RequestParam(required = false) int page) {
            int pageNumber = page >= 0 ? page : 0;
            return PostDtoMapper.mapToPostDtoList(postService.getPosts(pageNumber));


    }
    @GetMapping("/posts/comments") // najbardziej optymalne do zwracania list komentarzy i posts
    public List<Post> getPostsComments(@RequestParam(required = false) int page) {
        int pageNumber = page >= 0 ? page : 0;
        return postService.getPostsComment(pageNumber);


    }

    @GetMapping("/post/{id}")
    public Post getPost(@PathVariable long id) {
        return postService.getSinglePost(id);
        //Lazy loading - Hipernate pobiera posty a później zapytanie o
       // komentarze CO JEST NIEOPTYMALNE !!!
//https://nullpointerexception.pl/trzy-rzeczy-ktore-powinienes-wiedziec-o-hibernate/
        //Hibernate: select post0_.id as id1_1_0_, post0_.content as content2_1_0_, post0_.created as created3_1_0_, post0_.title as title4_1_0_ from post post0_ where post0_.id=?
        //Hibernate: select comment0_.post_id as post_id4_0_0_, comment0_.id as id1_0_0_, comment0_.id as id1_0_1_, comment0_.content as content2_0_1_, comment0_.created as created3_0_1_ from comment comment0_ where comment0_.post_id=?

    }

}
