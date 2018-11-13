
package Corba;
import ConexionBD.ConexionBaseDato;
import Mascotas.*;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MascotaTabla extends MascotaPOA{
     ConexionBaseDato objConect = new ConexionBaseDato(); 
     
    @Override
    public boolean insertarMascota(int codigo, String apodo, String especie, String raza, String colorPelo, String fechaNacimiento, int numeroVacuna, String nombreVacuna) {
        boolean resultado = false;
        try {
            String sql = "insert into mascota (codigo,apodo,especie,raza,colorPelo, fechaNacimiento, numeroVacunas, nombreVacunas) values ('"+codigo+"','"+apodo+"','"+especie+"','"+raza+"','"+colorPelo+"','"+fechaNacimiento+"','"+numeroVacuna+"','"+numeroVacuna+"')";
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
    public boolean actualizarMascota(int codigo, String apodo, String especie, String raza, String colorPelo, String fechaNacimiento, int numeroVacuna, String nombreVacuna) {
         boolean resultado = false;
        try {
            String sql = "UPDATE mascota SET apodo = '"+apodo+"', especie = '"+especie+"', raza = '"+raza+"', colorPelo = '"+colorPelo+"', fechaNacimiento = '"+fechaNacimiento+"', numeroVcuna = '"+numeroVacuna+"', nombreVacuna = '"+nombreVacuna+"' where codigo = '"+codigo+"' ";
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
    public boolean eliminarMascota(int codigo) {
        boolean resultado = false;
        try {
            String sql = "Delete from credenciales where codigo = " +codigo;
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
    public String consultarMascota(int codigo) {
        String resultado = "";
        
        try {
            
            String sqlConsultar = "Select * from credenciales where codigo = " + codigo;
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
    
    public ResultSet cargarMascota(){
        
       ResultSet resultado = null;
       
        try {
            String sqlConsultar = "SELECT  M.codigo, M.apodo, M.especie, M.raza, M.colorPelo, M.fechaNacimiento, M.numeroVacunas, M.nombreVacunas FROM mascota M ";
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
