package com.example.cadastroproduto.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cadastroproduto.entities.Categoria;

public interface CategoriaRepositories extends JpaRepository<Categoria, Long> { }