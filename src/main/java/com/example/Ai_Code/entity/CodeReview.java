package com.example.Ai_Code.entity;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class CodeReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    private String language;

    @Lob

    private String code;

    @Lob

    private String feedback;

    private int score;

    private LocalDateTime createdAt;
}
