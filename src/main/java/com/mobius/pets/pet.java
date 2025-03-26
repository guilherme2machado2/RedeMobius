package com.mobius.pets;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nome;
    private String Raca;
    private int Idade;
    public double Peso;
    private String HISTORICO_VACINAS;
    private String Endereco;
    public String Porte;




}
