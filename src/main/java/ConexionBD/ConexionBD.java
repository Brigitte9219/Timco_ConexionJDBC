
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    
       private static Connection conexion = null;

    public static Connection obtenerConexion() {
        try {
            if (conexion == null || conexion.isClosed()) {
                //Se carga el driver al proyecto
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Se define la cadena de conexion
                String url = "jdbc:mysql://localhost:3306/timcobd3";
                String usuario = "root";
                String contraseña = "12345678";
                //Establecer la conexion
                conexion = DriverManager.getConnection(url, usuario, contraseña);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conexion;
    }

    public static void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
