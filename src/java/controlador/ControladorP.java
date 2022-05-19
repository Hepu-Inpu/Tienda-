/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.ProductoDAO;
import beens.BeensProducto;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author varga
 */
@MultipartConfig
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
    BeensProducto BeensP = new BeensProducto();
    ProductoDAO DAO_P = new ProductoDAO();
    int IdPro;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String men = request.getParameter("menu");
        String acc = request.getParameter("accion");
        
        if(acc.equals("prin")){
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
        }
        if(men.equals("Produ")){
            switch(acc){
                case "Mostrar":
                    request.getRequestDispatcher("Productos.jsp").forward(request, response);
                case "Cargar":
                    IdPro = Integer.parseInt(request.getParameter("id"));
                    BeensProducto BeensC = DAO_P.cargar(IdPro);
                    request.setAttribute("Produ",BeensC);
                    request.getRequestDispatcher("Productos.jsp").forward(request,response);
                   break; 
                case "Insertar":
                    String nomP = request.getParameter("nom");
                    float cosP = Float.parseFloat(request.getParameter("cos"));
                    String desP = request.getParameter("des");
                    Part Img = request.getPart("img");
                    InputStream ImgR = Img.getInputStream();
                    int canP = Integer.parseInt(request.getParameter("can"));
                    int catP = Integer.parseInt(request.getParameter("cat"));
                    
                    BeensP.setNombres(nomP);
                    BeensP.setCosto(cosP);
                    BeensP.setDescrip(desP);
                    BeensP.setImg(ImgR);
                    BeensP.setCantidad(canP);
                    BeensP.setPro_cat_id(catP);
                    
                    DAO_P.insertar(BeensP);
                    request.getRequestDispatcher("Productos.jsp").forward(request,response);
                    break;
                case "Borrar":
                    IdPro = Integer.parseInt(request.getParameter("id"));
                    DAO_P.eliminar(IdPro);
                    request.getRequestDispatcher("Productos.jsp").forward(request,response);
                    break;
                case "Modificar":
                    String nomPM = request.getParameter("nom");
                    float cosPM = Float.parseFloat(request.getParameter("cos"));
                    Part ImgP = request.getPart("img");
                    InputStream ImgPM = ImgP.getInputStream();
                    String desPM = request.getParameter("des");
                    int canPM = Integer.parseInt(request.getParameter("can"));
                    int catPM = Integer.parseInt(request.getParameter("cat"));
                    
                    BeensP.setNombres(nomPM);
                    BeensP.setCosto(cosPM);
                    BeensP.setDescrip(desPM);
                    BeensP.setImg(ImgPM);
                    BeensP.setCantidad(canPM);
                    BeensP.setPro_cat_id(catPM);
                    
                    BeensP.setId(IdPro);
                    DAO_P.modificar(BeensP);
                    request.getRequestDispatcher("Productos.jsp").forward(request,response);
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
