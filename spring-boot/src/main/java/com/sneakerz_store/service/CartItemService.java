package com.sneakerz_store.service;

import com.sneakerz_store.entity.Cart;
import com.sneakerz_store.entity.CartItem;
import com.sneakerz_store.entity.Product;
import com.sneakerz_store.exception.CartItemException;
import com.sneakerz_store.exception.UserException;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
