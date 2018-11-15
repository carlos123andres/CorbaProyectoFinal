package Corba;

import ConexionBD.ConexionBaseDato;
import Corba.Adopciones.AdopcionPOA;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AdopcionTabla extends AdopcionPOA{

    ConexionBaseDato objConect = new ConexionBaseDato(); 
    
    @Override
    public boolean insertarAdopcion(int cedula, int idMascota, String nombre, String direccion, String correo, String nacionalidad, int edad) {
        
        boolean resultado = false;
        try {
            String sql = "insert into adopcion (cedula,mascota_id,nombre,direccion,correo,nacionalidad,edad) values ('"+cedula+"','"+idMascota+"','"+nombre+"','"+direccion+"','"+correo+"','"+nacionalidad+"','"+edad+"')";
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones
            objConect.conex.close();
            st.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el código o el usuario ya se encuentran registrados. ¡Por favor, vuelva a intentarlo!" + e.getMessage()); 
        }        
        return resultado;
        
    }

    @Override
    public boolean actualizarAdopcion(int cedula, int idMascota, String nombre, String direccion, String correo, String nacionalidad, int edad) {
        boolean resultado = false;
        String sql = "";
        try {
            
            if (idMascota == 0 ) {
                
                sql = "UPDATE adopcion SET nombre = '"+nombre+"', direccion = '"+direccion+"', correo = '"+correo+"', nacionalidad = '"+nacionalidad+"', edad = '"+edad+"' where cedula = '"+cedula+"' ";
            }
            else {
                sql = "UPDATE adopcion SET mascota_id = '"+idMascota+"', nombre = '"+nombre+"', direccion = '"+direccion+"', correo = '"+correo+"', nacionalidad = '"+nacionalidad+"', edad = '"+edad+"' where cedula = '"+cedula+"' ";
            }

            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConect.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al actualizar. "+e);
        }        
        return resultado;
    }

    @Override
    public boolean eliminarAdopcion(int cedula) {
        boolean resultado = false;
        try {
            String sql = "Delete from adopcion where cedula = " +cedula;
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            objConect.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al eliminar. "+e.getMessage());
        }        
        return resultado;
    }

    @Override
    public String consultarAdopcion(int cedula) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from adopcion where cedula = " + cedula;
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            
            while (rs.next()) {                
                resultado += rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return resultado;
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet cargarAdopcion(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT A.cedula, M.apodo, A.nombre, A.direccion, A.correo, A.nacionalidad, A.edad FROM adopcion A , mascota M WHERE A.mascota_id = M.codigo";
            //Se realiza la conexión con la base de datos
            objConect.conectar();
            Statement st = objConect.conex.createStatement();
            resultado = st.executeQuery(sqlConsultar);
           
            //Cerrar las conexiones.
            //st.close();
            //objConect.conex.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
       return resultado;
    }
   
    
    
    
}
