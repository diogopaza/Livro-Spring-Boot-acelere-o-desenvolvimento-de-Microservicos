package model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Propriedade {
	@Id
	private String nome;
	private String valor;
	private String descricao;
	private String categoria;
	private String subcategoria;	
}
