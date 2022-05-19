/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beens;

/**
 *
 * @author patricia
 */
public class registroBeensP {
    int id,cantidad,estado,prod_cat_id;
    private String nombre,desc;
    private float costo;

    public registroBeensP() {
    }

    public registroBeensP( int cantidad, int estado, int prod_cat_id, String nombre, String desc, float costo) {
        
        this.cantidad = cantidad;
        this.estado = estado;
        this.prod_cat_id = prod_cat_id;
        this.nombre = nombre;
        this.desc = desc;
        this.costo = costo;
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

    public int getProd_cat_id() {
        return prod_cat_id;
    }

    public void setProd_cat_id(int prod_cat_id) {
        this.prod_cat_id = prod_cat_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
   
    
    
    
}
