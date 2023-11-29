
package com.timco.jdbc.modelo;

import java.sql.Date;

//Definición de la clase Trabajador
public class Trabajador {
    
    //Definición de los atributos o variables de la clase
    private int idtrabajador;
    private String Nombre_Completo;
    private String Correo_Electronico;
    private String Tipo_ID;
    private int Numero_ID;
    private Date Fecha_Expedicion;
    private String Ciudad_Expedicion;
    private Date Fecha_Nacimiento;
    private String Lugar_Nacimiento;
    private int Edad;
    private double Estatura;
    private String Genero;
    private String Estado_Civil;
    private String RH;
    private String Grupo_Sanguineo;
    private String Localidad;
    private String Ciudad_Residencia;
    private String Barrio;
    private String Direccion;
    private String Telefono_Movil;
    private String Telefono_Fijo;
    private String EPS;
    private String AFP;
    private String Escolaridad;
    private String Profesion;
    private String Talla_Camisa;
    private String Talla_Pantalon;
    private String Talla_Chaqueta;
    private String Talla_Calzado;
    private String Emergencia_NombreCompleto;
    private String Emergencia_Parentesco;
    private String Emergencia_TelefonoMovil;
    private String Emergencia_TelefonoFijo;
    private int usuarios_idusuario;

    public Trabajador() {
    }

    
    /*
    // Método constructor para inicializar los atributos
    public Trabajador(int idtrabajador, String Nombre_Completo, String Correo_Electronico, String Tipo_ID, int Numero_ID, Date Fecha_Expedicion, String Ciudad_Expedicion, Date Fecha_Nacimiento, String Lugar_Nacimiento, int Edad, double Estatura, String Genero, String Estado_Civil, String RH, String Grupo_Sanguineo, String Localidad, String Ciudad_Residencia, String Barrio, String Direccion, String Telefono_Movil, String Telefono_Fijo, String EPS, String AFP, String Escolaridad, String Profesion, String Talla_Camisa, String Talla_Pantalon, String Talla_Chaqueta, String Talla_Calzado, String Emergencia_NombreCompleto, String Emergencia_Parentesco, String Emergencia_TelefonoMovil, String Emergencia_TelefonoFijo, int usuarios_idusuario) {
        this.idtrabajador = idtrabajador;
        this.Nombre_Completo = Nombre_Completo;
        this.Correo_Electronico = Correo_Electronico;
        this.Tipo_ID = Tipo_ID;
        this.Numero_ID = Numero_ID;
        this.Fecha_Expedicion = Fecha_Expedicion;
        this.Ciudad_Expedicion = Ciudad_Expedicion;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Lugar_Nacimiento = Lugar_Nacimiento;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.Genero = Genero;
        this.Estado_Civil = Estado_Civil;
        this.RH = RH;
        this.Grupo_Sanguineo = Grupo_Sanguineo;
        this.Localidad = Localidad;
        this.Ciudad_Residencia = Ciudad_Residencia;
        this.Barrio = Barrio;
        this.Direccion = Direccion;
        this.Telefono_Movil = Telefono_Movil;
        this.Telefono_Fijo = Telefono_Fijo;
        this.EPS = EPS;
        this.AFP = AFP;
        this.Escolaridad = Escolaridad;
        this.Profesion = Profesion;
        this.Talla_Camisa = Talla_Camisa;
        this.Talla_Pantalon = Talla_Pantalon;
        this.Talla_Chaqueta = Talla_Chaqueta;
        this.Talla_Calzado = Talla_Calzado;
        this.Emergencia_NombreCompleto = Emergencia_NombreCompleto;
        this.Emergencia_Parentesco = Emergencia_Parentesco;
        this.Emergencia_TelefonoMovil = Emergencia_TelefonoMovil;
        this.Emergencia_TelefonoFijo = Emergencia_TelefonoFijo;
        this.usuarios_idusuario = usuarios_idusuario;
    }*/
    
    // Getters y setters - Acceder y Modificar
    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getNombre_Completo() {
        return Nombre_Completo;
    }

