package com.fastfood.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GeneraionTYPE.IDENDTITY)
    private Long id;
    @NotNull
    @Length(min=2,max=30,message = "O tamanho máximo deve ser entre {min} e {max} caracteres")
    private String nome;
    @NotNull
    @Min(value=20,message="O valor mínimo deve ser {value} reais")
    private Double preco;    
}
