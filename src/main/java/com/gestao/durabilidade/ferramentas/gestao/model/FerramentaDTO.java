/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestao.durabilidade.ferramentas.gestao.model;

/**
 *
 * @author farma
 */
public class FerramentaDTO {
    public int id;
    public String nome;
    public Integer horasUso;
    public Integer vidaUtilMaxima;

    public FerramentaDTO() {
    }

    public FerramentaDTO(int id, String nome, Integer horasUso, Integer vidaUtilMaxima) {
        this.id = id;
        this.nome = nome;
        this.horasUso = horasUso;
        this.vidaUtilMaxima = vidaUtilMaxima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(Integer horasUso) {
        this.horasUso = horasUso;
    }

    public Integer getVidaUtilMaxima() {
        return vidaUtilMaxima;
    }

    public void setVidaUtilMaxima(Integer vidaUtilMaxima) {
        this.vidaUtilMaxima = vidaUtilMaxima;
    }
    
    public Double getPercentualDesgaste() {
        double percentualDesgaste = (horasUso / vidaUtilMaxima) * 100;
        return percentualDesgaste;
    }
}
