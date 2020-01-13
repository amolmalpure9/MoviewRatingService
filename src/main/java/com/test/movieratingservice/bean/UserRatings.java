package com.test.movieratingservice.bean;

import java.util.List;

//this class is used for returing list as user ratings
public class UserRatings {

	public UserRatings() {
	}

	public UserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}


	private List<Rating> userRatings;

	public List<Rating> getUserRatings() {
		return userRatings;
	}

	public void setUserRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}
}
