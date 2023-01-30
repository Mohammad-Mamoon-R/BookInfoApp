package com.rtb.ratings.service;

import com.rtb.ratings.entity.Rating;
import com.rtb.ratings.repository.RatingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public Rating saveRating(Rating rating) {
        log.info("Inside saveRating of RatingService");
        return ratingRepository.save(rating);
    }

    public List<Rating> findRatingByBookId(Long bookId) {
        log.info("Inside findRatingByBookId of RatingService");
        return ratingRepository.findByBookId(bookId);
    }
}
