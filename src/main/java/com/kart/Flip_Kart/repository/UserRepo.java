package com.kart.Flip_Kart.repository;

import com.kart.Flip_Kart.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
