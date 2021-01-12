package com.ayty.fintech.seller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SellerController {
    @Autowired
    SellerRepository sellerRepository;

    @GetMapping(value = "/users/sellers")
    public List<Seller> listSeller() {
        return sellerRepository.findAll();
    }
    @GetMapping(value = "/users/seller/{id}")
    public Seller seller(@PathVariable(value = "id") long id) {
        return sellerRepository.findById(id);
    }

    @PostMapping("/seller")
    public Seller saveSeller(@RequestBody Seller seller) {
        return  sellerRepository.save(seller);
    }

}
