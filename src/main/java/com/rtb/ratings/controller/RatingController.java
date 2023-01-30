package com.rtb.ratings.controller;

import com.rtb.ratings.entity.Rating;
import com.rtb.ratings.service.RatingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
@Slf4j
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/addRating")
    public Rating saveRating(@RequestBody Rating rating) {
        log.info("Inside saveRating method of RatingController");
        return  ratingService.saveRating(rating);
    }

    @GetMapping("/{id}")
    public List<Rating> findRatingByBookId(@PathVariable("id") Long bookId) {
        log.info("Inside findRatingByBookId method of RatingController");
        return ratingService.findRatingByBookId(bookId);
    }

}
