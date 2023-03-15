package com.springboot.testapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.testapp.Model.User;
import com.springboot.testapp.Service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable("id") int id){
        return this.userService.getById(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        this.userService.createUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") int id){
        this.userService.deleteById(id);
    }

    @PutMapping("/users/{id}")
    public void update(@RequestBody User user, @PathVariable("id") int id){
        this.userService.update(user, id);
    }
}
