package com.springboot.testapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.testapp.Model.User;
import com.springboot.testapp.Repository.UserRepository;

@Component
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        List<User> users = (List<User>) this.userRepository.findAll();
        return users;
    }

    public User getById(int id){
        return userRepository.findById(id);
    }

    public void createUser(User user){
        this.userRepository.save(user);
    }

    public void deleteById(int id){
        this.userRepository.deleteById(id);
    }


    public void update(User user, int id){
        
        User curr_user = userRepository.findById(id);

        if(curr_user != null){
            curr_user.setUsername(user.getUsername());
            curr_user.setPassword(user.getPassword());
            userRepository.save(curr_user);
        }
    }
    
}
