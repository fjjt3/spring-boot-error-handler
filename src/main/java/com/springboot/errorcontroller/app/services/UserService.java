package com.springboot.errorcontroller.app.services;

import com.springboot.errorcontroller.app.models.domain.User;

import java.util.List;

public interface UserService {

    public List<User> list();
    public User getUserById(Integer id);

}
