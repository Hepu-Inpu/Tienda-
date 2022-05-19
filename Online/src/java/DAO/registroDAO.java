/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexBD;
import beens.registroBeens;
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
public class registroDAO {

    ConexBD con = new ConexBD();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;

    //======================================Insertar Usuario=========================================================
    public int insertar(registroBeens r) {

        String sql = "insert into registro(nombres,contacto,correo,password)"
                + "values(?,?,?,?)";
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);

            ps.setString(1, r.getNombre());
            ps.setString(2, r.getContact());
            ps.setString(3, r.getEmail());
            ps.setString(4, r.getPass());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return resultado;
    } 
    
    //======================================validar Usuario=========================================================
    public registroBeens validar(String usr, String pss) {
        registroBeens miRegistro = new registroBeens();

        String sql = "Select * from registro where nombres=? and password=?";

        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            ps.setString(1, usr);
            ps.setString(2, pss);
            rs = ps.executeQuery();
            while (rs.next()) {
                miRegistro.setId(rs.getInt("Id"));
                miRegistro.setNombre(rs.getString("nombres"));
                miRegistro.setContact(rs.getString("contacto"));
                miRegistro.setEmail(rs.getString("correo"));
                miRegistro.setPass(rs.getString("password"));
                miRegistro.setRol(rs.getString("rol"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miRegistro;
    }

    
    //======================================Lista de Usuario=========================================================
    public List getAll() {
        String sql = "select * from registro";
        List<registroBeens> lista = new ArrayList<>();

        try {

            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registroBeens regM = new registroBeens();
                regM.setId(rs.getInt("Id"));
                regM.setNombre(rs.getString("nombres"));
                regM.setContact(rs.getString("contacto"));
                regM.setEmail(rs.getString("correo"));
                regM.setRol(rs.getString("rol"));

                lista.add(regM);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            Logger.getLogger(registroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
//======================================Eliminar Usuario=========================================================
    public boolean eliminar(int id) {
        String sql = "delete from registro where Id=" + id;

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
//======================================Cargar Usuario=========================================================
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
   
//======================================Modificar Usuario=========================================================
   public int modificar(registroBeens r) {

        String sql = "UPDATE registro SET nombres=?,contacto=?,correo=?" + " WHERE id=?";
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);

            ps.setString(1, r.getNombre());
            ps.setString(2, r.getContact());
            ps.setString(3, r.getEmail());
            ps.setString(4, r.getPass());
            
            ps.setInt(4, r.getId());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return resultado;
    } 
 
   
    }
        

     
