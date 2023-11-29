
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
            statement.setDate(3, trabajador.getFecha_Expedicion());
            statement.setString(3, trabajador.getCiudad_Expedicion());
            statement.setDate(3, trabajador.getFecha_Nacimiento());
            statement.setString(3, trabajador.getLugar_Nacimiento());
            statement.setInt(3, trabajador.getEdad());
            statement.setDouble(3, trabajador.getEstatura());
            statement.setString(3, trabajador.getGenero());
            statement.setString(3, trabajador.getEstado_Civil());
            statement.setString(3, trabajador.getRH());
            statement.setString(3, trabajador.getGrupo_Sanguineo());
            statement.setString(3, trabajador.getLocalidad());
            statement.setString(3, trabajador.getCiudad_Residencia());
            statement.setString(3, trabajador.getBarrio());
            statement.setString(3, trabajador.getDireccion());
            statement.setString(3, trabajador.getTelefono_Movil());
            statement.setString(3, trabajador.getTelefono_Fijo());
            statement.setString(3, trabajador.getEPS());
            statement.setString(3, trabajador.getAFP());
            statement.setString(3, trabajador.getEscolaridad());
            statement.setString(3, trabajador.getProfesion());
            statement.setString(3, trabajador.getTalla_Camisa());
            statement.setString(3, trabajador.getTalla_Pantalon());
            statement.setString(3, trabajador.getTalla_Chaqueta());
            statement.setString(3, trabajador.getTalla_Calzado());
            statement.setString(3, trabajador.getEmergencia_NombreCompleto());
            statement.setString(3, trabajador.getEmergencia_Parentesco());
            statement.setString(3, trabajador.getEmergencia_TelefonoMovil());
            statement.setString(3, trabajador.getEmergencia_TelefonoFijo());
             
            //Ejecutar la consulta
            statement.executeUpdate();
            System.out.println("Trabajador agregado correctamente.");
                        
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar el Trabajador.");
        }
    }
    
}
