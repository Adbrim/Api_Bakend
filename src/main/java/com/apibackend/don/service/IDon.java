package com.apibackend.don.service;

import com.apibackend.don.model.Don;
import com.apibackend.don.model.User;

import java.util.List;

public interface IDon {
    List<Don> getNourriture();
    void addDon(Don don);
    Don getDonById(Long id);
    void addUser(User user);
    User getUserById(long id);
}
