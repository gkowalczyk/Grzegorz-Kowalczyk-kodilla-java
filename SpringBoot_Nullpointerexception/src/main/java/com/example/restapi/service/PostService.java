package com.example.restapi.service;

import com.example.restapi.model.Post;
import com.example.restapi.repository.PostRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    //5  // 6
    // public List<Post> getPosts() {
    //        return postRepository.findAllPosts();
    //    }

    //7
    //8 musimy zparametryzować żeby pobierać odpowiednią stronę
    public List<Post> getPosts(int page){
        return postRepository.findAllPosts(PageRequest.of(page, 20));
    }

    public Post getSinglePost(long id) {
        return postRepository.findById(id).orElseThrow();
    }
}