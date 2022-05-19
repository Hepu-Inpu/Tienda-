/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beens;

/**
 *
 * @author Vargas
 */
public class BeenCarrito {
    private int Id_car,Id_pro,Id_usr,Id_cat,precio,cantidad,item;
    private double subtotal;

    public BeenCarrito() {
    }

    public BeenCarrito(int Id_car, int Id_pro, int Id_cat, int precio, int cantidad, int item) {
    }

    public BeenCarrito(int Id_car, int Id_pro, int Id_usr, int Id_cat, int precio, int cantidad, int item, double subtotal) {
        this.Id_car = Id_car;
        this.Id_pro = Id_pro;
        this.Id_usr = Id_usr;
        this.Id_cat = Id_cat;
        this.precio = precio;
        this.cantidad = cantidad;
        this.item = item;
        this.subtotal = subtotal;
    }

    public int getId_car() {
        return Id_car;
    }

    public void setId_car(int Id_car) {
        this.Id_car = Id_car;
    }

    public int getId_pro() {
        return Id_pro;
    }

    public void setId_pro(int Id_pro) {
        this.Id_pro = Id_pro;
    }

    public int getId_usr() {
        return Id_usr;
    }

    public void setId_usr(int Id_usr) {
        this.Id_usr = Id_usr;
    }

    public int getId_cat() {
        return Id_cat;
    }

    public void setId_cat(int Id_cat) {
        this.Id_cat = Id_cat;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

   
    
   
}
/*IdPro = Integer.parseInt(request.getParameter("id"));
                    BeensProducto P = DAO.listarId(IdPro);
                    item=item+1;
                    BeenCarrito car = new BeenCarrito();
                    car.setItem(item);
                    car.setId_pro(P.getId());
                    car.setId_cat(P.getPro_cat_id());
                    car.setCantidad(cantidad);*/
