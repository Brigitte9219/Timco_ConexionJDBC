
package CRUD;

import ConexionBD.ConexionBD;
import com.timco.jdbc.modelo.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TrabajadorCRUD {
    
    public void agregarTrabajador(Trabajador trabajador){
        //Consulta SQL
        String insertQuery = "INSERT INTO Trabajador (Nombre_Completo) VALUES (?)";
        
        try (Connection conn = ConexionBD.obtenerConexion();//Método para obtener conexion a la BD
        
                //Crear un objeto PreparedStatement
                PreparedStatement statement= conn.prepareStatement(insertQuery)){
            
            statement.setString(1, trabajador.getNombre_Completo());
            
            //Ejecutar la consulta
            statement.executeUpdate();
            System.out.println("Trabajador agregado correctamente.");
                        
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el Trabajador.");
        }
    }
    
}
