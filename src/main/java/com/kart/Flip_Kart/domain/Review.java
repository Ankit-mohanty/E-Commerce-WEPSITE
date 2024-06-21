package com.kart.Flip_Kart.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Product product;
	private double rating;
	private String review;
	private User user;
}
