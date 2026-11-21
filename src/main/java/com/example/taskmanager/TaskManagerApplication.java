package com.example.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Uygulamanın giriş noktası. Spring'e "buradan başla, bu paketi ve alt paketlerini tara" diyoruz.
@SpringBootApplication
public class TaskManagerApplication {

    public static void main(String[] args) {
        // Spring'i ayağa kaldırır: gömülü web sunucusunu (Tomcat) başlatır ve 8080 portunu dinlemeye başlar.
        SpringApplication.run(TaskManagerApplication.class, args);
    }
}
