package Vista;

import Corba.MascotaTabla;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Mascota extends javax.swing.JFrame {
    
    //Variables Globales
    private DefaultTableModel modeloTBLMascota;
    TableRowSorter trs;
   
    public Mascota() {
        initComponents();
        //Sirve para que la ventana aparezca en el centro.
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroVacunas = new javax.swing.JTextField();
        txtNickname = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColorPelo = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascota = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreVacuna = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("N° Vacunas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 153));
        jLabel2.setText("Nickname");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 153));
        jLabel3.setText("Especie");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 153));
        jLabel4.setText("Raza");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 153));
        jLabel5.setText("Color Pelo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 153));
        jLabel6.setText("Fecha Nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        jPanel1.add(txtNumeroVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 110, -1));
        jPanel1.add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));
        jPanel1.add(txtEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, -1));
        jPanel1.add(txtColorPelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, -1));
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, -1));

        tblMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMascota.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tblMascota);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 290, 160));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("MASCOTAS");
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
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jButton1.setText("Siguiente");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jButton2.setText("Atras");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 153));
        jLabel8.setText("Codigo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 153));
        jLabel9.setText("Nombre vacunas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        jPanel1.add(txtNombreVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el codigo");
            txtCodigo.requestFocus();
            return;
        }
         if(txtColorPelo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el color de pelo");
            txtColorPelo.requestFocus();
            return;
        }
         if(txtEspecie.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la especie");
            txtEspecie.requestFocus();
            return;
        }
         if(txtFechaNacimiento.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la fecha de nacimiento");
            txtFechaNacimiento.requestFocus();
            return;
        }
         if(txtNickname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el Nickname");
            txtNickname.requestFocus();
            return;
        }
         if(txtNombreVacuna.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita nombre de la vacuna");
            txtNombreVacuna.requestFocus();
            return;
        }
         if(txtRaza.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita la raza");
            txtRaza.requestFocus();
            return;
        }
         if(txtNumeroVacunas.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Digita el numero de vacunas");
            txtNumeroVacunas.requestFocus();
            return;
        }
         
        MascotaTabla objMascota = new MascotaTabla(); 
         
        int codigo = Integer.parseInt(txtCodigo.getText());
        String nickname = txtNickname.getText();
        String especie = txtEspecie.getText();
        String raza = txtRaza.getText();
        String colorPelo = txtColorPelo.getText();
        String fechaNacimiento = txtFechaNacimiento.getText();
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
        
        txtCodigo.setText("");
        txtNickname.setText("");
        txtEspecie.setText("");
        txtColorPelo.setText("");
        txtEspecie.setText("");
        txtRaza.setText("");
        txtFechaNacimiento.setText("");
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
            java.util.logging.Logger.getLogger(Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMascota;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColorPelo;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtNombreVacuna;
    private javax.swing.JTextField txtNumeroVacunas;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
