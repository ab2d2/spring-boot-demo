package com.spring.demo.springdemo.repositories;

import com.spring.demo.springdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
