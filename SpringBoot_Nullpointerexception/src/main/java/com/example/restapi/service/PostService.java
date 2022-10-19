package com.example.restapi.service;

import com.example.restapi.model.Comment;
import com.example.restapi.model.Post;
import com.example.restapi.repository.CommentRepository;
import com.example.restapi.repository.PostRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public PostService(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
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

    public List<Post> getPostsComment(int page){
        List<Post> posts = postRepository.findAllPosts(PageRequest.of(page, 20));

       List<Long> longListId = posts.stream()
               .map(Post::getId)
               .collect(Collectors.toList());
        List<Comment> commentList = commentRepository.findAllByPostIdIn(longListId); // lista komentarzy dla listy id postów
       posts.forEach( post -> post.setComment(commentList.stream().filter(comment -> comment.getPostId() == post.getId()).collect(Collectors.toList())));
return posts;
    }
  public List<Comment> listCommentToFilter (List<Comment> list , long id) {
        return list.stream()
                .filter(comment -> comment.getPostId() == id)
                .collect(Collectors.toList());

  }

}