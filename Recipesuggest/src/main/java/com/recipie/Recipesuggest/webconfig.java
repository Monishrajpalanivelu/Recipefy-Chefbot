// In: Recipesuggest/src/main/java/com/recipie/Recipesuggest/WebConfig.java
package com.recipie.Recipesuggest;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Apply to all endpoints
                // THIS IS THE CRITICAL CHANGE:
                .allowedOrigins("https://chimerical-wisp-0e018b.netlify.app") 
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true); 
    }
}
