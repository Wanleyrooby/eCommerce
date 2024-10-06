package com.wanroo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanroo.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
