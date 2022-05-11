package decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.repositories;

import decagonwk9tskfashionblogapi.decagonwk9tskfashionblogapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String name);
}
