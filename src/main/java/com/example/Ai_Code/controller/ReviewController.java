package com.example.Ai_Code.controller;

import com.example.Ai_Code.dto.ReviewRequest;
import com.example.Ai_Code.dto.ReviewResponse;
import com.example.Ai_Code.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ReviewController {
   @Autowired
    private  ReviewService reviewService;

//    public ReviewController(ReviewService reviewService) {
//        this.reviewService = reviewService;
//    }

    @PostMapping("/review")
    public ReviewResponse reviewCode(
            @RequestBody ReviewRequest request) {

        return reviewService.reviewCode(request);
    }
}