package modelandviewtwo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import modelandviewtwo.bookstore.domain.User;
import modelandviewtwo.bookstore.domain.UserRepository;

@DataJpaTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userrepository;

    @Test
    public void findUserByUserName() {
        List<User> users = userrepository.findByUserName("bhj665");
        assertThat(users).hasSize(1);
        assertThat(users.get(0).getEmail()).isEqualTo("bhj665@myy.haaga-helia.fi");
    }

    @Test
    public void createUser() {
        User user = new User("bhj666", "2407481", "bhj666@myy.haaga-helia.fi", "Student");
        userrepository.save(user);
        assertThat(user.getId()).isNotNull();
    }

    @Test
    public void deleteUser() {
        userrepository.deleteByUserName("bhj666");
        assertThat(user.getId()).isNull();
    }
}
