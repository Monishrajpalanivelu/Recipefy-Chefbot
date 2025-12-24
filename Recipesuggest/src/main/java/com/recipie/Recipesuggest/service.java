package com.recipie.Recipesuggest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class service {
    
    @Value("${spring.ai.mistralai.api-key}")
    private String apikey;

    @PostConstruct
    public void checkkey(){
        if (apikey == null || apikey.trim().isEmpty()) {
            System.err.println("WARNING: Mistral API Key is missing!");
        } else {
            System.out.println("Mistral API Key has been loaded successfully.");
        }
    }
}
