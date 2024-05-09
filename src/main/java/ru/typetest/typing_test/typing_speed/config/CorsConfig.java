package ru.typetest.typing_test.typing_speed.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Разрешить запросы из всех источников
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Разрешить различные HTTP-методы
                .allowedHeaders("*"); // Разрешить различные заголовки
    }
}