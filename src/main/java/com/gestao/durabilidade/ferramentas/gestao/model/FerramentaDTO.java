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
    private int id;
    private String nome;
    private Integer horasUso;
    private Integer vidaUtilMaxima;
    private String status;
    
    private int idGalpao;
    private int idUsuarioResponsavel;

    public FerramentaDTO() {
    }

    public FerramentaDTO(int id, String nome, Integer horasUso, Integer vidaUtilMaxima, String status, int idGalpao, int idUsuarioResponsavel) {
        this.id = id;
        this.nome = nome;
        this.horasUso = horasUso;
        this.vidaUtilMaxima = vidaUtilMaxima;
        this.status = status;
        this.idGalpao = idGalpao;
        this.idUsuarioResponsavel = idUsuarioResponsavel;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdGalpao() {
        return idGalpao;
    }

    public void setIdGalpao(int idGalpao) {
        this.idGalpao = idGalpao;
    }

    public int getIdUsuarioResponsavel() {
        return idUsuarioResponsavel;
    }

    public void setIdUsuarioResponsavel(int idUsuarioResponsavel) {
        this.idUsuarioResponsavel = idUsuarioResponsavel;
    }
    
    

    public Double getPercentualDesgaste() {
        double percentualDesgaste = (horasUso / vidaUtilMaxima) * 100;
        return percentualDesgaste;
    }
}
