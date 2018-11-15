package Vista;

import Corba.AcudienteTabla;
import Corba.MascotaTabla;
import Corba.PesoTabla;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Dueño extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modeloTBLAcudiente;
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
        tblAcudiente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        btnSiguente = new javax.swing.JButton();

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

        tblAcudiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAcudiente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblAcudiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAcudienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAcudiente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("ACUDIENTE");
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

        btnSiguente.setText("Siguiente");
        btnSiguente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguenteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

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
         
        AcudienteTabla objAcudiente = new AcudienteTabla(); 
         
        int codigo = Integer.parseInt(txtIdentificacion.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();

         
        try {
            boolean resultado = objAcudiente.insertarAcudiente(codigo, nombre, apellido , telefono, direccion, correo);
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
        if(tblAcudiente.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar" );
            return;
        }

        if (tblAcudiente.getSelectedRow()== -1) {
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
         
        try {
            
            AcudienteTabla objAcudiente = new AcudienteTabla(); 
         
            int codigo = Integer.parseInt(txtIdentificacion.getText());
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String telefono = txtTelefono.getText();
            String direccion = txtDireccion.getText();
            String correo = txtCorreo.getText();

            
            boolean resultado = objAcudiente.actualizarAcudiente(codigo, nombre, apellido, telefono, direccion, correo);
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

    private void tblAcudienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAcudienteMouseClicked
        // Defino el modelo para el JTable
        modeloTBLAcudiente = (DefaultTableModel) tblAcudiente.getModel();
        
        // Asigno el elemento seleccionado de la tabla a los respectivos campos del formulario
        try {
            txtIdentificacion.setText(String.valueOf(modeloTBLAcudiente.getValueAt(tblAcudiente.getSelectedRow(), 0)));
            txtNombre.setText(String.valueOf(modeloTBLAcudiente.getValueAt(tblAcudiente.getSelectedRow(), 1)));
            txtApellido.setText(String.valueOf(modeloTBLAcudiente.getValueAt(tblAcudiente.getSelectedRow(), 2)));
            txtTelefono.setText(String.valueOf(modeloTBLAcudiente.getValueAt(tblAcudiente.getSelectedRow(), 3)));
            txtDireccion.setText(String.valueOf(modeloTBLAcudiente.getValueAt(tblAcudiente.getSelectedRow(), 4)));
            txtCorreo.setText(String.valueOf(modeloTBLAcudiente.getValueAt(tblAcudiente.getSelectedRow(), 5)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ocurrió algo inesperado al momento de seleccionar una fila");
        }   
    }//GEN-LAST:event_tblAcudienteMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         //Saber si la tabla esta vacia esto me permite decirle al Usuario que presione el boton de buscar registros.
        if(tblAcudiente.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Por favor, Presione el botón de Bucar");
            return;
        }

        if (tblAcudiente.getSelectedRow()== -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila");
            return;
        }

        AcudienteTabla  objAcudiente = new AcudienteTabla();


        try {
            
            int codigo = Integer.parseInt(txtIdentificacion.getText());

            boolean resultado = objAcudiente.eliminarAcudiente(codigo);
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

    private void btnSiguenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguenteActionPerformed
        this.dispose();
        Adopcion mostrarVentana = new Adopcion();

        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_btnSiguenteActionPerformed
//Metodo para cargar las columnas en la tabla
    private void getColumn(){
        modeloTBLAcudiente = (DefaultTableModel) tblAcudiente.getModel();
        // Cargo las columnas de titulo al Jtable
        modeloTBLAcudiente.addColumn("Identificacion");
        modeloTBLAcudiente.addColumn("Nombre");
        modeloTBLAcudiente.addColumn("Apellido");
        modeloTBLAcudiente.addColumn("Telefono");  
        modeloTBLAcudiente.addColumn("Direccion");
        modeloTBLAcudiente.addColumn("Correo"); 
    }
    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(){
        AcudienteTabla objAcudiente = new AcudienteTabla();
        //Se Identifica el modelo de la JTable
        modeloTBLAcudiente = (DefaultTableModel) tblAcudiente.getModel();
        ResultSet resultado = objAcudiente.cargarAcudiente();
        try {
            Object datos[] = new Object[6];
            while(resultado.next()){
                for(int i = 0; i < 6; i++){
                    //Importante, el getObject tiene que ser mayor que 0 por ende se coloca el 1
                    datos[i] = resultado.getObject(i + 1);
                }
                modeloTBLAcudiente.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    private void limpiar() {
        
        modeloTBLAcudiente = (DefaultTableModel) tblAcudiente.getModel();
        
        // Limpio las filas y las columnas de la tabla
        modeloTBLAcudiente.setColumnCount(0);
        modeloTBLAcudiente.setNumRows(0);
        
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        
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
    private javax.swing.JButton btnSiguente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAcudiente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
