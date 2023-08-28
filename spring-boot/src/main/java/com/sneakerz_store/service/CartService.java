package com.sneakerz_store.service;

import com.sneakerz_store.entity.Cart;
import com.sneakerz_store.entity.CartItem;
import com.sneakerz_store.entity.User;
import com.sneakerz_store.exception.ProductException;
import com.sneakerz_store.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
