package com.ris.projexdenserver.service;

import com.ris.projexdenserver.domain.User;
import com.ris.projexdenserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public User register(User user){
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User getUser(Long id) {
        return repo.findById(id).orElse(new User());
    }
}
