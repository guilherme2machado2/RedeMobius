package com.mobius.people;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

public class Pessoa {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CPF;

    @Getter
    @Setter
    private String Nome;

    @Getter
    @Setter
    private int Telefone;

    @Getter
    @Setter
    private String Email;

    @Getter
    @Setter
    private String Endereco;

    public static String formatarCPF(String cpfNumeros) {

        String cpfLimpo = cpfNumeros.replaceAll("[^0-9]", "");

        if (cpfLimpo.length() != 11) {
            throw new IllegalArgumentException("O CPF deve conter exatamente 11 dígitos.");
        }

        return cpfLimpo.substring(0, 3) + "." +
                cpfLimpo.substring(3, 6) + "." +
                cpfLimpo.substring(6, 9) + "-" +
                cpfLimpo.substring(9, 11);
    }
}