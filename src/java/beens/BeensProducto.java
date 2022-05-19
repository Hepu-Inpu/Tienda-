/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beens;

import java.io.InputStream;

/**
 *
 * @author varga
 */
    public class BeensProducto {
    int id,cantidad,estado,pro_cat_id,usr;
    private String nombres,descrip;
    private float costo;
    private double subtotal;
    private InputStream img;

    public BeensProducto() {
    }

    public BeensProducto(int id, int cantidad, int estado, int pro_cat_id, int usr, String nombres, String descrip, float costo, double subtotal, InputStream img) {
        this.id = id;
        this.cantidad = cantidad;
        this.estado = estado;
        this.pro_cat_id = pro_cat_id;
        this.usr = usr;
        this.nombres = nombres;
        this.descrip = descrip;
        this.costo = costo;
        this.subtotal = subtotal;
        this.img = img;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getPro_cat_id() {
        return pro_cat_id;
    }

    public void setPro_cat_id(int pro_cat_id) {
        this.pro_cat_id = pro_cat_id;
    }

    public int getUsr() {
        return usr;
    }

    public void setUsr(int usr) {
        this.usr = usr;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public InputStream getImg() {
        return img;
    }

    public void setImg(InputStream img) {
        this.img = img;
    }

    
    
}