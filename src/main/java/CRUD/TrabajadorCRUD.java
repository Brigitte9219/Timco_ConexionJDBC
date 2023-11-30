
package CRUD;

import ConexionBD.ConexionBD;
import com.timco.jdbc.modelo.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TrabajadorCRUD {
    
    public void agregarTrabajador(Trabajador trabajador){
        //Consulta SQL
        String insertQuery = "INSERT INTO Trabajador (Nombre_Completo, Correo_Electronico, Tipo_ID, Numero_ID, Fecha_Expedicion, "
                + "Ciudad_Expedicion, Fecha_Nacimiento, Lugar_Nacimiento, Edad, Estatura, Genero, Estado_Civil, RH, Grupo_Sanguineo,"
                + "Localidad, Ciudad_Residencia, Barrio, Direccion, Telefono_Movil, Telefono_Fijo, EPS, AFP, Escolaridad, Profesion,"
                + "Talla_Camisa, Talla_Pantalon, Talla_Chaqueta, Talla_Calzado, Emergencia_NombreCompleto, Emergencia_Parentesco,"
                + "Emergencia_TelefonoMovil, Emergencia_TelefonoFijo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexionBD.obtenerConexion();//Método para obtener conexion a la BD
        
                //Crear un objeto PreparedStatement
                PreparedStatement statement= conn.prepareStatement(insertQuery)){
            
            statement.setString(1, trabajador.getNombre_Completo());
            statement.setString(2, trabajador.getCorreo_Electronico());
            statement.setString(3, trabajador.getTipo_ID());
            statement.setInt (4,trabajador.getNumero_ID());
            statement.setDate(5, trabajador.getFecha_Expedicion());
            statement.setString(6, trabajador.getCiudad_Expedicion());
            statement.setDate(7, trabajador.getFecha_Nacimiento());
            statement.setString(8, trabajador.getLugar_Nacimiento());
            statement.setInt(9, trabajador.getEdad());
            statement.setDouble(10, trabajador.getEstatura());
            statement.setString(11, trabajador.getGenero());
            statement.setString(12, trabajador.getEstado_Civil());
            statement.setString(13, trabajador.getRH());
            statement.setString(14, trabajador.getGrupo_Sanguineo());
            statement.setString(15, trabajador.getLocalidad());
            statement.setString(16, trabajador.getCiudad_Residencia());
            statement.setString(17, trabajador.getBarrio());
            statement.setString(18, trabajador.getDireccion());
            statement.setString(19, trabajador.getTelefono_Movil());
            statement.setString(20, trabajador.getTelefono_Fijo());
            statement.setString(21, trabajador.getEPS());
            statement.setString(22, trabajador.getAFP());
            statement.setString(23, trabajador.getEscolaridad());
            statement.setString(24, trabajador.getProfesion());
            statement.setString(25, trabajador.getTalla_Camisa());
            statement.setString(26, trabajador.getTalla_Pantalon());
            statement.setString(27, trabajador.getTalla_Chaqueta());
            statement.setString(28, trabajador.getTalla_Calzado());
            statement.setString(29, trabajador.getEmergencia_NombreCompleto());
            statement.setString(30, trabajador.getEmergencia_Parentesco());
            statement.setString(31, trabajador.getEmergencia_TelefonoMovil());
            statement.setString(32, trabajador.getEmergencia_TelefonoFijo());
             
            //Ejecutar la consulta
            statement.executeUpdate();
            System.out.println("Trabajador agregado correctamente.");
                        
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el Trabajador.");
        }
    }
    
    public void consultarTrabajador (int Numero_ID){
        //Consulta SQL
        String selectQuery= "SELECT Nombre_Completo, Correo_Electronico, Tipo_ID, Numero_ID, Fecha_Expedicion, "
                + "Ciudad_Expedicion, Fecha_Nacimiento, Lugar_Nacimiento, Edad, Estatura, Genero, Estado_Civil, RH, Grupo_Sanguineo,"
                + "Localidad, Ciudad_Residencia, Barrio, Direccion, Telefono_Movil, Telefono_Fijo, EPS, AFP, Escolaridad, Profesion,"
                + "Talla_Camisa, Talla_Pantalon, Talla_Chaqueta, Talla_Calzado, Emergencia_NombreCompleto, Emergencia_Parentesco,"
                + "Emergencia_TelefonoMovil, Emergencia_TelefonoFijo FROM Trabajador WHERE Numero_ID= ?";
        
        try (Connection conn = ConexionBD.obtenerConexion();//Método para obtener conexion a la BD
        
                //Crear un objeto PreparedStatement
                PreparedStatement statement= conn.prepareStatement(selectQuery)){
                statement.setInt(1, Numero_ID);
                ResultSet result = statement.executeQuery();
                
                if (result.next()) {
                System.out.println("Nombre Completo: " + result.getString("Nombre_Completo"));
                System.out.println("Correo Electrónico: " + result.getString("Correo_Electronico"));
                System.out.println("Tipo ID: " + result.getString("Tipo_ID"));
                System.out.println("Número ID: " + result.getString("Numero_ID"));
                System.out.println("Fecha de expedición: " + result.getString("Fecha_Expedicion"));
                System.out.println("Ciudad de expedición: " + result.getString("Ciudad_Expedicion"));
                System.out.println("Fecha de nacimiento: " + result.getString("Fecha_Nacimiento"));
                System.out.println("Lugar de nacimiento: " + result.getString("Lugar_Nacimiento"));
                System.out.println("Edad: " + result.getString("Edad"));
                System.out.println("Estatura: " + result.getString("Estatura"));
                System.out.println("Genero: " + result.getString("Genero"));
                System.out.println("Estado civil: " + result.getString("Estado_Civil"));
                System.out.println("RH: " + result.getString("RH"));
                System.out.println("Grupo sanguíneo: " + result.getString("Grupo_Sanguineo"));
                System.out.println("Localidad: " + result.getString("Localidad"));
                System.out.println("Ciudad de residencia: " + result.getString("Ciudad_Residencia"));
                System.out.println("Barrio: " + result.getString("Barrio"));               
                System.out.println("Dirección: " + result.getString("Direccion"));
                System.out.println("Teléfono Móvil: " + result.getString("Telefono_Movil"));
                System.out.println("Teléfono fijo: " + result.getString("Telefono_Fijo"));
                System.out.println("EPS: " + result.getString("EPS"));
                System.out.println("AFP: " + result.getString("AFP"));
                System.out.println("Escolaridad: " + result.getString("Escolaridad"));
                System.out.println("Profesion: " + result.getString("Profesion"));
                System.out.println("Talla camisa: " + result.getString("Talla_Camisa"));
                System.out.println("Talla pantalon: " + result.getString("Talla_Pantalon"));
                System.out.println("Talla chaqueta: " + result.getString("Talla_Chaqueta"));               
                System.out.println("Talla calzado: " + result.getString("Talla_Calzado"));
                System.out.println("En caso de emergencia - Nombre completo: " + result.getString("Emergencia_NombreCompleto"));
                System.out.println("En caso de emergencia - Parentesco: " + result.getString("Emergencia_Parentesco"));
                System.out.println("En caso de emergencia - Teléfono móvil: " + result.getString("Emergencia_TelefonoMovil"));
                System.out.println("En caso de emergencia - Teléfono fijo: " + result.getString("Emergencia_TelefonoFijo"));
                              
            } else { 
                System.out.println("Trabajador no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al consultar el trabajador.");
        }
    }
    
    
    public void actualizarTrabajador(int Numero_ID, Trabajador nuevoTrabajador) {
        String updateQuery = "UPDATE Trabajador SET Nombre_Completo=?, Correo_Electronico=?, Tipo_ID=?, Numero_ID=?, Fecha_Expedicion=?, "
            + "Ciudad_Expedicion=?, Fecha_Nacimiento=?, Lugar_Nacimiento=?, Edad=?, Estatura=?, Genero=?, Estado_Civil=?, RH=?, Grupo_Sanguineo=?,"
            + "Localidad=?, Ciudad_Residencia=?, Barrio=?, Direccion=?, Telefono_Movil=?, Telefono_Fijo=?, EPS=?, AFP=?, Escolaridad=?, Profesion=?,"
            + "Talla_Camisa=?, Talla_Pantalon=?, Talla_Chaqueta=?, Talla_Calzado=?, Emergencia_NombreCompleto=?, Emergencia_Parentesco=?,"
            + "Emergencia_TelefonoMovil=?, Emergencia_TelefonoFijo=? WHERE Numero_ID=?";
        
         
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(updateQuery)) {
             
            // Establecer valores para los parámetros en el orden correcto
            statement.setString(1, nuevoTrabajador.getNombre_Completo());
            statement.setString(2, nuevoTrabajador.getCorreo_Electronico());
            statement.setString(3, nuevoTrabajador.getTipo_ID());
            statement.setInt (4,nuevoTrabajador.getNumero_ID());
            statement.setDate(5, nuevoTrabajador.getFecha_Expedicion());
            statement.setString(6, nuevoTrabajador.getCiudad_Expedicion());
            statement.setDate(7, nuevoTrabajador.getFecha_Nacimiento());
            statement.setString(8, nuevoTrabajador.getLugar_Nacimiento());
            statement.setInt(9, nuevoTrabajador.getEdad());
            statement.setDouble(10, nuevoTrabajador.getEstatura());
            statement.setString(11, nuevoTrabajador.getGenero());
            statement.setString(12, nuevoTrabajador.getEstado_Civil());
            statement.setString(13, nuevoTrabajador.getRH());
            statement.setString(14, nuevoTrabajador.getGrupo_Sanguineo());
            statement.setString(15, nuevoTrabajador.getLocalidad());
            statement.setString(16, nuevoTrabajador.getCiudad_Residencia());
            statement.setString(17, nuevoTrabajador.getBarrio());
            statement.setString(18, nuevoTrabajador.getDireccion());
            statement.setString(19, nuevoTrabajador.getTelefono_Movil());
            statement.setString(20, nuevoTrabajador.getTelefono_Fijo());
            statement.setString(21, nuevoTrabajador.getEPS());
            statement.setString(22, nuevoTrabajador.getAFP());
            statement.setString(23, nuevoTrabajador.getEscolaridad());
            statement.setString(24, nuevoTrabajador.getProfesion());
            statement.setString(25, nuevoTrabajador.getTalla_Camisa());
            statement.setString(26, nuevoTrabajador.getTalla_Pantalon());
            statement.setString(27, nuevoTrabajador.getTalla_Chaqueta());
            statement.setString(28, nuevoTrabajador.getTalla_Calzado());
            statement.setString(29, nuevoTrabajador.getEmergencia_NombreCompleto());
            statement.setString(30, nuevoTrabajador.getEmergencia_Parentesco());
            statement.setString(31, nuevoTrabajador.getEmergencia_TelefonoMovil());
            statement.setString(32, nuevoTrabajador.getEmergencia_TelefonoFijo());
            
            // Establecer el valor para el parámetro Numero_ID en el WHERE clause
            statement.setInt(33, Numero_ID);
            
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Trabajador actualizado correctamente.");
            } else {
                System.out.println("Trabajador no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al actualizar el trabajador.");
        }
    }
    
    public void eliminarTrabajador(int Numero_ID) {
        String deleteQuery = "DELETE FROM trabajador WHERE Numero_ID = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(deleteQuery)) {
            statement.setInt(1, Numero_ID);
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Trabajador eliminado correctamente.");
            } else {
                System.out.println("Trabajador no encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al eliminar el trabajador.");
        }
    }

        }
        
