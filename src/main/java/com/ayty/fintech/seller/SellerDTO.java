package com.ayty.fintech.seller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerDTO{

    private long id;

    private String cnpj;
    private String fantasy_name;
    private String social_name;
    private String username;

}
