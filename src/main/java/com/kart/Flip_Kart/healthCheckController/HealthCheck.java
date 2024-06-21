package com.kart.Flip_Kart.healthCheckController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "Ready To Take Initial Steps";
	}
}