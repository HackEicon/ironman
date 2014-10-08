package br.com.llongo.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produto implements Serializable {
	public Produto() {
	}
	private static final long serialVersionUID = 7185813866142443643L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String nome;
	@Column
	private String composicao;	
	@Column
	private int tipo;	
	@Column
	private Boolean ativo;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcomposicao() {
		return composicao;
	}
	public void setComposicao(String composicao) {
		this.composicao = composicao;
	}
	
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public Produto( String nome, String composicao, int tipo) {
		super();
		this.nome = nome;
		this.composicao = composicao;
		this.tipo = tipo;		
	}

}
