package com.ayty.fintech.consumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ConsumerController {
    @Autowired
    ConsumerRepository consumerRepository;

    @GetMapping(value = "/users/consumers")
    public List<Consumer> listConsumers(){
        return consumerRepository.findAll();
    }

    @GetMapping(value = "/users/consumers/{id}")
    public Consumer consumer(@PathVariable(value = "id") long id) {
        return consumerRepository.findById(id);
    }

    @PostMapping(value = "/consumer")
    public Consumer saveConsumer(@RequestBody Consumer consumer) {
        return consumerRepository.save(consumer);
    }
}
