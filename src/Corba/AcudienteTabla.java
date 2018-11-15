package Corba;
import ConexionBD.ConexionBaseDato;
import Corba.Acudientes.AcudientePOA;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class AcudienteTabla extends AcudientePOA{

    ConexionBaseDato objConect = new ConexionBaseDato(); 
    
    @Override
    public boolean insertarAcudiente(int identificacion, String nombre, String apellido, String telefono, String direccion, String correo) {
        boolean resultado = false;
        try {
            String sql = "insert into acudiente (identificacion,nombre,apellido,telefono,direccion,correo) values ('"+identificacion+"','"+nombre+"','"+apellido+"','"+telefono+"','"+direccion+"','"+correo+"')";
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
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrio un problema. ¡Por favor, vuelva a intentarlo!" + e.getMessage()); 
        }        
        return resultado;
    }

    @Override
    public boolean actualizarAcudiente(int identificacion, String nombre, String apellido, String telefono, String direccion, String correo) {
        boolean resultado = false;
        try {
            String sql = "UPDATE acudiente SET nombre = '"+nombre+"', apellido = '"+apellido+"', telefono = '"+telefono+"', direccion = '"+direccion+"', correo = '"+correo+"' where identificacion = '"+identificacion+"' ";
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
    public boolean eliminarAcudiente(int identificacion) {
        boolean resultado = false;
        try {
            String sql = "Delete from acudiente where identificacion = " +identificacion;
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
    public String consultarAcudiente(int identificacion) {
       String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from  where identificacion = " + identificacion;
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
    
    public ResultSet cargarAcudiente(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT A.identificacion, A.nombre, A.apellido, A.telefono, A.direccion, A.correo FROM acudiente A";
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
