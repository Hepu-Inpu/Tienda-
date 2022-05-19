/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexBD.conex;
import beens.BeensProducto;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author varga
 */
public class ProductoDAO {

    /*creamos el constructor de la conexcion a la BD,
    para llamar todos los metodos que tengamos en esa clase */
    conex con = new conex();
    /*un metodo connection y esto devolverá un valor de tipo "Connection"
    en pocas palabras es la Conexión a la BD*/
    Connection cnx;
    /*como vamos a invocar la sentencia SQL varias veces, 
    es mejor que este precompilada y preparada para que tenga un uso mas eficciente*/
    PreparedStatement ps;
    /* despues de hacer la consulta a la BD, los resultados nos lo devolvera como un resultado "ResultSet"
    por esto mimso creamos esta variable*/
    ResultSet rs;
    int resultado;

    // creamos un metodo insertar, con el BeensProducto incorporado.
    public int insertar(BeensProducto Pr) {

        //creamos y preparamos la sentencia SQL y para mejor manejo se la asignamos a una variable 
        String SQL = "insert into productos(nombres,costo,descripcion,cantidad,id_categoria,img)" + "values(?,?,?,?,?,?)";

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
            ps.setString(1, Pr.getNombres());
            ps.setFloat(2, Pr.getCosto());
            ps.setString(3, Pr.getDescrip());
            ps.setInt(4, Pr.getCantidad());
            ps.setInt(5, Pr.getPro_cat_id());
            ps.setBlob(6, Pr.getImg());

            /*Una vez asignados los parámetros, podremos ejecutar 
            la sentencia llamando al método executeUpdate del objeto PreparedStatement:*/
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return resultado;
    }

    public BeensProducto listarId(int id) {
        String SQL = "select * from productos where id=" + id;
        BeensProducto BP = new BeensProducto();
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                BP.setId(rs.getInt("id"));
                BP.setNombres(rs.getString("nombres"));
                BP.setCosto(rs.getFloat("costo"));
                BP.setDescrip(rs.getString("descripcion"));
                BP.setCantidad(rs.getInt("cantidad"));
                BP.setEstado(rs.getInt("estado"));
                BP.setPro_cat_id(rs.getInt("id_categoria"));
            }
        } catch (Exception e) {
        }
        return BP;

    }

    public List getAll() {
        String SQL = " select * from productos";
        List<BeensProducto> lista = new ArrayList<>();
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                BeensProducto BP = new BeensProducto();
                BP.setId(rs.getInt("id"));
                BP.setNombres(rs.getString("nombres"));
                BP.setCosto(rs.getFloat("costo"));
                BP.setDescrip(rs.getString("descripcion"));
                BP.setCantidad(rs.getInt("cantidad"));
                BP.setEstado(rs.getInt("estado"));
                BP.setPro_cat_id(rs.getInt("id_categoria"));

                lista.add(BP);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    public BeensProducto cargar(int id) {

        BeensProducto BeP = new BeensProducto();
        String SQL = "select * from productos where id=" + id;
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {

                BeP.setNombres(rs.getString(2));
                BeP.setCosto(rs.getFloat(3));
                BeP.setDescrip(rs.getString(4));
                BeP.setCantidad(rs.getInt(5));
                BeP.setPro_cat_id(rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return BeP;
    }

    public void listarImg(int Id, HttpServletResponse response) {
        String sql = "select * from productos where id=" + Id;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            outputStream = response.getOutputStream();
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(sql);

            rs = ps.executeQuery();
            if (rs.next()) {
                inputStream = rs.getAsciiStream("img");
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outputStream);
            int i = 0;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        } catch (Exception ex) {

        }

    }

    public BeensProducto ListarCar(int id) {

        BeensProducto BeP = new BeensProducto();
        String SQL = "select * from productos where id=" + id;
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                BeP.setId(rs.getInt(1));
                BeP.setNombres(rs.getString(2));
                BeP.setCosto(rs.getFloat(3));
                BeP.setDescrip(rs.getString(4));
                BeP.setCantidad(rs.getInt(5));
                BeP.setPro_cat_id(rs.getInt(7));
            }
        } catch (Exception e) {
        }
        return BeP;
    }

    public boolean eliminar(int id) {
        String SQL = "delete from productos where id=" + id;
        try {
            cnx = con.ConexBD();
            Statement st = cnx.createStatement();
            int estado = st.executeUpdate(SQL);
            if (estado > 0) {
                return true;
            }

        } catch (Exception ex) {
            System.err.println(ex);
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int modificar(BeensProducto Pr) {

        String SQL = "update productos set nombres=?, costo=?, descripcion=?, cantidad=?, id_categoria=?, img=?" + " where id=?";
        //String SQL ="update productos set nombres=?, costo=?, descripcion=?, cantidad=?, id_categoria=?"+ " where id=?";
        try {
            cnx = con.ConexBD();
            ps = cnx.prepareStatement(SQL);

            ps.setString(1, Pr.getNombres());
            ps.setFloat(2, Pr.getCosto());
            ps.setString(3, Pr.getDescrip());
            ps.setInt(4, Pr.getCantidad());
            ps.setInt(5, Pr.getPro_cat_id());
            ps.setBlob(6, Pr.getImg());

            ps.setInt(7, Pr.getId());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return resultado;

    }

}
