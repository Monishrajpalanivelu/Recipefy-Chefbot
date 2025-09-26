package com.recipie.Recipesuggest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Aicontroller {

    ChatService chatService;
    private final recipeService recipeservice;

    public Aicontroller(ChatService chatService, recipeService recipeservice){
        this.chatService=chatService  ;
        this.recipeservice = recipeservice;
    }
    @GetMapping("/askai")

    public String getResponse(@RequestParam String prompt){
        return chatService.getResponse(prompt);
    }
    @GetMapping("/askaiprompt")
    public String getResponseprompt(@RequestParam String prompt){
        return chatService.getResponseprompt(prompt);
    }
    @GetMapping("/recipecreator")
    public String recipeCreator(@RequestParam String ingredients,
                                      @RequestParam(defaultValue = "any")String cuisine,
                                      @RequestParam(defaultValue = "")String dietaryRestrictions){

        return recipeservice.createRecipe(ingredients,cuisine,dietaryRestrictions);
    }

}
