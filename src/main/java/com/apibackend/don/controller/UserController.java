package com.apibackend.don.controller;

import com.apibackend.don.model.User;
import com.apibackend.don.service.IDon;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/don")
@CrossOrigin(origins="*")
public class UserController {
    private IDon iDon;

    public UserController(IDon iDon) {
        this.iDon = iDon;
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        iDon.addUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long id){
        return iDon.getUserById(id);
    }
}
