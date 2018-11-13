package Vista;

import Corba.MascotaTabla;
import Corba.PesoTabla;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Dueño extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modeloTBLMascota;
    TableRowSorter trs;
   
    public Dueño() {
        initComponents();
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascota = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        btnSiguente1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 153));
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 153));
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 153));
        jLabel5.setText("Direccion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 153));
        jLabel6.setText("Correo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, -1));

        tblMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMascota.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMascotaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMascota);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Acudiente");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 153));
        jLabel8.setText("Identificacion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        jPanel1.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));

        btnSiguente1.setText("Siguiente");
        btnSiguente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguente1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         if(txtIdentificacion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el codigo");
            txtIdentificacion.requestFocus();
            return;
        }
         if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el color de pelo");
            txtDireccion.requestFocus();
            return;
        }
         if(txtApellido.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la especie");
            txtApellido.requestFocus();
            return;
        }
         if(txtCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la fecha de nacimiento");
            txtCorreo.requestFocus();
            return;
        }
         if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el Nickname");
            txtNombre.requestFocus();
            return;
        }
         if(txtNombreVacuna.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita nombre de la vacuna");
            txtNombreVacuna.requestFocus();
            return;
        }
         if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la raza");
            txtTelefono.requestFocus();
            return;
        }
         if(txtNumeroVacunas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el numero de vacunas");
            txtNumeroVacunas.requestFocus();
            return;
        }
         
        MascotaTabla objMascota = new MascotaTabla(); 
         
        int codigo = Integer.parseInt(txtIdentificacion.getText());
        String nickname = txtNombre.getText();
        String especie = txtApellido.getText();
        String raza = txtTelefono.getText();
        String colorPelo = txtDireccion.getText();
        String fechaNacimiento = txtCorreo.getText();
        int numeroVacunas = Integer.parseInt(txtNumeroVacunas.getText());
        String nombreVacunas = txtNombreVacuna.getText();
         
        try {
            boolean resultado = objMascota.insertarMascota(codigo, nickname, especie , raza, colorPelo, fechaNacimiento, numeroVacunas, nombreVacunas);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Se inserto un nuevo registro.");
                //Utilizamos el objeto para limpiar todos los campos.
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado. ¡Por favor, vuelva a intentarlo!");
        }
         
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Mostramos la información que se encuentra en la BD al Usuario
        limpiar();
        getColumn();
        cargarTabla(); 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblMascota.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblMascota.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
        
        
        
        if(txtIdentificacion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el codigo");
            txtIdentificacion.requestFocus();
            return;
        }
         if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el color de pelo");
            txtDireccion.requestFocus();
            return;
        }
         if(txtApellido.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la especie");
            txtApellido.requestFocus();
            return;
        }
         if(txtCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la fecha de nacimiento");
            txtCorreo.requestFocus();
            return;
        }
         if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el Nickname");
            txtNombre.requestFocus();
            return;
        }
         if(txtNombreVacuna.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita nombre de la vacuna");
            txtNombreVacuna.requestFocus();
            return;
        }
         if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la raza");
            txtTelefono.requestFocus();
            return;
        }
         if(txtNumeroVacunas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el numero de vacunas");
            txtNumeroVacunas.requestFocus();
            return;
        }
         
        try {
            
            MascotaTabla objPeso = new MascotaTabla(); 
         
            int codigo = Integer.parseInt(txtIdentificacion.getText());
            String nickname = txtNombre.getText();
            String especie = txtApellido.getText();
            String raza = txtTelefono.getText();
            String colorPelo = txtDireccion.getText();
            String fechaNacimiento = txtCorreo.getText();
            int numeroVacunas = Integer.parseInt(txtNumeroVacunas.getText());
            String nombreVacunas = txtNombreVacuna.getText();
            
            boolean resultado = objPeso.actualizarMascota(codigo, nickname, especie, raza, colorPelo, fechaNacimiento, numeroVacunas, nombreVacunas);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se actualizó el registro.");
                //Se realiza la limpieza al JTable
                limpiar();
                //Mostramos las columnas (La informacion que identifica a cada tabla en la BD)
                getColumn();
                //Actualizamos la tabla (Buscamos todos los registros)
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar.");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema , por favor intentalo de nuevo.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMascotaMouseClicked
        // Defino el modelo para el JTable
        modeloTBLMascota = (DefaultTableModel) tblMascota.getModel();
        
        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            txtIdentificacion.setText(String.valueOf(modeloTBLMascota.getValueAt(tblMascota.getSelectedRow(), 0)));
            txtNombre.setText(String.valueOf(modeloTBLMascota.getValueAt(tblMascota.getSelectedRow(), 1)));
            txtApellido.setText(String.valueOf(modeloTBLMascota.getValueAt(tblMascota.getSelectedRow(), 2)));
            txtTelefono.setText(String.valueOf(modeloTBLMascota.getValueAt(tblMascota.getSelectedRow(), 3)));
            txtDireccion.setText(String.valueOf(modeloTBLMascota.getValueAt(tblMascota.getSelectedRow(), 4)));
            txtCorreo.setText(String.valueOf(modeloTBLMascota.getValueAt(tblMascota.getSelectedRow(), 5)));
            txtNumeroVacunas.setText(String.valueOf(modeloTBLMascota.getValueAt(tblMascota.getSelectedRow(), 6)));
            txtNombreVacuna.setText(String.valueOf(modeloTBLMascota.getValueAt(tblMascota.getSelectedRow(), 7)));
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila");
        }   
    }//GEN-LAST:event_tblMascotaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblMascota.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar");
            return;
        }

        if (tblMascota.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }

        MascotaTabla objMascota = new MascotaTabla();


        try {
            
            int codigo = Integer.parseInt(txtIdentificacion.getText());

            boolean resultado = objMascota.eliminarMascota(codigo);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Se Eliminó el registro correctamente.");
                limpiar();
                getColumn();
                cargarTabla();
            }else{
                JOptionPane.showMessageDialog(null, "Error al Eliminar.");
            }  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado ¡Por favor, vuelva a intentarlo!" + e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        PesoMascota mostrarVentana = new PesoMascota();
        
        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSiguente1ActionPerformed
