
package CRUD;

import ConexionBD.ConexionBD;
import com.timco.jdbc.modelo.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
}
