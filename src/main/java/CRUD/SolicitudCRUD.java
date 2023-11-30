
package CRUD;

import ConexionBD.ConexionBD;
import com.timco.jdbc.modelo.Solicitud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SolicitudCRUD {
    
    public void agregarSolicitud(Solicitud solicitud){
        //Consulta SQL
        String insertQuery = "INSERT INTO Solicitud (Fecha_Solicitud, Nombre_Trabajador, Cantidad, Talla, Actividad_aRealizar, "
                + "Proyecto, Area, Observaciones)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexionBD.obtenerConexion();//Método para obtener conexion a la BD
        
                //Crear un objeto PreparedStatement
                PreparedStatement statement= conn.prepareStatement(insertQuery)){
            
            statement.setDate(1, solicitud.getFecha_Solicitud());
            statement.setString(2, solicitud.getNombre_Trabajador());
            statement.setInt(3, solicitud.getCantidad());
            statement.setString(4,solicitud.getTalla());
            statement.setString(5, solicitud.getActividad_aRealizar());
            statement.setString(6, solicitud.getProyecto());
            statement.setString(7, solicitud.getArea());
            statement.setString(8, solicitud.getObservaciones());
                        
             
            //Ejecutar la consulta
            statement.executeUpdate();
            System.out.println("Solicitud agregada correctamente.");
                        
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar la Solicitud.");
        }
    }
    
    public void consultarSolicitud (int idsolicitud){
        //Consulta SQL
        String selectQuery= "SELECT Fecha_Solicitud, Nombre_Trabajador, Cantidad, Talla, Actividad_aRealizar, "
                + "Proyecto, Area, Observaciones FROM Solicitud WHERE idsolicitud= ?";
        
        try (Connection conn = ConexionBD.obtenerConexion();//Método para obtener conexion a la BD
        
                //Crear un objeto PreparedStatement
                PreparedStatement statement= conn.prepareStatement(selectQuery)){
                statement.setInt(1, idsolicitud);
                ResultSet result = statement.executeQuery();
                
                if (result.next()) {
                System.out.println("Fecha de solicitud: " + result.getDate("Fecha_Solicitud"));
                System.out.println("Nombre de trabajador: " + result.getString("Nombre_Trabajador"));
                System.out.println("Cantidad: " + result.getInt("Cantidad"));
                System.out.println("Talla: " + result.getString("Talla"));
                System.out.println("Actividad a realizar: " + result.getString("Actividad_aRealizar"));
                System.out.println("Proyecto: " + result.getString("Proyecto"));
                System.out.println("Area: " + result.getString("Area"));
                System.out.println("Observaciones: " + result.getString("Observaciones"));
                          
                              
            } else { 
                System.out.println("Solicitud no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al consultar la solicitud.");
        }
    }
    
    
    public void actualizarSolicitud(int idsolicitud, Solicitud nuevaSolicitud) {
        String updateQuery = "UPDATE Solicitud SET Fecha_Solicitud=?, Nombre_Trabajador=?, Cantidad=?, Talla=?, Actividad_aRealizar=?, "
            + "Proyecto=?, Area=?, Observaciones=? WHERE idsolicitud=?";
        
         
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(updateQuery)) {
             
            // Establecer valores para los parámetros en el orden correcto
            statement.setDate(1, nuevaSolicitud.getFecha_Solicitud());
            statement.setString(2, nuevaSolicitud.getNombre_Trabajador());
            statement.setInt(3, nuevaSolicitud.getCantidad());
            statement.setString(4,nuevaSolicitud.getTalla());
            statement.setString(5, nuevaSolicitud.getActividad_aRealizar());
            statement.setString(6, nuevaSolicitud.getProyecto());
            statement.setString(7, nuevaSolicitud.getArea());
            statement.setString(8, nuevaSolicitud.getObservaciones());
            
                       
            // Establecer el valor para el parámetro Nombre_Producto en el WHERE clause
            statement.setInt(9, idsolicitud);
            
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Solicitud actualizada correctamente.");
            } else {
                System.out.println("Solicitud no encontrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al actualizar la solicitud.");
        }
    }
    
    public void eliminarSolicitud(int idsolicitud) {
        String deleteQuery = "DELETE FROM Solicitud WHERE idsolicitud = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(deleteQuery)) {
            statement.setInt(1, idsolicitud);
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Solicitud eliminada correctamente.");
            } else {
                System.out.println("Solicitud no encontrada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al eliminar la solicitud.");
        }
    }
    
}
