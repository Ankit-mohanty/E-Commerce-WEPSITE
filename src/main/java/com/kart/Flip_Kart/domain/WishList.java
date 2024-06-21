package com.kart.Flip_Kart.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
@Entity

public class WishList {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private User user;
	private List<Product> products;
}
