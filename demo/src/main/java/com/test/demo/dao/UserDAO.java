package com.test.demo.dao;

import com.test.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
    public User findByUsername(String username);

    public User getByUsernameAndPassword(String username, String password);
}
