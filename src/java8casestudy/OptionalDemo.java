package java8casestudy;

import java.util.Optional;

class User {
    private String email;

    public User(String email) {
        this.email = email;
    }

    public String getEmail() { return email; }
}

public class OptionalDemo {
    public static void main(String[] args) {
        User user = new User(null); // try with value too
        Optional<String> email = Optional.ofNullable(user.getEmail());

        email.ifPresentOrElse(
            e -> System.out.println("Email: " + e),
            () -> System.out.println("Email not provided")
        );
    }
}
