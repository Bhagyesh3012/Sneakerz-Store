package com.sneakerz_store.service;

import java.util.List;

import com.sneakerz_store.entity.Review;
import com.sneakerz_store.entity.User;
import com.sneakerz_store.exception.ProductException;
import com.sneakerz_store.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
