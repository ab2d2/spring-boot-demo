package com.spring.demo.springdemo.repositories;

import com.spring.demo.springdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
