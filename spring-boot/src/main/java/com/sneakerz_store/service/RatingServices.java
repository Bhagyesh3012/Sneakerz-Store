package com.sneakerz_store.service;

import java.util.List;

import com.sneakerz_store.entity.Rating;
import com.sneakerz_store.entity.User;
import com.sneakerz_store.exception.ProductException;
import com.sneakerz_store.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
