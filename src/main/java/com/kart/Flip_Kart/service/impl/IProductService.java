package com.kart.Flip_Kart.service.impl;

import com.kart.Flip_Kart.domain.Product;

import java.util.List;

public interface IProductService {

	public String insertProduct( Product product );

	public Product getProductById( String productId );

	public List getAllProduct();

	public Product updateProductDetails( Product product );

	public Product getProductByName( String productName );
}
