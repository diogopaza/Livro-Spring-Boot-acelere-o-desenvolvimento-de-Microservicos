package com.fastfood.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Length(min=2,max=30,message="O tamamnho do nome deve ser entre {min} e {max} caracteres")
    private String nome;
    @NotNull
    @Length(min=2,max=300,message = "O tamanho do endereço deve conter entre {min} e {max} caracteres")
    @private String endereco;
    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;


}
