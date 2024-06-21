package com.kart.Flip_Kart.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "cart")
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

	private String productId;
	private String productName;
	private int productPrice;
	private int productQuantity;
}
