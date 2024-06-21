package com.kart.Flip_Kart.service.bussinessLogic;

import com.kart.Flip_Kart.domain.Product;
import com.kart.Flip_Kart.exceptions.OutOfStockException;
import com.kart.Flip_Kart.repository.ProductRepo;
import com.kart.Flip_Kart.service.impl.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements IProductService {
	private final ProductRepo productRepo;


	@Override
public String insertProduct(Product product) {
    Product details = productRepo.save(product);
    throw new RuntimeException();
}

	@Override
	public Product getProductById( String productId ) {
		Product name= productRepo.findById(productId).orElseThrow(()->new OutOfStockException("Product Has Been Out Of Stock"));
		return name;
	}

	@Override
	public List getAllProduct() {
		Product allProduct= ( Product ) productRepo.findAll();
		return Collections.singletonList(allProduct);
	}

	@Override
	public Product updateProductDetails( Product product ) {
		return null;
	}

	@Override
	public Product getProductByName( String productName ) {
		return null;
	}
}
