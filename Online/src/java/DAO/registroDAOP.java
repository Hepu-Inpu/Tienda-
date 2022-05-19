/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeensP;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patricia
 */
public class registroDAOP {

    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;

    public int insertar(registroBeensP r) {
        String sql = "insert into productos(nombres,costo,descripcion,cantidad,id_categoria)"+
                "values(?,?,?,?,?)";

       try {
            cnx=con.ConexBD();
            ps=cnx.prepareStatement(sql);
            
            ps.setString(1,r.getNombre());
            ps.setFloat(2,r.getCosto());
            ps.setString(3,r.getDesc());
            ps.setInt(4,r.getCantidad());
            ps.setInt(5,r.getProd_cat_id());
            
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return resultado;
    }
    public List getAll() {
        String sql = "select * from productos";
        List<registroBeensP> lista = new ArrayList<>();

        try {

            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registroBeensP regM = new registroBeensP();
                regM.setId(rs.getInt("id"));
                regM.setNombre(rs.getString("nombres"));
                regM.setCosto(rs.getFloat("costo"));
                regM.setDesc(rs.getString("descripcion"));
                regM.setCantidad(rs.getInt("cantidad"));
                regM.setEstado(rs.getInt("estado"));
                regM.setProd_cat_id(rs.getInt("id_categoria"));

                lista.add(regM);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
    public boolean eliminar(int id){
       String sql = "delete from productos where id=" + id;

        try {
            cnx = con.ConexBD();
            Statement st = cnx.createStatement();
            int estado = st.executeUpdate(sql);
            if (estado > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public registroBeensP cargar(int id){
        
        registroBeensP miregib = new registroBeensP();
        String sql = "select * from productos where id=" + id;;
        try {
        cnx = con.ConexBD();
        ps = cnx.prepareStatement(sql);
        rs=ps.executeQuery();
            while (rs.next()) {
                miregib.setNombre(rs.getString(2));
                miregib.setCantidad(rs.getInt(5));
                miregib.setCosto(rs.getFloat(3));
                //miregib.setProd_cat_id(rs.getInt(7));
                miregib.setDesc(rs.getString(4));   
            }
        
        
        } catch (Exception ex) {
             System.err.println(ex);
            Logger.getLogger(registroBeensP.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miregib;
        }
        public int modificar(registroBeensP r){
            String sql = "update productos set nombres=?, costo=?, descripcion=?, cantidad=?, id_categoria=?"+ " where id=?";
        
            try {
                cnx = con.ConexBD();
                ps = cnx.prepareStatement(sql);
                
                
                
                ps.setString(1, r.getNombre());
                ps.setFloat(2, r.getCosto());
                ps.setString(3, r.getDesc());
                ps.setInt(4, r.getCantidad());
                ps.setInt(5, r.getProd_cat_id());
                
                ps.setInt(6, r.getId());
                
                ps.executeUpdate();
            } catch (Exception e) {
            }
        return resultado;
        }
    
    
    
    }
    
    

