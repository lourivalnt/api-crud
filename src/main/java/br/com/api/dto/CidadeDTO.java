package br.com.api.dto;

import java.io.Serializable;

public class CidadeDTO implements Serializable {
		
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String uf;
	
	public CidadeDTO() {
		super();
	}

	public CidadeDTO(String nome, String uf, Integer id) {
		super();
		this.nome = nome;
		this.uf = uf;
		this.id = id;
	}

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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}


}
