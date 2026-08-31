package com.example.Ai_Code.repository;
import com.example.Ai_Code.entity.CodeReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CodeReviewRepository extends JpaRepository<CodeReview, Long> {

}
