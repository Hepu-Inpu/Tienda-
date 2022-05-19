
package ConexBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vargas
 */
public class conex {
    // especificamos las variables que vamos a necesitar para la Conexión
    
    /*un metodo connection y esto devolverá un valor de tipo "Connection"
    en pocas palabras es la Conexión a la BD, podremos obtener instancias de Statement,
    con las que se pueden enviar instrucciones SQL al servidor de base de datos.*/
    Connection cnx;
    //URL de la BD 
    String url = "jdbc:mysql://localhost/inventarios";
    //usuarios de la BD 
    String usr = "root";
    //contraseña de la BD 
    String pass = "";

    public Connection ConexBD() {

        try {
            //lo que hace este codigo es cargar los drivers para poder utlizarlos 
            Class.forName("com.mysql.jdbc.Driver");
            /*se hace la autentificacion de la bd, 
            La conexión a la BD está encapsulada en un objeto Connection*/
            cnx = (Connection)DriverManager.getConnection(url, usr, pass);
            if (cnx != null) {
                System.out.println("Conexión establecida");
                return cnx;
            }
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(conex.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error" + ex);
        } catch (SQLException ex) {
           Logger.getLogger(conex.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("el error" + ex);
        }
        return null;

    }

    public static void main(String[] args) {
        conex miCone = new conex();
        miCone.ConexBD();
    }

}