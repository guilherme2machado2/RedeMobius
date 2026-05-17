package com.mobius.hospedaria;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

public class hospedariaPet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String endereco;

    @Getter
    @Setter
    private String telefone;

    // Relacionamento com Pets pode ser adicionado se necessário

}
