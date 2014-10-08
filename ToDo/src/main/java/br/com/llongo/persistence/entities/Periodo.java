package br.com.llongo.persistence.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Periodo implements Serializable {
	public Periodo() {
	}
	private static final long serialVersionUID = 7185813866142443643L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String periodo;
	@Column
	private Boolean ativo;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setNome(String periodo) {
		this.periodo = periodo;
	}
		
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public Periodo( String periodo, String composicao, int tipo, Boolean ativo) {
		super();
		this.periodo = periodo;		
		this.ativo = ativo;
	}

}