//Metodo para cargar las columnas en la tabla
    private void getColumn(){
        modeloTBLMascota = (DefaultTableModel) tblMascota.getModel();
        // Cargo las columnas de titulo al Jtable
        modeloTBLMascota.addColumn("Codigo");
        modeloTBLMascota.addColumn("Apodo");
        modeloTBLMascota.addColumn("Especie");
        modeloTBLMascota.addColumn("Raza");  
        modeloTBLMascota.addColumn("ColoPelo");
        modeloTBLMascota.addColumn("FechaNacimiento");
        modeloTBLMascota.addColumn("NumeroVacunas");
        modeloTBLMascota.addColumn("NombreVacunas"); 
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(){
        MascotaTabla objMascota = new MascotaTabla();
        //Se Identifica el modelo de la JTable
        modeloTBLMascota = (DefaultTableModel) tblMascota.getModel();
        ResultSet resultado = objMascota.cargarMascota();
        try {
            Object datos[] = new Object[8];
            while(resultado.next()){
                for(int i = 0; i < 8; i++){
                    //Importante, el getObject tiene que ser mayor que 0 por ende se coloca el 1
                    datos[i] = resultado.getObject(i + 1);
                }
                modeloTBLMascota.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    private void limpiar() {
        
        modeloTBLMascota = (DefaultTableModel) tblMascota.getModel();
        
        // Limpio las filas y las columnas de la tabla
        modeloTBLMascota.setColumnCount(0);
        modeloTBLMascota.setNumRows(0);
        
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtNumeroVacunas.setText("");
        txtNombreVacuna.setText("");
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dueño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dueño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSiguente1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMascota;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
