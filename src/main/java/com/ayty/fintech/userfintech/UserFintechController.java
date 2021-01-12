package com.ayty.fintech.userfintech;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/api")
public class UserFintechController {

    @Autowired
    UserFintechRepository userFintechRepository;

    @GetMapping("/users")
    public List<UserFintech> listUsersFintech(){
        return userFintechRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public UserFintech userFintech(@PathVariable(value="id") long id) {
        return userFintechRepository.findById(id);
    }

    @PostMapping("/user")
    public UserFintech saveUserFintech(@RequestBody UserFintech userFintech) {
        return  userFintechRepository.save(userFintech);
    }

}
