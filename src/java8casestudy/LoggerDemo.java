package java8casestudy;

@FunctionalInterface
interface LogFilter {
    boolean shouldLog(String message);
}

public class LoggerDemo {
    public static void main(String[] args) {
        LogFilter filter = msg -> msg.contains("ERROR");

        String logMessage = "ERROR: System crashed";

        if (filter.shouldLog(logMessage)) {
            System.out.println("Logging: " + logMessage);
        }
    }
}
