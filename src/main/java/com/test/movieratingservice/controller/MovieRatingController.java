package com.test.movieratingservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.movieratingservice.bean.Rating;
import com.test.movieratingservice.bean.UserRatings;

@RestController
@RequestMapping("/ratingdata")
public class MovieRatingController {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") int movieId) {
		return new Rating(movieId, 2);
	}

	@RequestMapping("/user/{userId}")
	public UserRatings getRatings(@PathVariable("userId") String userId) {

		// hard coded response for every user id
		// actual behavior would be calling db and get all the rating given by user
		List<Rating> ratings = Arrays.asList(new Rating(1, 2), new Rating(2, 4));
		
		//UserRatings is created only to stop returning list as api response which has some drawbacks
		//Object is simple to handle at client end and other benifits
		UserRatings userRatings = new UserRatings();
		userRatings.setUserRatings(ratings);
		return userRatings;
	}
}
