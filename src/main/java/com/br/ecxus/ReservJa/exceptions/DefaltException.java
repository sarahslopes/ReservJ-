package com.br.ecxus.ReservJa.exceptions;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DefaltException {
    
    private int code;
    private String message;
}
