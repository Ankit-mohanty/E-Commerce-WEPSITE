package com.kart.Flip_Kart.repository;

import com.kart.Flip_Kart.domain.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackingRepo extends JpaRepository<Tracking,String> {
}
