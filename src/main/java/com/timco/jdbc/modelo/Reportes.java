
package com.timco.jdbc.modelo;

import java.sql.Date;

//Definición de la clase Reportes
public class Reportes {
    
    //Definición de los atributos o variables
    private int idreportes;
    private String Nombre_Trabajador;
    private int trabajador_Numero_ID;
    private String Nombre_Producto;
    private Date Fecha_Inicio;
    private Date Fecha_Final;
    private String Proyecto;
    private String Area;
    private int usuarios_idusuario;

    //Método constructor para inicializar las variables
    public Reportes(int idreportes, String Nombre_Trabajador, int trabajador_Numero_ID, String Nombre_Producto, Date Fecha_Inicio, Date Fecha_Final, String Proyecto, String Area, int usuarios_idusuario) {
        this.idreportes = idreportes;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.trabajador_Numero_ID = trabajador_Numero_ID;
        this.Nombre_Producto = Nombre_Producto;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Final = Fecha_Final;
        this.Proyecto = Proyecto;
        this.Area = Area;
        this.usuarios_idusuario = usuarios_idusuario;
    }

    //Getters y Setters - Acceder y Modificar
    public int getIdreportes() {
        return idreportes;
    }

    public void setIdreportes(int idreportes) {
        this.idreportes = idreportes;
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

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(Date Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public Date getFecha_Final() {
        return Fecha_Final;
    }

    public void setFecha_Final(Date Fecha_Final) {
        this.Fecha_Final = Fecha_Final;
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

    public int getUsuarios_idusuario() {
        return usuarios_idusuario;
    }

    public void setUsuarios_idusuario(int usuarios_idusuario) {
        this.usuarios_idusuario = usuarios_idusuario;
    }
    
    
    
    
}
