package com.sneakerz_store.user.domain;

public enum ProductSize {

	XS(5),
    S(6),
    M(7),
    L(8),
    XL(9),
    XXL(10),
    XXXL(11),
    XXXXL(12);
    
    private int size;

	ProductSize(int size){
		this.size=size;
	}
}
