package com.fastfood.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = true)
    private Cliente cliente;
    @ManyToMany
    private List<Item> itens;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date data;
    @Min(1)
    private Double valorTotal;
}