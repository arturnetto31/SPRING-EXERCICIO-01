package com.ayty.fintech.userfintech;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_USER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserFintech implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String fullname;
    private String email;
    private String password;
    private String cpf;
}
