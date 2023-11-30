
package com.timco.jdbc.modelo;

import java.sql.Date;

//Definición de la clase Solicitud
public class Solicitud {
    
    //Definición de los atributos o variables
    private int idsolicitud;
    private Date Fecha_Solicitud;
    private String Nombre_Trabajador;
    private int trabajador_Numero_ID;
    private String producto_Nombre_Producto;
    private int Cantidad;
    private String Talla;
    private String Actividad_aRealizar;
    private String Proyecto;
    private String Area;
    private String Observaciones;

    /*
    //Método constructor para inicializar las variables
    public Solicitud(int idsolicitud, Date Fecha_Solicitud, String Nombre_Trabajador, int trabajador_Numero_ID, String producto_Nombre_Producto, int Cantidad, String Talla, String Actividad_aRealizar, String Proyecto, String Area, String Observaciones) {
        this.idsolicitud = idsolicitud;
        this.Fecha_Solicitud = Fecha_Solicitud;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.trabajador_Numero_ID = trabajador_Numero_ID;
        this.producto_Nombre_Producto = producto_Nombre_Producto;
        this.Cantidad = Cantidad;
        this.Talla = Talla;
        this.Actividad_aRealizar = Actividad_aRealizar;
        this.Proyecto = Proyecto;
        this.Area = Area;
        this.Observaciones = Observaciones;
    }*/
    
    //Getters y Setters - Acceder y Modificar
    public int getIdsolicitud() {
        return idsolicitud;
    }

    public void setIdsolicitud(int idsolicitud) {
        this.idsolicitud = idsolicitud;
    }

    public Date getFecha_Solicitud() {
        return Fecha_Solicitud;
    }

    public void setFecha_Solicitud(Date Fecha_Solicitud) {
        this.Fecha_Solicitud = Fecha_Solicitud;
    }

    public String getNombre_Trabajador() {
        return Nombre_Trabajador;
    }

    public void setNombre_Trabajador(String Nombre_Trabajador) {
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

    public String getActividad_aRealizar() {
        return Actividad_aRealizar;
    }

    public void setActividad_aRealizar(String Actividad_aRealizar) {
        this.Actividad_aRealizar = Actividad_aRealizar;
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
    
    
    
}
