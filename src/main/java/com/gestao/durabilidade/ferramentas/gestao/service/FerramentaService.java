/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestao.durabilidade.ferramentas.gestao.service;

import com.gestao.durabilidade.ferramentas.gestao.model.FerramentaDTO;
import com.gestao.durabilidade.ferramentas.gestao.repository.FerramentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author farma
 */
@Service
public class FerramentaService {
    
    @Autowired private FerramentaRepository repository;
    
    public List<FerramentaDTO> listarFerramentas() {
        return repository.lerTodos();
    }
    
    public void cadastrarFerramenta(FerramentaDTO ferramenta) {
        if(ferramenta.getNome().equals("")){
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Nome não preenchido!");
        }
        if(ferramenta.getVidaUtilMaxima() <= 0){
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Vida util inválida!");
        }
        if(ferramenta.getHorasUso() < 0){
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Horas de uso inválidas!");
        }
        int linhasAfetadas = repository.cadastrarFerramenta(ferramenta);
        if(linhasAfetadas == 0){
            throw new ResponseStatusException(HttpStatusCode.valueOf(500), "Erro ao adicionar ao banco de dados!");
        }
    }
    
    public void editarFerramenta(FerramentaDTO ferramenta) {
        if(ferramenta.getNome().equals("")){
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Nome não preenchido!");
        }
        if(ferramenta.getVidaUtilMaxima() <= 0){
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Vida util inválida!");
        }
        if(ferramenta.getHorasUso() < 0){
            throw new ResponseStatusException(HttpStatusCode.valueOf(400), "Horas de uso inválidas!");
        }
        int linhasAfetadas = repository.cadastrarFerramenta(ferramenta);
        if(linhasAfetadas == 0){
            throw new ResponseStatusException(HttpStatusCode.valueOf(500), "Erro ao adicionar ao banco de dados!");
        }
        
    }
    
    public void deletarFerramenta(int id) {
        int linhasAfetadas = repository.deleteById(id);
        if(linhasAfetadas == 0){
            throw new ResponseStatusException(HttpStatusCode.valueOf(500), "Erro ao adicionar ao banco de dados!");
        }
        
    }
}
