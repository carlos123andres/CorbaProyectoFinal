
package Corba;

import ConexionBD.ConexionBaseDato;
import Corba.Donaciones.DonacionPOA;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DonacionTabla extends DonacionPOA{
    
    ConexionBaseDato objConect = new ConexionBaseDato();
    
    @Override
    public boolean insertarDonacion(int cedula, String nombreDonante, String tipoMascota, int numeroMascota) {
        boolean resultado = false;
        try {
            String sql = "insert into donacion (cedula,nombreDonante,tipoMascota,numeroMascota) values ('"+cedula+"','"+nombreDonante+"','"+tipoMascota+"','"+numeroMascota+"')";
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
    public boolean actualizarDonacion(int cedula, String nombreDonante, String tipoMascota, int numeroMascota) {
        boolean resultado = false;
        String sql;
        try {
            

            sql = "UPDATE donacion SET nombreDonante = '"+nombreDonante+"', tipoMascota = '"+tipoMascota+"', numeroMascota = '"+numeroMascota+"' where cedula = '"+cedula+"' ";
            

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
    public boolean eliminarDonacion(int cedula) {
        boolean resultado = false;
        try {
            String sql = "Delete from donacion where cedula = " +cedula;
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
    public String consultarDonacion(int cedula) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from donacion where cedula = " + cedula;
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
    
    
    public ResultSet cargarDonacion(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT * FROM donacion";
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
