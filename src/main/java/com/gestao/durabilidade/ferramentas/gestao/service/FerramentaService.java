/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestao.durabilidade.ferramentas.gestao.service;

import com.gestao.durabilidade.ferramentas.gestao.model.FerramentaDTO;
import com.gestao.durabilidade.ferramentas.gestao.repository.FerramentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author farma
 */
@Service
public class FerramentaService {
    
    @Autowired FerramentaRepository repository;
    
    public List<FerramentaDTO> listarFerramentas(FerramentaDTO ferramenta) {
        return repository.lerTodos();
    }
    
    public void cadastrarFerramenta(FerramentaDTO ferramenta) {
        repository.cadastrarFerramenta(ferramenta);
    }
    
    public void editarFerramenta(FerramentaDTO ferramenta) {
        repository.editarFerramenta(ferramenta);
    }
    
    public void deletarFerramenta(int id) {
        repository.deleteById(id);
    }
}
