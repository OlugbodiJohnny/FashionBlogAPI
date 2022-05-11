package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories;


import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
}
