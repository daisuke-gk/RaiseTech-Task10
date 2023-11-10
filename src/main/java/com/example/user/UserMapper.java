package com.example.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE name LIKE CONCAT(#{name}, '%')")
    List<User> findByNameStartingWith(String prefix);

    @Select("SELECT * FROM users WHERE id = #{id}")
    Optional<User> findById(int id);

}
