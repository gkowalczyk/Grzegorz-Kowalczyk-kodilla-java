package com.example.restapi.service;

import com.example.restapi.model.Comment;
import com.example.restapi.model.Post;
import com.example.restapi.repository.CommentRepository;
import com.example.restapi.repository.PostRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    public List<Post> getPosts(int page, Sort.Direction sort) {
        return postRepository.findAllPosts(PageRequest.of(page, 20, Sort.by(sort, "id")));
    }

    @Cacheable (cacheNames = "SinglePost", key = "#id")
    public Post getSinglePost(long id) {
        return postRepository.findById(id).orElseThrow();
    }
    //Cashowanie to technika która pozwala przyspieszyć operację poprzez zapisanie ich
//wyników na pewnien czas w pamięci np odczyt z bazy danych . Cash to np pamięć RAM
//Jeśli nie mamy cash dane np z bazy danych są pobierane przy każdym żądaniu
    //Domyślnie dane zapisywane są w ConcurrentMapCasch ale nie ma możliwości zarządzani danymi
    //Aby zarządzać cash korzystamy z providerów
    @Cacheable(cacheNames = "PostsWithComments")
    public List<Post> getPostsComment(int page, Sort.Direction sort) {
        List<Post> posts = postRepository.findAllPosts(PageRequest.of(page, 20, Sort.by(sort, "id")));

        List<Long> longListId = posts.stream()
                .map(Post::getId)
                .collect(Collectors.toList());
        List<Comment> commentList = commentRepository.findAllByPostIdIn(longListId); // lista komentarzy dla listy id postów
        posts.forEach(post -> post.setComment(commentList.stream().
                filter(comment -> comment.getPostId() == post.getId())
                .collect(Collectors.toList())));
        return posts;
    }

    public List<Comment> listCommentToFilter(List<Comment> list, long id) {
        return list.stream()
                .filter(comment -> comment.getPostId() == id)
                .collect(Collectors.toList());

    }

    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    @CachePut (cacheNames = "SinglePost", key = "#result.id")  // wykorzystanie w sytuacji gdy aktualizujemy wpisy , gdy wywołujemy metodę zapisywana jest
    //do casche
    @Transactional
    public Post edit(Post post) {
        Post edit = postRepository.findById(post.getId()).orElseThrow(); //jedna transkacja
        edit.setTitle(post.getTitle());
        edit.setContent(post.getContent());
        // return postRepository.save(post); // druga transakcja
        return edit; // Hibernate sam aktulizuje pole w ramach transkacji
    }
@CacheEvict(cacheNames = "SinglePost")  // usuwanie cash z postem
    public void deletePost(long id) {
        postRepository.deleteById(id);
    }


}

