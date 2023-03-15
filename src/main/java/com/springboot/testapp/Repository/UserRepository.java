package com.springboot.testapp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.testapp.Model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    public User findById(int id);
    // public void deleteById(int id);
}
