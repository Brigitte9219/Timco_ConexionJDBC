
package com.timco.jdbc.modelo;




public class Trabajador {
    
    private int idtrabajador;
    private String Nombre_Completo;

    public Trabajador(String brigitte_Padilla) {
    }

    public Trabajador(int idtrabajador, String Nombre_Completo) {
        this.idtrabajador = idtrabajador;
        this.Nombre_Completo = Nombre_Completo;
    }

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
    
    

    

    
}