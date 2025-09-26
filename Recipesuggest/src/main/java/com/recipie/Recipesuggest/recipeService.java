package com.recipie.Recipesuggest;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class recipeService {
    private final ChatModel chatModel;

    public recipeService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }
    public String createRecipe(String ingredients,String cuisine,String dietRestrictions){
        var template= """
                I want to Create a recipe using the following ingredients :{ingredients},
                The Cuisine type i prefer is : {cuisine}.
                Please follow the following dietary restrictions:{dietRestrictions}.
                Please provide me with detailed recipe including title,list of ingredients, and cooking instructions
                """;
        PromptTemplate promptTemplate=new PromptTemplate(template);
        Map<String,Object> params=Map.of(
                "ingredients",ingredients,
                "cuisine",cuisine,
                "dietRestrictions",dietRestrictions
        );
        Prompt prompt= promptTemplate.create(params);
        return chatModel.call(prompt).getResult().getOutput().getText();
    }

}
