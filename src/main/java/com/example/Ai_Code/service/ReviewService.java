package com.example.Ai_Code.service;

import com.example.Ai_Code.dto.ReviewRequest;
import com.example.Ai_Code.dto.ReviewResponse;
import com.example.Ai_Code.entity.CodeReview;
import com.example.Ai_Code.repository.CodeReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ReviewService {
    @Autowired
    private  AIService aiService;
    @Autowired
    private  CodeReviewRepository repository;



    public ReviewResponse reviewCode(ReviewRequest request) {

        // 1. Send code to AI
        String feedback = aiService.reviewCode(
                request.getLanguage(),
                request.getCode()
        );

        // 2. Create entity
        CodeReview review = new CodeReview();

        review.setLanguage(request.getLanguage());
        review.setCode(request.getCode());
        review.setFeedback(feedback);
        review.setCreatedAt(LocalDateTime.now());

        // 3. Save to database
        repository.save(review);

        // 4. Return response
        ReviewResponse response = new ReviewResponse();
        response.setFeedback(feedback);
        response.setScore(null);
        return response;
    }
}