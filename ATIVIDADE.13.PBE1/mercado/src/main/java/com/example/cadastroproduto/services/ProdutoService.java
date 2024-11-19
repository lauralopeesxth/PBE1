package com.example.cadastroproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cadastroproduto.entities.Produto; 

@Service 
public class ProdutoService {
	
	@Autowired 
	private ProdutoRepositories repositories; 
	public List<Produto> findAll() { 
		return repositories.findAll(); 
		
	}
	
	public Produto save(Produto produto) { 
		return repositories.save(produto); 
		
	}
}