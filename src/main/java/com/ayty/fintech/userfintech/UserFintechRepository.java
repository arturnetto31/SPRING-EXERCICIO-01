package com.ayty.fintech.userfintech;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserFintechRepository extends JpaRepository<UserFintech, Long> {
    UserFintech findById(long id);
    List<UserFintech> findByFullnameContaining(String fullname);
}
