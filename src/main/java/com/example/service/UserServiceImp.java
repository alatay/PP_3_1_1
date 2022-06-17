package com.example.service;

import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void add(User user) {
        userRepository.saveAndFlush(user);
    }

    @Transactional
    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Transactional
    @Override
    public void update(User user) {
        userRepository.saveAndFlush(user);
    }

    @Transactional
    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public User getUserById(long id) {
        return userRepository.getUserById(id);
    }
}
