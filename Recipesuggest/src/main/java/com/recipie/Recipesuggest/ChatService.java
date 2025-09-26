package com.recipie.Recipesuggest;

import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.mistralai.MistralAiChatOptions;
import org.springframework.ai.mistralai.api.MistralAiApi;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final ChatModel chatModel;

    public ChatService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }
    public String getResponse(String prompt){
        return chatModel.call(prompt);
    }
    public String getResponseprompt(String prompt){
        ChatResponse response= chatModel.call(
                 new Prompt(
                         prompt,
                        MistralAiChatOptions.builder()
                                .model(MistralAiApi.ChatModel.LARGE.getValue())
                                .temperature(0.2)
                                .build()
                ));
        return response.getResult().getOutput().getText()   ;
    }
}
