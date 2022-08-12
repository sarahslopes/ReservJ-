package com.br.ecxus.ReservJa.model;

public enum Status {
    DISPONIVEL,
    OCUPADO,
    RESERVADO;

    private String status;

    Status() {

    }

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
