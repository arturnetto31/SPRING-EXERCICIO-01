package com.ayty.fintech.seller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_SELLER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Seller implements Serializable {
    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String cnpj;
    private String fantasy_name;
    private String social_name;
    private String username;

}
