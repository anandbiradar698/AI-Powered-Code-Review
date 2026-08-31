package com.example.Ai_Code.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    @Autowired
    private  ChatClient chatClient;


    public String reviewCode(String language, String code) {

        String prompt = """
                You are an expert %s developer.

                Review the following code.

                Give:
                1. Summary
                2. Bugs
                3. Suggestions
               

                Code:
                %s
                """.formatted(language, code);

        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }
}