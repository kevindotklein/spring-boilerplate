package com.kevindotklein.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevindotklein.template.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
