package com.kart.Flip_Kart.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
	private String productID;
	private String productName;
	private String productDescription;
	private String productPrice;
	private Long productQuantity;
}
