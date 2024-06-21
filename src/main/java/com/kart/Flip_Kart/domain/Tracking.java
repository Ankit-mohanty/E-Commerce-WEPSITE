package com.kart.Flip_Kart.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tracking")
@AllArgsConstructor
@NoArgsConstructor
public class Tracking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String trackingId;
	private String trackingStatus;
	private String ProductId;
}
