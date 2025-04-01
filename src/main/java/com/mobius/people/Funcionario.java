package com.mobius.people;

import com.mobius.people.Pessoa;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Persistence;
import lombok.Getter;
import lombok.Setter;
import javax.swing.*;

public class Funcionario extends Pessoa {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Getter
    @Setter
    public String Cargo;

    @Getter
    @Setter
    public double SALARIO_BASE_HORA;
}

