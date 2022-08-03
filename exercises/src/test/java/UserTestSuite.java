import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void UserTestSuiteBuilder() {
        User user = new User.Builder()
                .id(1L)
                .name("Pablo")
                .lastName("Escabo")
                .login("admin")
                .email("pablo@example.com")
                .password("admin")
                .build();

        System.out.println(user);
    }
}