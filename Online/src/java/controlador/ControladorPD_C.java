/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.registroDAOPD_C;

import beens.registroBeensPD_C;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author patricia
 */
@WebServlet(name = "ControladorPD_C", urlPatterns = {"/ControladorPD_C"})
public class ControladorPD_C extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    registroBeensPD_C miRegisB = new registroBeensPD_C();
    registroDAOPD_C miRegisD = new registroDAOPD_C();
    int idPro;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("menu");
        String opc = request.getParameter("accion");

        if (op.equals("Ppal")) {
            request.getRequestDispatcher("productos_cat.jsp").forward(request, response);

        }
        if (op.equals("Producto")) {
            switch (opc) {

                case "mostrar":
                    request.getRequestDispatcher("productos.jsp").forward(request, response);
                    break;

                case "insertar":

                    String nom = request.getParameter("nombre");
                   

                    miRegisB.setNombre(nom);
                 

                    miRegisD.insertarP(miRegisB);

                    request.getRequestDispatcher("productos_cat.jsp").forward(request, response);
                    break;
                default:
                    throw new AssertionError();

                case "eliminar":
                    idPro = Integer.parseInt(request.getParameter("id"));

                    miRegisD.eliminar(idPro);
                    request.getRequestDispatcher("productos_cat.jsp").forward(request, response);
                    break;
                case "cargar":
                    idPro = Integer.parseInt(request.getParameter("id"));
                    registroBeensPD_C MiregisB_P = miRegisD.cargar(idPro);
                    request.setAttribute("producto", MiregisB_P);
                    request.getRequestDispatcher("productos_cat.jsp").forward(request, response);
                    break;
                case "modificar":
                    
                    String nombre = request.getParameter("nombre");
                    miRegisB.setNombre(nombre);
                    miRegisB.setId(idPro);
                    miRegisD.modificar(miRegisB);

                    request.getRequestDispatcher("productos_cat.jsp").forward(request, response);
                    break;

            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
