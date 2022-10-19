package com.example.restapi.repository;

import com.example.restapi.model.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    @Override
    Optional<Post> findById(Long id);




//1
    //https://www.baeldung.com/spring-data-jpa-query
    //JPQL to skrót od Java Persistence Query Language
    //@Query("select p FROM Post p  where title = :title")
    //List<Post> findAllByTitle(@Param("title") String title);

    // używamy jeśli potrzeba połączenia table z db

//2
  // List<Post> findAllByTitle(String title);
    //zamiast powyższego możemy zapisać List<Post> findAllByTitle(String title);
    //Spring Data JPA Query Creation udostępnia konwenvcję nazewniczą do metod
    //https://docs.spring.io/spring-data/jpa/docs/1.6.0.RELEASE/reference/html/repository-query-keywords.html

//3     rozwiązanie problemu  N+1 zapytań  i stronicowanie wyników
    //PA posiada dyrektywę join fetch, która nakazuje bibliotece zrobić
    // dokładnie to, czego chcemy. W tym samym zapytaniu, w
    // którym ładujemy zamówienie, prosimy od razu o dane o pozycjach


//4     @Query("Select p From Post p" +
  //         " join fetch p.comment")  // left join wszystkie posty bez komentarzy
   // List<Post> findAllPosts(); // własna metod


//5     i stronicowanie wyników, zwraca daną ilość
//@Query("Select p From Post p" +
   //     " join fetch p.comment")  // left join wszystkie posty bez komentarzy
//List<Post> findAllPosts(Pageable p); // własna metod

    // ze względu na HHH000104: firstResult/maxResults specified with collection fetch; applying in memory!
    //i przy dużej bazie przycinanie danych może być prolematyczne, pobierane są wszytkie zapytania
    //a pożniej przycinane w pamięci
    //stąd działanie w pkt 6

   //6 // pojawia się limit ? czyli ograniczenie ilości rekordów od strony DB ,ale wracamy do problemu N+1
   //@Query("Select p From Post p"
  //         )  // left join wszystkie posty bez komentarzy
  // List<Post> findAllPosts(Pageable p); // własna metod

    //7 kontunuujać pkt 6 tworzymy PostDto, bez pola komentarzy

 // 8  jesli musimy pobrać post i comment stronicujemy wykonując 2 zapytania , pierwsze
    //post , a później comment

   /* @Query("Select p From Post p")
            // left join wszystkie posty bez komentarzy
    List<Post> findAllPosts(Pageable p); // własna metod
*/

    //9   stronnicowanie dwóch tabel  i sortowanie wyników , njbardziej
// wydajny sposób

     @Query("Select p From Post p")
            // left join wszystkie posty bez komentarzy
     List<Post> findAllPosts(Pageable p); // własna metod


}