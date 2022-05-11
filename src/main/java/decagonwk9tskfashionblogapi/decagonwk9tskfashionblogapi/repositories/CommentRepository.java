package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
