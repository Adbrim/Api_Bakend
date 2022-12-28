package com.apibackend.don.service.implement;

import com.apibackend.don.model.Don;
import com.apibackend.don.model.User;
import com.apibackend.don.repository.DonRepository;
import com.apibackend.don.repository.UserRepository;
import com.apibackend.don.service.IDon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonImplement implements IDon {

    private final UserRepository userRepository;
    private final DonRepository donRepository;

    @Autowired
    public DonImplement(UserRepository userRepository, DonRepository donRepository) {
        this.userRepository = userRepository;
        this.donRepository = donRepository;
    }

    @Override
    public List<Don> getNourriture() {
        return donRepository.findAll();
    }

    @Override
    public void addDon(Don don) {
        donRepository.save(don);
    }

    @Override
    public Don getDonById(Long id) {
        return donRepository.findById(id).orElseThrow();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
