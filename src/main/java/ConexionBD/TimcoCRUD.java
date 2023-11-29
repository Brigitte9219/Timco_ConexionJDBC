
package ConexionBD;

import CRUD.TrabajadorCRUD;
import com.timco.jdbc.modelo.Trabajador;
import java.sql.Date;


public class TimcoCRUD {

    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Trabajador trabajador =new Trabajador();
        
        trabajador.setNombre_Completo("Brigitte Padilla");
        trabajador.setCorreo_Electronico("brigittep29_@hotmail.com");
        trabajador.setTipo_ID("CC");
        trabajador.setNumero_ID(1118551584);
        trabajador.setFecha_Expedicion(Date.valueOf("2010-08-12"));
        trabajador.setCiudad_Expedicion("Yopal");
        trabajador.setFecha_Nacimiento(Date.valueOf("1992-08-05"));
        trabajador.setLugar_Nacimiento("Bogota");
        trabajador.setEdad(31);
        trabajador.setEstatura(1.60);
        trabajador.setGenero("Femenino");
        trabajador.setEstado_Civil("Soltera");
        trabajador.setRH("+");
        trabajador.setGrupo_Sanguineo("O");
        trabajador.setLocalidad("Kennedy");
        trabajador.setCiudad_Residencia("Bogota");
        trabajador.setBarrio("Andalucia");
        trabajador.setDireccion("Av Cali con Calle 13");
        trabajador.setTelefono_Movil("3118677520");
        trabajador.setTelefono_Fijo("0");
        trabajador.setEPS("Sanitas");
        trabajador.setAFP("Colpensiones");
        trabajador.setEscolaridad("Posgrado");
        trabajador.setProfesion("Ingeniera");
        trabajador.setTalla_Camisa("L");
        trabajador.setTalla_Pantalon("16");
        trabajador.setTalla_Chaqueta("L");
        trabajador.setTalla_Calzado("38");
        trabajador.setEmergencia_NombreCompleto("Martha Salgado");
        trabajador.setEmergencia_Parentesco("Madre");
        trabajador.setEmergencia_TelefonoMovil("3114890254");
        trabajador.setEmergencia_TelefonoFijo("0");
        */
        
        
        TrabajadorCRUD trabajadorcrud= new TrabajadorCRUD();
        
        //Agregar trabajador
        //trabajadorcrud.agregarTrabajador(trabajador);
        
        //Consultar trabajador
        trabajadorcrud.consultarTrabajador(1118551584);
        
        
        ConexionBD.cerrarConexion();
    }
    
        
    
    
}
