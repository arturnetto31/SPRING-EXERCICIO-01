package com.ayty.fintech.consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConsumerDTO{
    private long id;

    private String username;
    private String fullname;

}
