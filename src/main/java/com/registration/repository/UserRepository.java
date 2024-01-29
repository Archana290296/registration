package com.registration.repository;

import com.registration.model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRegistration, Integer> {

    public UserRegistration findByUsername(String username);
}
