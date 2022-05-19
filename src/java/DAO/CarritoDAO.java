/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexBD.conex;
import beens.BeenCarrito;
import beens.BeensCategorias;
import beens.BeensProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author varga
 */
public class CarritoDAO {

    conex con = new conex();
    Connection cnx;
    PreparedStatement ps;
    ResultSet rs;
    int resultado;

    public int insertar(BeenCarrito Pr) {

        //creamos y preparamos la sentencia SQL y para mejor manejo se la asignamos a una variable 
        String SQL = "insert into carrito(id_categoria,id_producto,id_usr) values(?,?,?)";

        // creamos un try catch 
        try {
            /* con el objeto creado anteriormente traemos el metodod ConexBD()
            y se lo asignamos a la variable connection 
             */
            cnx = con.ConexBD();

            /* despues de tener la conexcion a la BD para realizar las acciones,
            debemos enviarsela en lenguaje SQL y la clase Statement es la 
            que nos permite realizar estas operaciones  */
 /* del metodo connection llamado "cnx" se utliza el metodo prepareStatement y 
            le proporcionamos la sentencia SQL en el momento de su creación, por lo 
            que estará preparado y optimizado para la ejecución de dicha sentencia posteriormente.*/
            ps = cnx.prepareStatement(SQL);

            /*Para dar valor a estos parámetros utilizaremos los métodos set<> donde <>
            será el tipo de los datos que asignamos al parámetro (esto va de los métodos 
            del ResultSet), indicando el número del parámetro (que empieza desde 1) 
            y el valor que le queremos dar*/
            ps.setInt(1, Pr.getId_cat());
            ps.setInt(2, Pr.getId_pro());
            ps.setInt(3, Pr.getId_usr());

            /*Una vez asignados los parámetros, podremos ejecutar 
            la sentencia llamando al método executeUpdate del objeto PreparedStatement:*/
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return resultado;
    }

    public List getAll(int id) {
        //String SQL = "SELECT c.id,P.nombres,P.costo,P.descripcion,P.cantidad,P.id_categoria "
        //+ "FROM carrito as C INNER JOIN productos as P ON C.id_producto=P.id;";
        String SQL = "SELECT C.IdC,P.nombres,P.costo,P.descripcion,P.cantidad,P.id_categoria,P.id FROM carrito as C "
                + "INNER JOIN productos as P ON C.id_producto=P.id "
                + "INNER JOIN registro as R ON C.id_usr=R.id WHERE R.id=" + id;
        List<BeensProducto> lista = new ArrayList<>();
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                BeensProducto BP = new BeensProducto();
                BP.setId(rs.getInt("IdC"));
                BP.setNombres(rs.getString("nombres"));
                BP.setCosto(rs.getFloat("costo"));
                BP.setDescrip(rs.getString("descripcion"));
                BP.setPro_cat_id(rs.getInt("id"));

                lista.add(BP);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    public List getAll2(int id) {
        //String SQL = "SELECT c.id,P.nombres,P.costo,P.descripcion,P.cantidad,P.id_categoria "
        //+ "FROM carrito as C INNER JOIN productos as P ON C.id_producto=P.id;";
        String SQL = " select * from carrito where id=" + id;
        List<BeenCarrito> lista = new ArrayList<>();
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                BeenCarrito BP = new BeenCarrito();
                BP.setId_car(rs.getInt(1));
                BP.setId_cat(rs.getInt(2));
                BP.setId_pro(rs.getInt(3));
                lista.add(BP);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    public BeenCarrito listar() {
        //String SQL = "SELECT c.id,P.nombres,P.costo,P.descripcion,P.cantidad,P.id_categoria "
        //+ "FROM carrito as C INNER JOIN productos as P ON C.id_producto=P.id;";
        String SQL = " select * from carrito";
        BeenCarrito car = new BeenCarrito();
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                car.setId_car(rs.getInt(1));
                car.setId_cat(rs.getInt(2));
                car.setId_pro(rs.getInt(3));
                car.setId_usr(rs.getInt(4));
            }

        } catch (Exception e) {
        }
        return car;
    }

    public boolean eliminar(int id) {
        String SQL = "delete from carrito where IdC=" + id;
        try {
            cnx = con.ConexBD();
            Statement st = cnx.createStatement();
            int estado = st.executeUpdate(SQL);
            if (estado > 0) {
                return true;
            }

        } catch (Exception ex) {
            System.err.println(ex);
            Logger.getLogger(BeensCategorias.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
