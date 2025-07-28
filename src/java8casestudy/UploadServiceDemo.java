package java8casestudy;

import java.util.concurrent.*;

public class UploadServiceDemo {
    public static void uploadFile(String filename) {
        System.out.println("Uploading " + filename);
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(() -> uploadFile("file1.txt"));
        service.submit(() -> uploadFile("file2.txt"));
        service.shutdown();
    }
}
