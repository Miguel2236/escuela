/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class persona extends javax.swing.JFrame {

    /**
     * Creates new form persona
     */
    
    public static final String URL = "jdbc:mysql://localhost:3306/escuela";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConection()
    {
        /**
         * Función para hacer la conexión a la base de datos
         */
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexión Megaman Poder");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
    
    private void limpiarCajas()
    {
        TxtClave.setText(null);
        TxtNombre.setText(null);
        TxtDomicilio.setText(null);
        TxtTelefono.setText(null);
        TxtCorreo.setText(null);
        TxtFechaNac.setText(null);
        CmbGenero.setSelectedIndex(0);
    }
    
    public persona() 
    {
        /**
         * Constructor
         */
        initComponents();
        TxtID.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtFechaNac = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CmbGenero = new javax.swing.JComboBox<>();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnClose = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        TxtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Clave");

        jLabel2.setText("Nombre");

        jLabel3.setText("Domicilio");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Correo");

        jLabel6.setText("Fecha de Nacimiento");

        jLabel7.setText("Género");

        CmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Opción", "Masculino", "Femenino" }));

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eiminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnClose.setText("Cerrar");
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        TxtID.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtFechaNac)
                                    .addComponent(CmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtTelefono)
                                    .addComponent(TxtDomicilio)
                                    .addComponent(TxtCorreo)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxtNombre))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBuscar)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnLimpiar)
                    .addComponent(BtnClose))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //** Funciones de los botones  **//

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        /**
         * Funcion para guardar registro
         */

        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("INSERT INTO persona (clave, nombre, domicilio, telefono, correo_electronico, fecha_nacimiento, genero) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, TxtClave.getText());
            ps.setString(2, TxtNombre.getText());
            ps.setString(3, TxtDomicilio.getText());
            ps.setString(4, TxtTelefono.getText());
            ps.setString(5, TxtCorreo.getText());
            ps.setDate(6, Date.valueOf(TxtFechaNac.getText()));
            ps.setString(7, CmbGenero.getSelectedItem().toString());
            
            int resp = ps.executeUpdate();
            
            if (resp > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiarCajas();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al guardar registro");
                limpiarCajas();
            }
            
            con.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }                                          

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        /**
         * Funcion para buscar registro
         */

        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("SELECT * FROM persona WHERE clave = ?");
            ps.setString(1, TxtClave.getText());
            
            rs = ps.executeQuery();
            
            if (rs.next()) 
            {
                TxtID.setText(rs.getString("ID"));
                TxtClave.setText(rs.getString("clave"));
                TxtNombre.setText(rs.getString("nombre"));
                TxtDomicilio.setText(rs.getString("domicilio"));
                TxtTelefono.setText(rs.getString("telefono"));
                TxtCorreo.setText(rs.getString("correo_electronico"));
                TxtFechaNac.setText(rs.getString("fecha_nacimiento"));
                CmbGenero.setSelectedItem(rs.getString("genero"));
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Registro NO encontrado");
            }
            
            con.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
        
    }                                         

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        /**
         * Funcion para modificar registro
         */

        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("UPDATE persona set clave = ?, nombre = ?, domicilio = ?, telefono = ?, correo_electronico = ?, fecha_nacimiento = ?, genero = ? WHERE ID = ?");
            ps.setString(1, TxtClave.getText());
            ps.setString(2, TxtNombre.getText());
            ps.setString(3, TxtDomicilio.getText());
            ps.setString(4, TxtTelefono.getText());
            ps.setString(5, TxtCorreo.getText());
            ps.setDate(6, Date.valueOf(TxtFechaNac.getText()));
            ps.setString(7, CmbGenero.getSelectedItem().toString());
            ps.setString(8, TxtID.getText());
            
            int resp = ps.executeUpdate();
            
            if (resp > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiarCajas();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al modificar registro");
                limpiarCajas();
            }
            
            con.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }                                            

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        /**
         * Funcion para eliminar registro
         */

        Connection con = null;
        try{
            con = getConection();
            ps = con.prepareStatement("DELETE FROM persona WHERE ID = ?");
            ps.setInt(1, Integer.parseInt(TxtID.getText()));
            
            int resp = ps.executeUpdate();
            
            if (resp > 0) 
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiarCajas();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al eliminar registro");
                limpiarCajas();
            }
            
            con.close();
            
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }                                           

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        /**
         * Funcion para limpiar los campos
         */

        limpiarCajas();
    }                                          

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) 
    {
        /**
         * Funcion para cerrar el programa
         */

        System.exit(0);
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JComboBox<String> CmbGenero;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDomicilio;
    private javax.swing.JTextField TxtFechaNac;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
