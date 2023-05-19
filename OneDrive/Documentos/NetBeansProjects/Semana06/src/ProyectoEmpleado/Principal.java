/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoEmpleado;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
        setSize(900,600);
        this.setLocationRelativeTo(null);
        
    }
    
    public double leeMontoVendido(){
        try{
            return Double.parseDouble(txtMontoVendido.getText());
        }catch(Exception ex){
            return -1;
            
        }
    }
    
    public double leeTasaComision(){
         try{
            return Double.parseDouble(txtTasaDeComision.getText());
        }catch(Exception ex){
            return -1;
            
        }
    }
    
    public void mensaje(String s){
        JOptionPane.showMessageDialog(this,s);
    }
    
    public double leeSueldoBase(){
         try{
            return Double.parseDouble(txtSueldoBase.getText());
        }catch(Exception ex){
            return -1;
            
        }
    }
    
    public void Listar(Empleado e, JTextArea txa){
        txa.append(e.mostrarInfo());
        if(e instanceof EmpleadoPermanente)
            txa.append("\nMovilidad\t\t:"+((EmpleadoPermanente)e).movilidad());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTasaDeComision = new javax.swing.JTextField();
        txtMontoVendido = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnGuardaraEmpleadoVendedor = new javax.swing.JButton();
        btnBorrarEV = new javax.swing.JButton();
        btnSalirEV = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSalidaEV = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtDni1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellidos1 = new javax.swing.JTextField();
        txtSueldoBase = new javax.swing.JTextField();
        cbxTipoDeAfiliacion = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnGuardarEmpleadoPermanente = new javax.swing.JButton();
        btnBorrarEP = new javax.swing.JButton();
        btnSalirEP = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaSalidaEP = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(2, 3));

        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI\n"));
        jPanel3.add(txtDni);

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel3.add(txtNombre);

        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));
        jPanel3.add(txtApellidos);

        txtTasaDeComision.setBorder(javax.swing.BorderFactory.createTitledBorder("Tasa de comision\n"));
        jPanel3.add(txtTasaDeComision);

        txtMontoVendido.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto Vendido"));
        jPanel3.add(txtMontoVendido);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        btnGuardaraEmpleadoVendedor.setText("Guardar Empleado");
        btnGuardaraEmpleadoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaraEmpleadoVendedorActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardaraEmpleadoVendedor);

        btnBorrarEV.setText("Borrar");
        btnBorrarEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEVActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrarEV);

        btnSalirEV.setText("Salir");
        btnSalirEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirEVActionPerformed(evt);
            }
        });
        jPanel4.add(btnSalirEV);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setLayout(new java.awt.BorderLayout());

        txaSalidaEV.setColumns(20);
        txaSalidaEV.setRows(5);
        jScrollPane1.setViewportView(txaSalidaEV);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("EmpleadoVendedor", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.GridLayout(2, 3));

        txtDni1.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI\n"));
        jPanel6.add(txtDni1);

        txtNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre\n"));
        jPanel6.add(txtNombre1);

        txtApellidos1.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos"));
        jPanel6.add(txtApellidos1);

        txtSueldoBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldo Base\n"));
        jPanel6.add(txtSueldoBase);

        cbxTipoDeAfiliacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AFP", "SNP" }));
        cbxTipoDeAfiliacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Afiliacion\n"));
        jPanel6.add(cbxTipoDeAfiliacion);

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        btnGuardarEmpleadoPermanente.setText("Guardar Empleado");
        btnGuardarEmpleadoPermanente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoPermanenteActionPerformed(evt);
            }
        });
        jPanel7.add(btnGuardarEmpleadoPermanente);

        btnBorrarEP.setText("Borrar");
        btnBorrarEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEPActionPerformed(evt);
            }
        });
        jPanel7.add(btnBorrarEP);

        btnSalirEP.setText("Salir");
        btnSalirEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirEPActionPerformed(evt);
            }
        });
        jPanel7.add(btnSalirEP);

        jPanel2.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setLayout(new java.awt.BorderLayout());

        txaSalidaEP.setColumns(20);
        txaSalidaEP.setRows(5);
        jScrollPane2.setViewportView(txaSalidaEP);

        jPanel8.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("EmpleadoPermanente", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardaraEmpleadoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaraEmpleadoVendedorActionPerformed
        double  mv=0, tc=0;
        String dni=txtDni.getText();
        String nombre=txtNombre.getText();
        String apellidos=txtApellidos.getText();
        
        
        if (leeMontoVendido()==-1)
            mensaje("Error: Ingrese monto vendido correcto");
        else 
            mv=leeMontoVendido();
        
        if(leeTasaComision()==-1)
            mensaje("Error: Ingrese Tasa de comision correcta");
        else
            tc=leeTasaComision();
        if(leeMontoVendido() != -1 && leeTasaComision()!=-1){
            EmpleadoVendedor ev=new EmpleadoVendedor(mv,tc,dni,nombre,apellidos);
            Listar(ev,txaSalidaEV);
        }
            
    }//GEN-LAST:event_btnGuardaraEmpleadoVendedorActionPerformed

    private void btnGuardarEmpleadoPermanenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoPermanenteActionPerformed
        double  s_basico=0;
        String dni=txtDni1.getText();
        String nombre=txtNombre1.getText();
        String apellidos=txtApellidos1.getText();
        String afiliacion=cbxTipoDeAfiliacion.getSelectedItem().toString();
        if (leeSueldoBase()==-1)
            mensaje("Error: Ingrese el sueldo correcto");
        else 
            s_basico=leeSueldoBase();
        if(leeSueldoBase() !=-1){
            EmpleadoPermanente ep=new EmpleadoPermanente(s_basico,afiliacion,dni,nombre,apellidos);
            Listar(ep,txaSalidaEP);
        }
    }//GEN-LAST:event_btnGuardarEmpleadoPermanenteActionPerformed

    private void btnBorrarEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEPActionPerformed
        //limpiando los datos de EmpleadoPermanenete
        txtDni1.setText("");
        txtNombre1.setText("");
        txtApellidos1.setText("");
        cbxTipoDeAfiliacion.setSelectedIndex(0);
        txtSueldoBase.setText("");
        txaSalidaEP.setText("");
    }//GEN-LAST:event_btnBorrarEPActionPerformed

    private void btnBorrarEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEVActionPerformed
        //limpiando los datos de Empleado Vendedor
        txtDni.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtTasaDeComision.setText("");
        txtMontoVendido.setText("");
        txaSalidaEV.setText("");
    }//GEN-LAST:event_btnBorrarEVActionPerformed

    private void btnSalirEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirEVActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirEVActionPerformed

    private void btnSalirEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirEPActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirEPActionPerformed

 
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarEP;
    private javax.swing.JButton btnBorrarEV;
    private javax.swing.JButton btnGuardarEmpleadoPermanente;
    private javax.swing.JButton btnGuardaraEmpleadoVendedor;
    private javax.swing.JButton btnSalirEP;
    private javax.swing.JButton btnSalirEV;
    private javax.swing.JComboBox<String> cbxTipoDeAfiliacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txaSalidaEP;
    private javax.swing.JTextArea txaSalidaEV;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidos1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDni1;
    private javax.swing.JTextField txtMontoVendido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtSueldoBase;
    private javax.swing.JTextField txtTasaDeComision;
    // End of variables declaration//GEN-END:variables
}
