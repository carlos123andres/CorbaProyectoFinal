package Vista;

import Corba.DonacionTabla;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Donacion extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modeloTablaDonante;
   
    public Donacion() {
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
        txtNombreDonante = new javax.swing.JTextField();
        txtNumeroMascota = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonacion = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        txtTipoMascota = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Nombre Donante");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Tipo Mascota");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtNombreDonante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDonanteActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreDonante, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));
        jPanel1.add(txtNumeroMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, -1));

        tblDonacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDonacion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblDonacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDonacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("DONACIONES");
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

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setText("Cedula");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 70, 20));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 51));
        jLabel9.setText("N° Mascotas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel1.add(txtTipoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));
        jPanel1.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la cedula");
            txtCedula.requestFocus();
            return;
        }
         if(txtNombreDonante.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el nombre");
            txtNombreDonante.requestFocus();
            return;
        }
        if(txtTipoMascota.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la especialidad");
            txtTipoMascota.requestFocus();
            return;
        }
        if(txtNumeroMascota.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la especialidad");
            txtNumeroMascota.requestFocus();
            return;
        }
         
        DonacionTabla objDonacion = new DonacionTabla(); 
        
        int cedula = Integer.parseInt(txtCedula.getText());
        String nombreDonante = txtNombreDonante.getText();
        String tipoMascota = txtTipoMascota.getText();
        int numeroMascota = Integer.parseInt(txtNumeroMascota.getText());

       

         
        try {
            boolean resultado = objDonacion.insertarDonacion(cedula, nombreDonante, tipoMascota , numeroMascota);
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
        if(tblDonacion.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblDonacion.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }
         
        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la cedula");
            txtCedula.requestFocus();
            return;
        }
        if(txtNombreDonante.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el nombre");
            txtNombreDonante.requestFocus();
            return;
        }
        if(txtTipoMascota.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la especialidad");
            txtTipoMascota.requestFocus();
            return;
        }
        if(txtNumeroMascota.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la especialidad");
            txtNumeroMascota.requestFocus();
            return;
        }
         
        
         
        try {
            
            DonacionTabla objDonacion = new DonacionTabla(); 
        
            int cedula = Integer.parseInt(txtCedula.getText());
            String nombreDonante = txtNombreDonante.getText();
            String tipoMascota = txtTipoMascota.getText();
            int numeroMascota = Integer.parseInt(txtNumeroMascota.getText());
            
            boolean resultado;
           
           
            resultado = objDonacion.actualizarDonacion(cedula, nombreDonante, tipoMascota, numeroMascota);
            

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
            JOptionPane.showMessageDialog(null, "Ocurrió un problema aquiiii , por favor intentalo de nuevo." + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblDonacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonacionMouseClicked
        // Defino el modelo para el JTable
        modeloTablaDonante = (DefaultTableModel) tblDonacion.getModel();
        
        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            
            txtCedula.setText(String.valueOf(modeloTablaDonante.getValueAt(tblDonacion.getSelectedRow(), 0)));
            txtNombreDonante.setText(String.valueOf(modeloTablaDonante.getValueAt(tblDonacion.getSelectedRow(), 1)));
            txtTipoMascota.setText(String.valueOf(modeloTablaDonante.getValueAt(tblDonacion.getSelectedRow(), 2)));
            txtNumeroMascota.setText(String.valueOf(modeloTablaDonante.getValueAt(tblDonacion.getSelectedRow(), 3)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila");
        }   
    }//GEN-LAST:event_tblDonacionMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblDonacion.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar");
            return;
        }

        if (tblDonacion.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }

        DonacionTabla objMedico = new DonacionTabla();


        try {
            
            int cedula = Integer.parseInt(txtCedula.getText());

            boolean resultado = objMedico.eliminarDonacion(cedula);
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

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        this.dispose();
        Mascota mostrarVentana = new Mascota();

        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        Adopcion mostrarVentana = new Adopcion();

        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtNombreDonanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDonanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDonanteActionPerformed
//Metodo para cargar las columnas en la tabla
    private void getColumn(){
        modeloTablaDonante = (DefaultTableModel) tblDonacion.getModel();
        // Cargo las columnas de titulo al Jtable
        modeloTablaDonante.addColumn("Cedula");
        modeloTablaDonante.addColumn("Nombre Donante");
        modeloTablaDonante.addColumn("Tipo Mascota");
        modeloTablaDonante.addColumn("Numero Mascotas");  
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(){
        DonacionTabla  objDonacion = new DonacionTabla();
        //Se Identifica el modelo de la JTable
        modeloTablaDonante = (DefaultTableModel) tblDonacion.getModel();
        ResultSet resultado = objDonacion.cargarDonacion();
        try {
            Object datos[] = new Object[4];
            while(resultado.next()){
                for(int i = 0; i < 4; i++){
                    //Importante, el getObject tiene que ser mayor que 0 por ende se coloca el 1
                    datos[i] = resultado.getObject(i + 1);
                }
                modeloTablaDonante.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    private void limpiar() {
        
        modeloTablaDonante = (DefaultTableModel) tblDonacion.getModel();
      
        
        // Limpio las filas y las columnas de la tabla
        modeloTablaDonante.setColumnCount(0);
        modeloTablaDonante.setNumRows(0);
        
        txtCedula.setText("");
        txtNombreDonante.setText("");
        txtNumeroMascota.setText("");
        txtTipoMascota.setText("");
        
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
            java.util.logging.Logger.getLogger(Donacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donacion().setVisible(true);
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
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDonacion;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombreDonante;
    private javax.swing.JTextField txtNumeroMascota;
    private javax.swing.JTextField txtTipoMascota;
    // End of variables declaration//GEN-END:variables
}
