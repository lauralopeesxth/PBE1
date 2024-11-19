package com.example.cadastroproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cadastroproduto.entities.Categoria;
import com.example.cadastroproduto.repositories.CategoriaRepositories;

@Service 
public class CategoriaService {
	
	@Autowired 
	private CategoriaRepositories Rrepositories; 
	public List<Categoria> findAll() { 
		return repositories.findAll(); 
		
	}
	
	public Categoria save(Categoria categoria) { 
		return repositories.save(categoria); 
		
	}
}