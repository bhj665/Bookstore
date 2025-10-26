package modelandviewtwo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import modelandviewtwo.bookstore.domain.Category;
import modelandviewtwo.bookstore.domain.CategoryRepository;

@DataJpaTest
public class CategoryRepositoryTests {
    @Autowired
    private CategoryRepository categoryrepository;

    @Test
    public void findCategoryByName() {
        List<Category> categories = categoryrepository.findByName("Scifi");
        assertThat(categories).hasSize(1);
        assertThat(categories.get(0).getCategoryId()).isEqualTo(1);
    }

    @Test
    public void createCategory() {
        Category category = new Category(2, "Comic");
        categoryrepository.save(category);
        assertThat(category.getId()).isNotNull();
    }

    @Test
    public void deleteCategory() {
        categoryrepository.deleteByName("Comic");
        assertThat(category.getId()).isNull();
    }
}
