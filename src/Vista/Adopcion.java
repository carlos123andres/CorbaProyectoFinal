package Vista;

import Corba.AdopcionTabla;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Adopcion extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modeloTablaAdopcion;
    TableRowSorter trs;
   
    public Adopcion() {
        initComponents();
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
        
        //Llenamos todos los datos que se encuentran en la BD para el ComboBox
        ComboBoxMascota mascota = new ComboBoxMascota();

        //Creamos un Objeto para obtener el modelo del comboBox
        DefaultComboBoxModel objMascota = new DefaultComboBoxModel(mascota.mostrarMascota());
        cmbMascota.setModel(objMascota);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdopcion = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        cmbMascota = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Mascota");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 110, -1));

        tblAdopcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAdopcion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblAdopcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdopcionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAdopcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("ADOPCIÓN");
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

        jPanel1.add(cmbMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 51));
        jLabel9.setText("Edad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

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
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 51));
        jLabel10.setText("Correo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 51));
        jLabel11.setText("Nacionalidad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        jPanel1.add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la cedula");
            txtCedula.requestFocus();
            return;
        }
        if(cmbMascota.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, selecciona la mascota");
            cmbMascota.requestFocus();
            return;
        }
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el nombre");
            txtNombre.requestFocus();
            return;
        }
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la direccion");
            txtDireccion.requestFocus();
            return;
        }
        if(txtCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el correo");
            txtCorreo.requestFocus();
            return;
        }
        if(txtNacionalidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la nacionalidad");
            txtNacionalidad.requestFocus();
            return;
        }
        
        if(txtEdad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la edad");
            txtEdad.requestFocus();
            return;
        }
         
        AdopcionTabla objAdopcion = new AdopcionTabla(); 
        
        ComboBoxMascota objMascota = (ComboBoxMascota) cmbMascota.getSelectedItem();
        int cedula = Integer.parseInt(txtCedula.getText());
        int codMascota = objMascota.getId();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        String nacionalidad = txtNacionalidad.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        
        try {
            boolean resultado = objAdopcion.insertarAdopcion(cedula, codMascota, nombre , direccion, correo, nacionalidad, edad);
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
        
        if(txtCedula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la cedula");
            txtCedula.requestFocus();
            return;
        }
        if(cmbMascota.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, selecciona la mascota");
            cmbMascota.requestFocus();
            return;
        }
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el nombre");
            txtNombre.requestFocus();
            return;
        }
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la direccion");
            txtDireccion.requestFocus();
            return;
        }
        if(txtCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el correo");
            txtCorreo.requestFocus();
            return;
        }
        if(txtNacionalidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la nacionalidad");
            txtNacionalidad.requestFocus();
            return;
        }
        
        if(txtEdad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la edad");
            txtEdad.requestFocus();
            return;
        }
         
        
        
        try {
            
            AdopcionTabla objAdopcion = new AdopcionTabla(); 
            
            int cedula = Integer.parseInt(txtCedula.getText());
            String nombre = txtNombre.getText();
            String direccion = txtDireccion.getText();
            String correo = txtCorreo.getText();
            String nacionalidad = txtNacionalidad.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            
            String nombreMascota =  (String) modeloTablaAdopcion.getValueAt(tblAdopcion.getSelectedRow(), 1);
            
            boolean resultado;

            if (cmbMascota.getSelectedItem().equals(nombreMascota)) {
                resultado = objAdopcion.actualizarAdopcion(cedula, 0, nombre, direccion, correo, nacionalidad, edad);
            }
            else {
                ComboBoxMascota objMascota = (ComboBoxMascota) cmbMascota.getSelectedItem();
                
                int codMascota = objMascota.getId();
                resultado = objAdopcion.actualizarAdopcion(cedula, codMascota, nombre, direccion, correo, nacionalidad, edad);
            }

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

    private void tblAdopcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdopcionMouseClicked
        // Defino el modelo para el JTable
        modeloTablaAdopcion = (DefaultTableModel) tblAdopcion.getModel();
        
        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            
            ComboBoxMascota objMascota = new ComboBoxMascota();
            
            DefaultComboBoxModel modeloMascota = new DefaultComboBoxModel(objMascota.mostrarMascota());

          
            txtCedula.setText(String.valueOf(modeloTablaAdopcion.getValueAt(tblAdopcion.getSelectedRow(), 0)));
            
            String mascota = (String) modeloTablaAdopcion.getValueAt(tblAdopcion.getSelectedRow(), 1);
            modeloMascota.setSelectedItem(mascota);
            cmbMascota.setModel(modeloMascota);
            
            txtNombre.setText(String.valueOf(modeloTablaAdopcion.getValueAt(tblAdopcion.getSelectedRow(), 2)));
            txtDireccion.setText(String.valueOf(modeloTablaAdopcion.getValueAt(tblAdopcion.getSelectedRow(), 3)));
            txtCorreo.setText(String.valueOf(modeloTablaAdopcion.getValueAt(tblAdopcion.getSelectedRow(), 4)));
            txtNacionalidad.setText(String.valueOf(modeloTablaAdopcion.getValueAt(tblAdopcion.getSelectedRow(), 5)));
            txtEdad.setText(String.valueOf(modeloTablaAdopcion.getValueAt(tblAdopcion.getSelectedRow(), 6))); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila");
        }   
    }//GEN-LAST:event_tblAdopcionMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblAdopcion.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar");
            return;
        }

        if (tblAdopcion.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }

        AdopcionTabla objAdopcion = new AdopcionTabla();


        try {
            
            int cedula = Integer.parseInt(txtCedula.getText());

            boolean resultado = objAdopcion.eliminarAdopcion(cedula);
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
        Donacion mostrarVentana = new Donacion();

        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        Dueño mostrarVentana = new Dueño();

        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed
//Metodo para cargar las columnas en la tabla
    private void getColumn(){
        modeloTablaAdopcion = (DefaultTableModel) tblAdopcion.getModel();
        // Cargo las columnas de titulo al Jtable
        modeloTablaAdopcion.addColumn("Cedula");
        modeloTablaAdopcion.addColumn("Mascota");
        modeloTablaAdopcion.addColumn("Nombre");
        modeloTablaAdopcion.addColumn("Direccion");
        modeloTablaAdopcion.addColumn("Correo");
        modeloTablaAdopcion.addColumn("Nacionalidad");
        modeloTablaAdopcion.addColumn("Edad");  
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(){
        AdopcionTabla  objAdopcion = new AdopcionTabla();
        //Se Identifica el modelo de la JTable
        modeloTablaAdopcion = (DefaultTableModel) tblAdopcion.getModel();
        ResultSet resultado = objAdopcion.cargarAdopcion();
        try {
            Object datos[] = new Object[7];
            while(resultado.next()){
                for(int i = 0; i < 7; i++){
                    //Importante, el getObject tiene que ser mayor que 0 por ende se coloca el 1
                    datos[i] = resultado.getObject(i + 1);
                }
                modeloTablaAdopcion.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    private void limpiar() {
        
        modeloTablaAdopcion = (DefaultTableModel) tblAdopcion.getModel();
        
        ComboBoxMascota objMascota = new ComboBoxMascota();
            
        DefaultComboBoxModel modeloMascota = new DefaultComboBoxModel(objMascota.mostrarMascota());
        
        modeloMascota.setSelectedItem("*Selecciona*");
        cmbMascota.setModel(modeloMascota);
        
        // Limpio las filas y las columnas de la tabla
        modeloTablaAdopcion.setColumnCount(0);
        modeloTablaAdopcion.setNumRows(0);
        
        txtCedula.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtNacionalidad.setText("");
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
            java.util.logging.Logger.getLogger(Adopcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adopcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adopcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adopcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Adopcion().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbMascota;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdopcion;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
