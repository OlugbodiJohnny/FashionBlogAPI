package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories;


import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface PostRepository  extends JpaRepository<Post,Long> {

//    void delete(Optional<Post> post);
}
