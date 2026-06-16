/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestao.durabilidade.ferramentas.gestao.controller;

import com.gestao.durabilidade.ferramentas.gestao.model.FerramentaDTO;
import com.gestao.durabilidade.ferramentas.gestao.service.FerramentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author farma
 */
@Controller
public class FerramentaController {
    @Autowired FerramentaService service;
    
    @GetMapping("/ferramentas")
    public String listarFerramentas(Model model, FerramentaDTO ferramenta) {
        List<FerramentaDTO> lista = service.listarFerramentas(ferramenta);
        model.addAttribute("lista", lista);
        return "ferramentas";
    }
    @PostMapping("/ferramentas/salvar")
    public String adicionarFerramenta(FerramentaDTO ferramenta) {
        service.cadastrarFerramenta(ferramenta);
        return "salvarferramenta"; 
    }
}
