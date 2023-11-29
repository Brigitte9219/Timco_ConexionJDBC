
package ConexionBD;

import CRUD.TrabajadorCRUD;
import com.timco.jdbc.modelo.Trabajador;


public class TimcoCRUD {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Trabajador trabajador =new Trabajador();
        trabajador.setNombre_Completo("Brigitte");
        trabajador.setNumero_ID(1118551584);
        TrabajadorCRUD trabajadorcrud= new TrabajadorCRUD();
        
        //Agregar trabajador
        trabajadorcrud.agregarTrabajador(trabajador);
        
        
        ConexionBD.cerrarConexion();
    }
    
        
    
    
}
