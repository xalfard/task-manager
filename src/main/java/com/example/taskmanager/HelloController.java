package com.example.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController: "Bu sınıf HTTP isteklerini karşılar, dönen değeri doğrudan cevap olarak gönder."
@RestController
public class HelloController {

    // Biri sunucuya "GET /hello" isteği atarsa bu metot çalışır.
    @GetMapping("/hello")
    public String hello() {
        return "Merhaba! Backend'imiz çalışıyor.";
    }
}
