package com.example.restapi.controller;

import com.example.restapi.dto.PostDto;
import com.example.restapi.mapper.PostDtoMapper;
import com.example.restapi.model.Post;
import com.example.restapi.service.PostService;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

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
    public List<PostDto> getPosts(@RequestParam(required = false) int page, Sort.Direction sort) {
        int pageNumber = page >= 0 ? page : 0;
        return PostDtoMapper.mapToPostDtoList(postService.getPosts(pageNumber, sort));
    }


    @GetMapping("/posts/comments") // najbardziej optymalne do zwracania list komentarzy i posts
    public List<Post> getPostsComments(@RequestParam(required = false) int page, Sort.Direction sort) {
        int pageNumber = page >= 0 ? page : 0;
        return postService.getPostsComment(pageNumber, sort);
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

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post) {
        return postService.addPost(post);
    }

    @PutMapping
    public Post editPost(@RequestBody Post post) {
        return postService.edit(post);
    }
@DeleteMapping
     public void deletePost(@PathVariable long id ){
postService.deletePost(id);
     }
}
