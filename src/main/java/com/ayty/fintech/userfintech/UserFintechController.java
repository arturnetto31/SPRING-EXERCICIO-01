package com.ayty.fintech.userfintech;


import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
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
    public UserFintech userFintech(@PathVariable(value="id") long id) throws NotFound {
       // return userFintechRepository.findById(id).orElseThrow(NotFound::new);
        return userFintechRepository.findById(id);
    }

    @GetMapping("/users/{name}")
    public List<UserFintech> listUserWithName (@PathVariable(value="name") String fullname) {
        return userFintechRepository.findByFullnameContaining(fullname);
    }

    @PostMapping("/user")
    public UserFintech saveUserFintech(@RequestBody UserFintech userFintech) {
        return  userFintechRepository.save(userFintech);
    }

    @DeleteMapping("/user")
    public void deleteUserFintech(@RequestBody UserFintech userFintech) {
        userFintechRepository.delete(userFintech);
    }

    @PutMapping("/user")
    public UserFintech replaceUserFintech(@RequestBody UserFintech userFintech) {
        return userFintechRepository.save(userFintech);
    }

}
