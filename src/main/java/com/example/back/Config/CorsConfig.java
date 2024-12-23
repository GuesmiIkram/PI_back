package com.example.back.Config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
 @Value("${cors.allowed.origin}")
    private String allowedOrigin;
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permettre CORS sur toutes les URL
                .allowedOrigins(allowedOrigin,"http://10.0.2.2") // Remplacez par l'origine autorisée
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Méthodes autorisées
                .allowedHeaders("*") 
                .allowCredentials(false); // Autoriser tous les en-têtes
              //.allowCredentials(true); // Autoriser les cookies ou l'authentification
    }
}


