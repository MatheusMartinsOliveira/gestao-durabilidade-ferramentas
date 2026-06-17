/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestao.durabilidade.ferramentas.gestao.repository;

import com.gestao.durabilidade.ferramentas.gestao.model.FerramentaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author farma
 */
@Repository
public class FerramentaRepository {
    public int cadastrarFerramenta(FerramentaDTO ferramenta){
        int linhasAfetadas = 0;
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("insert into tb_ferramenta(nome, horas_uso, vida_util_max) values(?, ?,?)");
            stmt.setString(1, ferramenta.getNome());
            stmt.setInt(2, ferramenta.getHorasUso());
            stmt.setInt(3, ferramenta.getVidaUtilMaxima());
            
            linhasAfetadas = stmt.executeUpdate();
            
        } catch(SQLException e) {
        e.printStackTrace();
        } return linhasAfetadas;
    } 
    
    public List<FerramentaDTO> lerTodos() {
        List<FerramentaDTO> dados = new ArrayList();
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conn.prepareStatement("select * from tb_ferramenta");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                FerramentaDTO ferramenta = new FerramentaDTO();
                ferramenta.setId(rs.getInt("id_ferramenta"));
                ferramenta.setNome(rs.getString("nome"));
                ferramenta.setHorasUso(rs.getInt("horas_uso"));
                ferramenta.setVidaUtilMaxima(rs.getInt("vida_util_max"));
                dados.add(ferramenta);
            }
        } catch(SQLException e) {
            
        } return dados;
    }
    
    public int deleteById(int id) {
        int linhasAfetadas = 0;
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("delete * from tb_ferramenta where id_ferramenta = ?");
            stmt.setInt(1, id);
            linhasAfetadas = stmt.executeUpdate();
            
            
        }catch(SQLException e) {
            e.printStackTrace();
        } return linhasAfetadas;
    }
    
    public int editarFerramenta(FerramentaDTO ferramenta) {
        int linhasAfetadas = 0;
        try {
            Connection conn = Conexao.conectar();
            PreparedStatement stmt = null;
            
            stmt = conn.prepareStatement("update tb_ferramenta set nome = ?, horas_uso = ?, vida_util_max = ? where id_ferramenta = ?");
            stmt.setString(1, ferramenta.getNome());
            stmt.setInt(2, ferramenta.getHorasUso());
            stmt.setInt(3, ferramenta.getVidaUtilMaxima());
            stmt.setInt(4, ferramenta.getId());
            linhasAfetadas = stmt.executeUpdate();
            
        } catch(SQLException e) {
            e.printStackTrace();
        } return linhasAfetadas;
    } 
}
