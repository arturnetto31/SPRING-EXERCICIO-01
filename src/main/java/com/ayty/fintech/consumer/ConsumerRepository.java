package com.ayty.fintech.consumer;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
    Consumer findById(long id);
}
