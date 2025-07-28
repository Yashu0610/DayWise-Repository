package java8casestudy;

import java.util.function.Consumer;

class NotificationService {
    static void sendEmail(String msg) {
        System.out.println("Email sent: " + msg);
    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        Consumer<String> notifier = NotificationService::sendEmail;
        notifier.accept("Welcome to our service!");
    }
}
