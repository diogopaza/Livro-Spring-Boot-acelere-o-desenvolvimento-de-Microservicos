package com.fastfood.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Cliente {
    @Id   
    private Long id;
    @NotNull
    @Length(min=2,max=30,message="O tamamnho do nome deve ser entre {min} e {max} caracteres")
    private String nome;
    @NotNull
    @Length(min=2,max=300,message = "O tamanho do endereço deve conter entre {min} e {max} caracteres")
    private String endereco;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Pedido> pedidos;
   
}
