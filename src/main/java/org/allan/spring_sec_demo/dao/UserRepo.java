package org.allan.spring_sec_demo.dao;

import org.allan.spring_sec_demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
