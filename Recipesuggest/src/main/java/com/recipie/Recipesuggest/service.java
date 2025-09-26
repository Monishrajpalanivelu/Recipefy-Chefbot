package com.recipie.Recipesuggest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class service {
    @Value(("${spring.ai.mistralai.api-key}"))
    private String apikey;
    @PostConstruct
    public void checkkey(){
        System.out.println("Mist API Key :" + apikey);
    }
}
