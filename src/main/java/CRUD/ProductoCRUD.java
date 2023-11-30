
package CRUD;

import ConexionBD.ConexionBD;
import com.timco.jdbc.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductoCRUD {
    
    
    public void agregarProducto(Producto producto){
        //Consulta SQL
        String insertQuery = "INSERT INTO Producto (Nombre_Producto, Codigo_Interno, Marca, Serie, Fecha_Fabricacion, "
                + "Referencia, Lote, Norma_Tecnica, Cantidad, Proveedor)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexionBD.obtenerConexion();//Método para obtener conexion a la BD
        
                //Crear un objeto PreparedStatement
                PreparedStatement statement= conn.prepareStatement(insertQuery)){
            
            statement.setString(1, producto.getNombre_Producto());
            statement.setString(2, producto.getCodigo_Interno());
            statement.setString(3, producto.getMarca());
            statement.setString(4,producto.getSerie());
            statement.setDate(5, producto.getFecha_Fabricacion());
            statement.setString(6, producto.getReferencia());
            statement.setString(7, producto.getLote());
            statement.setString(8, producto.getNorma_Tecnica());
            statement.setInt(9, producto.getCantidad());
            statement.setString(10, producto.getProveedor());
            
             
            //Ejecutar la consulta
            statement.executeUpdate();
            System.out.println("Producto agregado correctamente.");
                        
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el Producto.");
        }
    }
    
    public void consultarProducto (String Nombre_Producto){
        //Consulta SQL
        String selectQuery= "SELECT Nombre_Producto, Codigo_Interno, Marca, Serie, Fecha_Fabricacion, "
                + "Referencia, Lote, Norma_Tecnica, Cantidad, Proveedor FROM Producto WHERE Nombre_Producto= ?";
        
        try (Connection conn = ConexionBD.obtenerConexion();//Método para obtener conexion a la BD
        
                //Crear un objeto PreparedStatement
                PreparedStatement statement= conn.prepareStatement(selectQuery)){
                statement.setString(1, Nombre_Producto);
                ResultSet result = statement.executeQuery();
                
                if (result.next()) {
                System.out.println("Nombre producto: " + result.getString("Nombre_Producto"));
                System.out.println("Código interno: " + result.getString("Codigo_Interno"));
                System.out.println("Marca: " + result.getString("Marca"));
                System.out.println("Serie: " + result.getString("Serie"));
                System.out.println("Fecha de fabricación: " + result.getDate("Fecha_Fabricacion"));
                System.out.println("Referencia: " + result.getString("Referencia"));
                System.out.println("Lote: " + result.getString("Lote"));
                System.out.println("Norma técnica: " + result.getString("Norma_Tecnica"));
                System.out.println("Cantidad: " + result.getInt("Cantidad"));
                System.out.println("Proveedor: " + result.getString("Proveedor"));
           
                              
            } else { 
                System.out.println("Producto no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al consultar el producto.");
        }
    }
    
    
    public void actualizarProducto(String Nombre_Producto, Producto nuevoProducto) {
        String updateQuery = "UPDATE Producto SET Nombre_Producto=?, Codigo_Interno=?, Marca=?, Serie=?, Fecha_Fabricacion=?, "
            + "Referencia=?, Lote=?, Norma_Tecnica=?, Cantidad=?, Proveedor=? WHERE Numero_ID=?";
        
         
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(updateQuery)) {
             
            // Establecer valores para los parámetros en el orden correcto
            statement.setString(1, nuevoProducto.getNombre_Producto());
            statement.setString(2, nuevoProducto.getCodigo_Interno());
            statement.setString(3, nuevoProducto.getMarca());
            statement.setString(4,nuevoProducto.getSerie());
            statement.setDate(5, nuevoProducto.getFecha_Fabricacion());
            statement.setString(6, nuevoProducto.getReferencia());
            statement.setString(7, nuevoProducto.getLote());
            statement.setString(8, nuevoProducto.getNorma_Tecnica());
            statement.setInt(9, nuevoProducto.getCantidad());
            statement.setString(10, nuevoProducto.getProveedor());
                       
            // Establecer el valor para el parámetro Nombre_Producto en el WHERE clause
            statement.setString(11, Nombre_Producto);
            
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Producto actualizado correctamente.");
            } else {
                System.out.println("Producto no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al actualizar el producto.");
        }
    }
    
    public void eliminarProducto(int idproducto) {
        String deleteQuery = "DELETE FROM Producto WHERE idproducto = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(deleteQuery)) {
            statement.setInt(1, idproducto);
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Producto eliminado correctamente.");
            } else {
                System.out.println("Producto no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al eliminar el producto.");
        }
    }
    
}
