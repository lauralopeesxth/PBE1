package com.example.cadastroproduto.entities;
import jakarta.persistence.*;

@Entity 
public class Produto { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long idProduto; 
	private String nome; 
	private Double preco; 
	
	@ManyToOne @JoinColumn(name = "id_categoria") 
	private Categoria categoria; 
	
	// Getters e setters }

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}