package com.mobius.hospedaria;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hospedarias_pets")
public class hospedariaPet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String telefone;

    // Relacionamento com Pets pode ser adicionado se necessário

    // Getters e Setters
}
