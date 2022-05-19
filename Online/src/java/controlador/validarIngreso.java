/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.registroDAO;
import beens.registroBeens;
import static java.awt.SystemColor.window;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SENA-WS-H50-1
 */
public class validarIngreso extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    registroBeens miRegM = new registroBeens();
    registroDAO miRegDAO = new registroDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
        String acc = request.getParameter("accion");
        if (acc.equals("Ingresar")) {

            String usr = request.getParameter("txtUser");
            String pss = request.getParameter("txtPass");
            //String rol = request.getParameter("rol");
            miRegM = miRegDAO.validar(usr, pss);
            if (miRegM.getNombre() != null) {

                if (miRegM.getRol().equals("administrador")) {
                   request.getSession().setAttribute("admin", miRegM);
                   request.getRequestDispatcher("ControladorU?menu=Ppal").forward(request, response);
                   // request.setAttribute("usuario", miRegM);
                    //request.getRequestDispatcher("ControladorU?menu=Ppal").forward(request, response);

                } else if (miRegM.getRol().equals("usuario")) {
                
                    
                    request.getSession().setAttribute("usu",miRegM);
                     request.setAttribute("usu",miRegM);
                        request.getRequestDispatcher("Usuario.jsp").forward(request, response);
                }else {
                request.getRequestDispatcher("fallido.jsp").forward(request, response);
                }
            } else {
                request.getRequestDispatcher("fallido.jsp").forward(request, response);

            }

        } else {
            request.getRequestDispatcher("fallido.jsp").forward(request, response);
        }
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
