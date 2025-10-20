package modelandviewtwo.bookstore.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
    // List<Category> findByCategoryid(int categoryid);
    List<Category> findByName(String name);
}
