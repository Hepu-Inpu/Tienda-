/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.registroDAOP;
import beens.registroBeensP;
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
@WebServlet(name = "ControladorP", urlPatterns = {"/ControladorP"})
public class ControladorP extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    registroBeensP miregisB = new registroBeensP();
    registroDAOP miregisD = new registroDAOP();
    int idProC;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("menu");
        String opc = request.getParameter("accion");
        if (op.equals("Ppal")) {
            request.getRequestDispatcher("productos_cat.jsp").forward(request, response);

        }
        if (op.equals("Producto")) {
            switch (opc) {

                case "insertar":
                    String nom = request.getParameter("Nombre");
                    float cos = Float.parseFloat(request.getParameter("Costo"));
                    int can = Integer.parseInt(request.getParameter("Can"));
                    String des = request.getParameter("Desc");
                    int pC = Integer.parseInt(request.getParameter("categoria"));

                    miregisB.setNombre(nom);
                    miregisB.setCosto(cos);
                    miregisB.setCantidad(can);
                    miregisB.setDesc(des);
                    miregisB.setProd_cat_id(pC);

                    miregisD.insertar(miregisB);
                    request.getRequestDispatcher("producto.jsp").forward(request, response);
                    break;

                case "eliminar":

                    idProC = Integer.parseInt(request.getParameter("id"));

                    miregisD.eliminar(idProC);
                    request.getRequestDispatcher("producto.jsp").forward(request, response);

                    break;
                case "carga":
                    idProC = Integer.parseInt(request.getParameter("id"));
                    registroBeensP MiR = miregisD.cargar(idProC);
                    request.setAttribute("producto", MiR);
                    request.getRequestDispatcher("producto.jsp").forward(request, response);
                    break;
                case "modifica":

                    String nom1 = request.getParameter("Nombre");
                    float cos1 = Float.parseFloat(request.getParameter("Costo"));
                    String desc = request.getParameter("Desc");
                    int can1 = Integer.parseInt(request.getParameter("Can"));
                    int cat = Integer.parseInt(request.getParameter("categoria"));

                    miregisB.setNombre(nom1);
                    miregisB.setCosto(cos1);
                    miregisB.setDesc(desc);
                    miregisB.setCantidad(can1);
                    miregisB.setProd_cat_id(cat);

                    miregisB.setId(idProC);
                    miregisD.modificar(miregisB);

                    request.getRequestDispatcher("producto.jsp").forward(request, response);
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
