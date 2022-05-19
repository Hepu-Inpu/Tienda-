/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeensPD_C;
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
 * @author SENA-WS-H50-1
 */
public class registroDAOPD_C {

    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;

    //======================================Insertar Producto=========================================================
    public int insertarP(registroBeensPD_C r) {

        String sql = "insert into pro_categoria(nombre)"
                + "value(?)";
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            
            ps.setString(1, r.getNombre());
           


            ps.executeUpdate();

        } catch (SQLException e) {
        }
        return resultado;
    } 
     //======================================listar Producto=========================================================
    
    public List getAll() throws SQLException{
        
            String sql = "select * from pro_categoria";
            List<registroBeensPD_C> lista = new ArrayList<>();
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            registroBeensPD_C RES = new registroBeensPD_C();
            RES.setId(rs.getInt("id"));
            RES.setNombre(rs.getString("nombre"));
            RES.setEstado(rs.getInt("estado"));
            lista.add(RES);
    }  
        return lista;
    
    }
    public boolean eliminar(int id){
               String sql="delete from pro_categoria where Id=" + id;
               
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
    public registroBeensPD_C cargar(int id){
    registroBeensPD_C miregisB_p = new registroBeensPD_C();
    String sql = "select * from pro_categoria where Id=" + id;
        try {
            cnx=con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                    miregisB_p.setNombre(rs.getString(2));
                    miregisB_p.setEstado(rs.getInt(3));
            
            }
        } catch (SQLException ex) {
             System.err.println(ex);
            Logger.getLogger(registroBeensPD_C.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miregisB_p;
    
    }
   public int modificar(registroBeensPD_C r) {

       
       String sql = "update pro_categoria SET nombre=? WHERE Id=?";
        try {
            cnx = con.ConexBD();
            
            
            ps = cnx.prepareStatement(sql);
            ps.setString(1, r.getNombre());
            
           
            
            
            ps.setInt(2, r.getId());

            ps.executeUpdate();

        } catch (Exception ex) {
             System.err.println(ex);
            Logger.getLogger(registroBeensPD_C.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    } 
 
    } 
    
    
    
    
    
        

     
