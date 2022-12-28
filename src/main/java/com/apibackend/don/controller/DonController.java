package com.apibackend.don.controller;

import com.apibackend.don.model.Don;
import com.apibackend.don.service.IDon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin(origins="http://localhost:3000")
public class DonController {

    private IDon idon;

    @Autowired
    public DonController(IDon idon) {
        this.idon = idon;
    }

    @GetMapping("/don")
    public List<Don> getNourriture(){
        return idon.getNourriture();
    }

    @PostMapping("/don")
    public void addNourriture(@RequestBody Don don){
        idon.addDon(don);
    }

    @GetMapping("don/{id}")
    public Don getNourritureByID(@PathVariable(name = "id") Long id){
        return idon.getDonById(id);
    }

}
