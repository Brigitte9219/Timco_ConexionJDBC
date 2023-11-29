
package com.timco.jdbc.modelo;

import java.sql.Date;


//Definición de la clase Asignación
public class Asignacion {
    
    //Definición de los atributos o variables
    private int idasignacion;
    private Date Fecha_Asignacion;
    private int Nombre_Trabajador;
    private int trabajador_Numero_ID;
    private String producto_Nombre_Producto;
    private int Cantidad;
    private String Talla;
    private String Proyecto;
    private String Area;
    private String Observaciones;
    private int usuarios_idusuario;

    //Método constructor para inicializar los atributos
    public Asignacion(int idasignacion, Date Fecha_Asignacion, int Nombre_Trabajador, int trabajador_Numero_ID, String producto_Nombre_Producto, int Cantidad, String Talla, String Proyecto, String Area, String Observaciones, int usuarios_idusuario) {
        this.idasignacion = idasignacion;
        this.Fecha_Asignacion = Fecha_Asignacion;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.trabajador_Numero_ID = trabajador_Numero_ID;
        this.producto_Nombre_Producto = producto_Nombre_Producto;
        this.Cantidad = Cantidad;
        this.Talla = Talla;
        this.Proyecto = Proyecto;
        this.Area = Area;
        this.Observaciones = Observaciones;
        this.usuarios_idusuario = usuarios_idusuario;
    }

    // Getters y setters - Acceder y Modificar
    public int getIdasignacion() {
        return idasignacion;
    }

    public void setIdasignacion(int idasignacion) {
        this.idasignacion = idasignacion;
    }

    public Date getFecha_Asignacion() {
        return Fecha_Asignacion;
    }

    public void setFecha_Asignacion(Date Fecha_Asignacion) {
        this.Fecha_Asignacion = Fecha_Asignacion;
    }

    public int getNombre_Trabajador() {
        return Nombre_Trabajador;
    }

    public void setNombre_Trabajador(int Nombre_Trabajador) {
        this.Nombre_Trabajador = Nombre_Trabajador;
    }

    public int getTrabajador_Numero_ID() {
        return trabajador_Numero_ID;
    }

    public void setTrabajador_Numero_ID(int trabajador_Numero_ID) {
        this.trabajador_Numero_ID = trabajador_Numero_ID;
    }

    public String getProducto_Nombre_Producto() {
        return producto_Nombre_Producto;
    }

    public void setProducto_Nombre_Producto(String producto_Nombre_Producto) {
        this.producto_Nombre_Producto = producto_Nombre_Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getProyecto() {
        return Proyecto;
    }

    public void setProyecto(String Proyecto) {
        this.Proyecto = Proyecto;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public int getUsuarios_idusuario() {
        return usuarios_idusuario;
    }

    public void setUsuarios_idusuario(int usuarios_idusuario) {
        this.usuarios_idusuario = usuarios_idusuario;
    }
    
    
    
       
}
