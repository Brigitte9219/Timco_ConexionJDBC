
package ConexionBD;

import CRUD.ProductoCRUD;
import CRUD.TrabajadorCRUD;
import com.timco.jdbc.modelo.Producto;
import com.timco.jdbc.modelo.Trabajador;
import java.sql.Date;


public class TimcoCRUD {

    
    public static void main(String[] args) {
        // TODO code application logic here
       
        //TrabajadorCRUD trabajadorcrud= new TrabajadorCRUD();
        
        /*
        //Agregar trabajador
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
        
        trabajadorcrud.agregarTrabajador(trabajador);*/
        
        
        /*
        //Consultar trabajador
        System.out.println("Consulta de trabajador");
        trabajadorcrud.consultarTrabajador(1118551584);*/
        
        
        /*
        // Actualizar trabajador
        System.out.println("Actualización de trabajador");
        Trabajador nuevoTrabajador = new Trabajador();
        nuevoTrabajador.setNombre_Completo("Maira Padilla");
        nuevoTrabajador.setCorreo_Electronico("Maira@hotmail.com");
        nuevoTrabajador.setTipo_ID("CC");
        nuevoTrabajador.setNumero_ID(1118551584);
        nuevoTrabajador.setFecha_Expedicion(Date.valueOf("2010-08-12"));
        nuevoTrabajador.setCiudad_Expedicion("Yopal");
        nuevoTrabajador.setFecha_Nacimiento(Date.valueOf("1992-08-05"));
        nuevoTrabajador.setLugar_Nacimiento("Cali");
        nuevoTrabajador.setEdad(31);
        nuevoTrabajador.setEstatura(1.60);
        nuevoTrabajador.setGenero("Femenino");
        nuevoTrabajador.setEstado_Civil("Soltera");
        nuevoTrabajador.setRH("+");
        nuevoTrabajador.setGrupo_Sanguineo("O");
        nuevoTrabajador.setLocalidad("Kennedy");
        nuevoTrabajador.setCiudad_Residencia("Cali");
        nuevoTrabajador.setBarrio("Andalucia");
        nuevoTrabajador.setDireccion("Av Cali con Calle 13");
        nuevoTrabajador.setTelefono_Movil("3118677520");
        nuevoTrabajador.setTelefono_Fijo("0");
        nuevoTrabajador.setEPS("Sanitas");
        nuevoTrabajador.setAFP("Colpensiones");
        nuevoTrabajador.setEscolaridad("Posgrado");
        nuevoTrabajador.setProfesion("Ingeniera");
        nuevoTrabajador.setTalla_Camisa("L");
        nuevoTrabajador.setTalla_Pantalon("16");
        nuevoTrabajador.setTalla_Chaqueta("L");
        nuevoTrabajador.setTalla_Calzado("38");
        nuevoTrabajador.setEmergencia_NombreCompleto("Martha Salgado");
        nuevoTrabajador.setEmergencia_Parentesco("Madre");
        nuevoTrabajador.setEmergencia_TelefonoMovil("3114890254");
        nuevoTrabajador.setEmergencia_TelefonoFijo("0");
        
        trabajadorcrud.actualizarTrabajador(1118551584, nuevoTrabajador);*/

        
        /*
        // Eliminar trabajador
        System.out.println("Eliminación de trabajador");
        trabajadorcrud.eliminarTrabajador(1118551584);*/
        
        
        //-------------------------------------------------------------------------------------------------
        
        
        ProductoCRUD productocrud= new ProductoCRUD();
        /*
        //Agregar producto
        Producto producto =new Producto();
        producto.setNombre_Producto("Gafas");
        producto.setCodigo_Interno("1");
        producto.setMarca("Arseg");
        producto.setSerie("123");
        producto.setFecha_Fabricacion(Date.valueOf("2020-08-05"));
        producto.setReferencia("Pepito");
        producto.setLote("111");
        producto.setNorma_Tecnica("Ntc 45000");
        producto.setCantidad(5);
        producto.setProveedor("Patricia");
        
        productocrud.agregarProducto(producto);*/
        
        
        /*
        //Consultar producto
        System.out.println("Consulta de producto");
        productocrud.consultarProducto("Gafas");*/
        
        
        /*
        // Actualizar producto
        System.out.println("Actualización de producto");
        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre_Producto("Casco");
        nuevoProducto.setCodigo_Interno("2");
        nuevoProducto.setMarca("Arseg");
        nuevoProducto.setSerie("456");
        nuevoProducto.setFecha_Fabricacion(Date.valueOf("2021-08-05"));
        nuevoProducto.setReferencia("Carlos");
        nuevoProducto.setLote("222");
        nuevoProducto.setNorma_Tecnica("Ntc 45001");
        nuevoProducto.setCantidad(5);
        nuevoProducto.setProveedor("Lucia");
        
        productocrud.actualizarProducto("Gafas", nuevoProducto);*/
        
        
        
        // Eliminar producto
        System.out.println("Eliminación de producto");
        productocrud.eliminarProducto(1);
        
        
        //Cerrar la conexion a la base de datos
        ConexionBD.cerrarConexion();
    }
    
        
    
    
}
