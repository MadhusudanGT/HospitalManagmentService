package com.HospitalManagment.HM.Controller;
import com.HospitalManagment.HM.model.*;
import com.HospitalManagment.HM.Controller.*;
import com.HospitalManagment.HM.repository.*;
import com.HospitalManagment.HM.service.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;
    private UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @PostMapping("/user/create")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @GetMapping("/user/details/{id}")
    public User getUser(@PathVariable Long id) {
        if(userRepository.findById(id).isPresent())
            return userRepository.findById(id).get();
        else return  null;
    }
    @GetMapping("/user/all")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    @PutMapping("/user/update/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(user, id);
    }
    @DeleteMapping("user/delete/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }





}
