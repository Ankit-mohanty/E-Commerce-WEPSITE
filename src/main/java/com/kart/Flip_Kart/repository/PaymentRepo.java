package com.kart.Flip_Kart.repository;

import com.kart.Flip_Kart.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,Integer> {
}
