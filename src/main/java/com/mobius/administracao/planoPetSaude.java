package com.mobius.administracao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "planos_Pet_saude")
public class planoPetSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private double preco;

    @OneToMany(mappedBy = "planoPetSaude")
    private List<Pet> pets;

    // Getters e Setters
}
