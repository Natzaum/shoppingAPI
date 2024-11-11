package com.placasdevideo.course.repositories;

import com.placasdevideo.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
