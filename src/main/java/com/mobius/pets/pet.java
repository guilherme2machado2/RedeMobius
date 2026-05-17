package com.mobius.pets;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


public class pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String Nome;

    @Getter
    @Setter
    private String Raca;

    @Getter
    @Setter
    private int Idade;

    @Getter
    @Setter
    public double Peso;

    @Getter
    @Setter
    private String HISTORICO_VACINAs;

    @Getter
    @Setter
    public String Porte;


}
