/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.CarritoDAO;
import DAO.ProductoDAO;
import DAO.RegistroDAO;

import beens.BeenCarrito;
import beens.BeensProducto;
import beens.RegistroBeens;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vargas
 */
@WebServlet(name = "ControladorCar", urlPatterns = {"/ControladorCar"})
public class ControladorCar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    List<BeensProducto> Listacarrito = new ArrayList<>();
    List<BeenCarrito> Listacar = new ArrayList<>();
    List<BeenCarrito> Listacar2 = new ArrayList<>();
    ProductoDAO DAO = new ProductoDAO();
    CarritoDAO DAOc = new CarritoDAO();
    RegistroDAO DAOu = new RegistroDAO();
    BeenCarrito car = new BeenCarrito();
    int cantidad = 1;
    int pos = 0;
    int IdPro;
    int IdUsr;
    int item;
    double totalpagar = 0.0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        IdUsr = Integer.parseInt(request.getParameter("idU"));
        String acc = request.getParameter("accion");
        String Men = request.getParameter("menu");

        if (acc.equals("Carr")) {
            switch (Men) {

                case "mostrar":
                    IdUsr = Integer.parseInt(request.getParameter("idU"));
                    List lis1 = new CarritoDAO().getAll(IdUsr);
                    ListIterator list1 = lis1.listIterator();
                    while (list1.hasNext()) {

                        BeensProducto Produ = (BeensProducto) list1.next();
                        Listacarrito.add(Produ);
                        item++;
                        request.setAttribute("contador", item);
                        Listacarrito.clear();

                    }
                    item = 0;
                    request.getRequestDispatcher("Produc_Usu.jsp").forward(request, response);
                    break;
                case "Agregar":

                    IdPro = Integer.parseInt(request.getParameter("id"));
                    IdUsr = Integer.parseInt(request.getParameter("idU"));
                    BeensProducto P = DAO.ListarCar(IdPro);
//                    BeenCarrito car = DAOc.listar();
//                    Listacar2.add(car);
//
//                    if (Listacar2.size() > 0) {
//                        for (int i = 0; i < Listacar2.size(); i++) {
//                            if (IdPro == Listacar2.get(i).getId_pro()) {
//                                pos = i;
//
//                            }
//                            if (IdPro == Listacar2.get(i).getId_pro()) {
//                                cantidad = Listacar2.get(pos).getCantidad() + cantidad;
//                                Listacar2.get(pos).setCantidad(cantidad);
//                                P.setCantidad(cantidad);
//                            } else {
//                               
//
//                            }
//                        }
//                    }
                    car.setId_cat(P.getPro_cat_id());
                    car.setId_pro(P.getId());
                    car.setId_usr(IdUsr);

                    DAOc.insertar(car);
//                    Listacar2.clear();
                    List lis3 = new CarritoDAO().getAll(IdUsr);
                    ListIterator list3 = lis3.listIterator();
                    while (list3.hasNext()) {

                        BeensProducto Produ = (BeensProducto) list3.next();
                        Listacarrito.add(Produ);
                        item++;
                        request.setAttribute("contador", item);

                    }
                    item = 0;
                    request.getRequestDispatcher("Produc_Usu.jsp").forward(request, response);
                    break;
                case "Carrito":
                    IdUsr = Integer.parseInt(request.getParameter("idU"));
                    List lis2 = new CarritoDAO().getAll(IdUsr);
                    ListIterator list2 = lis2.listIterator();
                    while (list2.hasNext()) {

                        BeensProducto Produ = (BeensProducto) list2.next();
                        Listacarrito.add(Produ);
                        item++;
                        request.setAttribute("contador", item);
                        Listacarrito.clear();

                    }
                    item = 0;
                    request.getRequestDispatcher("Carrito.jsp").forward(request, response);
                    break;
                case "eliminar":
                    IdPro = Integer.parseInt(request.getParameter("id"));
                    DAOc.eliminar(IdPro);

                    IdUsr = Integer.parseInt(request.getParameter("idU"));
                    List lis5 = new CarritoDAO().getAll(IdUsr);
                    ListIterator list5 = lis5.listIterator();
                    while (list5.hasNext()) {

                        BeensProducto Produ = (BeensProducto) list5.next();
                        Listacarrito.add(Produ);
                        item++;
                        request.setAttribute("contador", item);
                        Listacarrito.clear();

                    }
                    item = 0;

                    request.getRequestDispatcher("Carrito.jsp").forward(request, response);
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
