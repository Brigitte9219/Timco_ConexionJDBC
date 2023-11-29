
package com.timco.jdbc.modelo;

//Declaración de la clase Pqrsf
public class Pqrsf {
    
    //Declaración de las variables o atributos
    private int idpqrsf;
    private String Nombre_Trabajador;
    private int trabajador_Numero_ID;
    private String Entidad_Empresa;
    private String Cargo;
    private String Ciudad;
    private String Telefono_Movil;
    private String Correo_Electronico;
    private String Elija_Opcion;
    private String Mensaje;

    //Método constructor para inicializar los atributos
    public Pqrsf(int idpqrsf, String Nombre_Trabajador, int trabajador_Numero_ID, String Entidad_Empresa, String Cargo, String Ciudad, String Telefono_Movil, String Correo_Electronico, String Elija_Opcion, String Mensaje) {
        this.idpqrsf = idpqrsf;
        this.Nombre_Trabajador = Nombre_Trabajador;
        this.trabajador_Numero_ID = trabajador_Numero_ID;
        this.Entidad_Empresa = Entidad_Empresa;
        this.Cargo = Cargo;
        this.Ciudad = Ciudad;
        this.Telefono_Movil = Telefono_Movil;
        this.Correo_Electronico = Correo_Electronico;
        this.Elija_Opcion = Elija_Opcion;
        this.Mensaje = Mensaje;
    }

    //Getters y Setters - Acceder y Modificar
    public int getIdpqrsf() {
        return idpqrsf;
    }

    public void setIdpqrsf(int idpqrsf) {
        this.idpqrsf = idpqrsf;
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

    public String getEntidad_Empresa() {
        return Entidad_Empresa;
    }

    public void setEntidad_Empresa(String Entidad_Empresa) {
        this.Entidad_Empresa = Entidad_Empresa;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getTelefono_Movil() {
        return Telefono_Movil;
    }

    public void setTelefono_Movil(String Telefono_Movil) {
        this.Telefono_Movil = Telefono_Movil;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getElija_Opcion() {
        return Elija_Opcion;
    }

    public void setElija_Opcion(String Elija_Opcion) {
        this.Elija_Opcion = Elija_Opcion;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
    
    
}
