/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patricia
 */
public class registroDAO_UO {
    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;
    public registroBeens cargar(int id) {
        registroBeens miRegisB = new registroBeens();
        String sql = "select * from registro where Id=" + id;
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                miRegisB.setNombre(rs.getString(2));
                miRegisB.setContact(rs.getString(3));
                miRegisB.setEmail(rs.getString(4));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            Logger.getLogger(registroBeens.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miRegisB;
    }
      public int modificar(registroBeens r) {

        String sql = "UPDATE registro SET nombres=?,contacto=?,correo=?" + " WHERE Id=?";
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);

            ps.setString(1, r.getNombre());
            ps.setString(2, r.getContact());
            ps.setString(3, r.getEmail());
            ps.setString(4, r.getPass());
            
            ps.setInt(4, r.getId());

            ps.executeUpdate();
           
        } catch (SQLException ex) {
            System.err.println(ex);
            Logger.getLogger(registroBeens.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    } 
}
