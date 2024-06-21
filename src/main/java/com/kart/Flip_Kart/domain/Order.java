package com.kart.Flip_Kart.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "order")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private int userId;
	private int productId;
	private int quantity;
	private int totalPrice;
	private String status;
}
