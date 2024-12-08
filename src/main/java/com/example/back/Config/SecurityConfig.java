package com.example.back.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable()) // Désactiver CSRF temporairement
            .authorizeHttpRequests(auth -> auth
                // Autoriser les endpoints spécifiques sans authentification
                .requestMatchers(
                    "/api/proprietaires/**", 
                    "/api/images/**", 
                    "/api/avis-proprietaire/**", 
                    "/api/avis-client/**",
                    "/api/payment/**"  ,
                    "/api/voitures/**",
                    "/api/clients/**", 
                    "/api/pub/**" ,
                    "/api/reservations/**" ,
                    "/api/Response/**",
                   "/api/avis/**",
                   "/admin/**",
                   "/api/**"
                ).permitAll()

               
                .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults()); 
        return http.build();
    }
}

