package com.registration.service;

import com.registration.model.UserRegistration;

import java.util.List;

public interface UserService {

    public UserRegistration createUser(UserRegistration user);
    public UserRegistration getUser(String username);

    public List<UserRegistration> getAllUsers();
    public void deleteUser(Integer userId);
}
