package com.kart.Flip_Kart.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pay")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentId;
	private double  amount;
	private String cardNumber;
	private String paymentDate;
	private String paymentMethod;
}
