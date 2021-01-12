package com.ayty.fintech.consumer;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="TB_CONSUMER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Consumer implements Serializable {
    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;
    private String fullname;

}
