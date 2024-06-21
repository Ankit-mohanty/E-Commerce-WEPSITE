package com.kart.Flip_Kart.repository;

import com.kart.Flip_Kart.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
