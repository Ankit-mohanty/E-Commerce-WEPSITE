package com.kart.Flip_Kart.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String userId;
	private String userFirstName;
	private String userLastName;
	private String userMobileNumber;
	private String userPassword;
}
