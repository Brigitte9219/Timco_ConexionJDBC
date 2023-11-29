
package com.timco.jdbc.modelo;

import java.sql.Date;

//Declaración de la clase Usuarios
public class Usuarios {
    
    //Definición de los atributos o variables
    private int idusuario;
    private String Nombre_Completo;
    private int trabajador_Numero_ID;
    private String Usuario;
    private String Contraseña;
    private String Confirmar_Contraseña;
    private String Proyecto;
    private String Género;
    private Date Fecha_Nacimiento;
    private String Correo_Electronico;
    private String Telefono_Movil;

    //Método constructor para inicializar las variables
    public Usuarios(int idusuario, String Nombre_Completo, int trabajador_Numero_ID, String Usuario, String Contraseña, String Confirmar_Contraseña, String Proyecto, String Género, Date Fecha_Nacimiento, String Correo_Electronico, String Telefono_Movil) {
        this.idusuario = idusuario;
        this.Nombre_Completo = Nombre_Completo;
        this.trabajador_Numero_ID = trabajador_Numero_ID;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Confirmar_Contraseña = Confirmar_Contraseña;
        this.Proyecto = Proyecto;
        this.Género = Género;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Correo_Electronico = Correo_Electronico;
        this.Telefono_Movil = Telefono_Movil;
    }

    //Getters y Setters - Acceder y Modificar
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre_Completo() {
        return Nombre_Completo;
    }

    public void setNombre_Completo(String Nombre_Completo) {
        this.Nombre_Completo = Nombre_Completo;
    }

    public int getTrabajador_Numero_ID() {
        return trabajador_Numero_ID;
    }

    public void setTrabajador_Numero_ID(int trabajador_Numero_ID) {
        this.trabajador_Numero_ID = trabajador_Numero_ID;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getConfirmar_Contraseña() {
        return Confirmar_Contraseña;
    }

    public void setConfirmar_Contraseña(String Confirmar_Contraseña) {
        this.Confirmar_Contraseña = Confirmar_Contraseña;
    }

    public String getProyecto() {
        return Proyecto;
    }

    public void setProyecto(String Proyecto) {
        this.Proyecto = Proyecto;
    }

    public String getGénero() {
        return Género;
    }

    public void setGénero(String Género) {
        this.Género = Género;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getTelefono_Movil() {
        return Telefono_Movil;
    }

    public void setTelefono_Movil(String Telefono_Movil) {
        this.Telefono_Movil = Telefono_Movil;
    }
    
    
    
    
}
