package com.senaidev.cadastrolivraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cadastrolivraria.entities.Endereco;
import com.senaidev.cadastrolivraria.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> buscarEnderecos() {
        return enderecoService.buscarEnderecos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> buscarEnderecosPorId(@PathVariable Long id) {
        Endereco endereco = enderecoService.buscarEnderecosPorId(id);
		
		if (endereco != null) {
			return ResponseEntity.ok(endereco);
		} else {
			return ResponseEntity.notFound().build();
		}	
    }
    
    @PostMapping
    public Endereco criarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.criarEndereco(endereco);
    }

    @DeleteMapping("/{id}")
    public void excluirEndereco(@PathVariable Long id) {
        enderecoService.excluirEndereco(id);
    }
}

