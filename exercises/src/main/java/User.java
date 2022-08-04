

public class User {
    private Long id;
    private String name;
    private String lastName;
    private String login;
    private String email;
    private String password;

    public User(Long id, String name, String lastName, String login, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder {
        
        private Long id;
        private String name;
        private String lastName;
        private String login;
        private String email;
        private String password;


        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;

        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;

        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(id, name, lastName, login, email, password);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", login='" + login + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}
