package com.example.user;

import com.example.user.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getNames(String startsWith) {
        if (Objects.isNull(startsWith)) {
            return userMapper.findAll();
        } else {
            return userMapper.findByNameStartingWith(startsWith);
        }

    }

    public User findUser(int id) {
        Optional<User> user = this.userMapper.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new UserNotFoundException("user not found");
        }
//        return user.orElseThrow(() -> new UserNotFoundException("user not found"));

    }

}
