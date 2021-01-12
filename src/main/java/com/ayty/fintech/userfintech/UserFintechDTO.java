package com.ayty.fintech.userfintech;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserFintechDTO {
    private long id;
    private String fullname;
    private String email;
    private String password;
    private String cpf;
}