    public void setNombre_Completo(String Nombre_Completo) {
        this.Nombre_Completo = Nombre_Completo;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getTipo_ID() {
        return Tipo_ID;
    }

    public void setTipo_ID(String Tipo_ID) {
        this.Tipo_ID = Tipo_ID;
    }

    public int getNumero_ID() {
        return Numero_ID;
    }

    public void setNumero_ID(int Numero_ID) {
        this.Numero_ID = Numero_ID;
    }

    public Date getFecha_Expedicion() {
        return Fecha_Expedicion;
    }

    public void setFecha_Expedicion(Date Fecha_Expedicion) {
        this.Fecha_Expedicion = Fecha_Expedicion;
    }

    public String getCiudad_Expedicion() {
        return Ciudad_Expedicion;
    }

    public void setCiudad_Expedicion(String Ciudad_Expedicion) {
        this.Ciudad_Expedicion = Ciudad_Expedicion;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getLugar_Nacimiento() {
        return Lugar_Nacimiento;
    }

    public void setLugar_Nacimiento(String Lugar_Nacimiento) {
        this.Lugar_Nacimiento = Lugar_Nacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEstado_Civil() {
        return Estado_Civil;
    }

    public void setEstado_Civil(String Estado_Civil) {
        this.Estado_Civil = Estado_Civil;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public String getGrupo_Sanguineo() {
        return Grupo_Sanguineo;
    }

    public void setGrupo_Sanguineo(String Grupo_Sanguineo) {
        this.Grupo_Sanguineo = Grupo_Sanguineo;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono_Movil() {
        return Telefono_Movil;
    }

    public void setTelefono_Movil(String Telefono_Movil) {
        this.Telefono_Movil = Telefono_Movil;
    }

    public String getTelefono_Fijo() {
        return Telefono_Fijo;
    }

    public void setTelefono_Fijo(String Telefono_Fijo) {
        this.Telefono_Fijo = Telefono_Fijo;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getAFP() {
        return AFP;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public String getEscolaridad() {
        return Escolaridad;
    }

    public void setEscolaridad(String Escolaridad) {
        this.Escolaridad = Escolaridad;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getTalla_Camisa() {
        return Talla_Camisa;
    }

    public void setTalla_Camisa(String Talla_Camisa) {
        this.Talla_Camisa = Talla_Camisa;
    }

    public String getTalla_Pantalon() {
        return Talla_Pantalon;
    }

    public void setTalla_Pantalon(String Talla_Pantalon) {
        this.Talla_Pantalon = Talla_Pantalon;
    }

    public String getTalla_Chaqueta() {
        return Talla_Chaqueta;
    }

    public void setTalla_Chaqueta(String Talla_Chaqueta) {
        this.Talla_Chaqueta = Talla_Chaqueta;
    }

    public String getTalla_Calzado() {
        return Talla_Calzado;
    }

    public void setTalla_Calzado(String Talla_Calzado) {
        this.Talla_Calzado = Talla_Calzado;
    }

    public String getEmergencia_NombreCompleto() {
        return Emergencia_NombreCompleto;
    }

    public void setEmergencia_NombreCompleto(String Emergencia_NombreCompleto) {
        this.Emergencia_NombreCompleto = Emergencia_NombreCompleto;
    }

    public String getEmergencia_Parentesco() {
        return Emergencia_Parentesco;
    }

    public void setEmergencia_Parentesco(String Emergencia_Parentesco) {
        this.Emergencia_Parentesco = Emergencia_Parentesco;
    }

    public String getEmergencia_TelefonoMovil() {
        return Emergencia_TelefonoMovil;
    }

    public void setEmergencia_TelefonoMovil(String Emergencia_TelefonoMovil) {
        this.Emergencia_TelefonoMovil = Emergencia_TelefonoMovil;
    }

    public String getEmergencia_TelefonoFijo() {
        return Emergencia_TelefonoFijo;
    }

    public void setEmergencia_TelefonoFijo(String Emergencia_TelefonoFijo) {
        this.Emergencia_TelefonoFijo = Emergencia_TelefonoFijo;
    }

    public int getUsuarios_idusuario() {
        return usuarios_idusuario;
    }

    public void setUsuarios_idusuario(int usuarios_idusuario) {
        this.usuarios_idusuario = usuarios_idusuario;
    }
    
        
}