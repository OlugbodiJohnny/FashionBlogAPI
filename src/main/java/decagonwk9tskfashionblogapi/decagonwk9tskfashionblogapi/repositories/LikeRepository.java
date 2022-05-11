package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikeRepository extends JpaRepository<Likes,Long> {
    Optional<Likes> findByAdmin_IdAndPost_Id(Long adminId, Long postId);
//    Optional<Likes> findByMember_IdAndPost_Id(Long memberId, Long postId);
}
