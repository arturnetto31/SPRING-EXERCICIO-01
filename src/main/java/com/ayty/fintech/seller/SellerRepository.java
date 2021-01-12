package com.ayty.fintech.seller;


import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Long> {
    Seller findById(long id);
}
