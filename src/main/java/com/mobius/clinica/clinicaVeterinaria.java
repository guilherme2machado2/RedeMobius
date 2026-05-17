package com.mobius.clinica;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


public class clinicaVeterinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long Id;

    @Getter
    @Setter
    public String Endereco;

    @Getter
    @Setter
    public String Telefone;

    @Getter
    @Setter
    private String responsavelClinica;

} interface responsavelPelaClinica {

}



