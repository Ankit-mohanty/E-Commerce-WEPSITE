package com.kart.Flip_Kart.exceptions;

import com.kart.Flip_Kart.domain.Product;
import com.kart.Flip_Kart.exceptions.ExceptionIMPl.IErrorDetails;
import com.kart.Flip_Kart.repository.ProductRepo;

//@RequiredArgsConstructor

public record ErrorDetails(ProductRepo productRepo) implements IErrorDetails {
	@Override
	public String purchaseProduct( String productId, int quantity ) {
		Product product = productRepo.findById(productId)
				.orElseThrow(() -> new OutOfStockException("Product not found with id " + productId));

		if( product.getProductQuantity() < quantity ) {
			throw new OutOfStockException("Product with id " + productId + " is out of stock.");
		}

		// Proceed with purchase logic
		product.setProductQuantity(product.getProductQuantity() - quantity);
		productRepo.save(product);
		return "Purchase successful";
	}

}
