package com.registration.serviceImpl;

import com.registration.model.UserRegistration;
import com.registration.repository.UserRepository;
import com.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repo;

    @Override
    public UserRegistration createUser(UserRegistration user) {
        return this.repo.save(user);
    }

    @Override
    public UserRegistration getUser(String username) {
        return this.repo.findByUsername(username);
    }

    @Override
    public List<UserRegistration> getAllUsers() {
        return this.repo.findAll();
    }

    @Override
    public void deleteUser(Integer userId) {
        repo.deleteById(userId);
    }
}
