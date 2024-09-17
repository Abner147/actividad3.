/* bomiki
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
//import javax.swing.table.DefaultTableModel;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;


//import vista;




/**
 *
 * @author hp
 */
public class fr_Personas extends javax.swing.JFrame {
Docente docente;
Persona persona;
    //DefaultTableModel tblModelo;

    /**@author bomiki
     * Creates new form fr_Personas
     */
    public fr_Personas() {
        initComponents();
        persona = new Persona();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();
   }

    public void selec_datos(){
    int fila = tbl_personas.getSelectedRow();
    if (fila >= 0) { 
        txt_codDocente1.setText(tbl_personas.getValueAt(fila, 0).toString());
        txt_nombres1.setText(tbl_personas.getValueAt(fila, 1).toString());
        txt_apellidos1.setText(tbl_personas.getValueAt(fila, 2).toString());
        txt_direccion1.setText(tbl_personas.getValueAt(fila, 3).toString());
        txt_nit1.setText(tbl_personas.getValueAt(fila, 4).toString());
        txt_telefon1.setText(tbl_personas.getValueAt(fila, 5).toString());
        txt_nacimiento1.setText(tbl_personas.getValueAt(fila, 6).toString());
        txt_salario.setText(tbl_personas.getValueAt(fila, 7).toString());
        txt_fi.setText(tbl_personas.getValueAt(fila, 8).toString()); //@author bomiki
        lbl_id_persona.setText(tbl_personas.getValueAt(fila, 9).toString());
        lbl_id_docente.setText(tbl_personas.getValueAt(fila, 10).toString());
            
    }
    }
    private void ocultarColumnas() {
    tbl_personas.getColumnModel().getColumn(9).setMinWidth(0);
    tbl_personas.getColumnModel().getColumn(9).setMaxWidth(0);
    tbl_personas.getColumnModel().getColumn(9).setWidth(0);
    tbl_personas.getColumnModel().getColumn(9).setPreferredWidth(0);

    tbl_personas.getColumnModel().getColumn(10).setMinWidth(0);
    tbl_personas.getColumnModel().getColumn(10).setMaxWidth(0);
    tbl_personas.getColumnModel().getColumn(10).setWidth(0);
    tbl_personas.getColumnModel().getColumn(10).setPreferredWidth(0);
}
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_principal = new javax.swing.JTabbedPane();
        panel_persona = new javax.swing.JPanel();
        lbl_nit1 = new javax.swing.JLabel();
        txt_nit1 = new javax.swing.JTextField();
        lbl_nombres1 = new javax.swing.JLabel();
        txt_nombres1 = new javax.swing.JTextField();
        lbl_apellidos1 = new javax.swing.JLabel();
        txt_apellidos1 = new javax.swing.JTextField();
        lbl_direccion1 = new javax.swing.JLabel();
        txt_direccion1 = new javax.swing.JTextField();
        lbl_telefono1 = new javax.swing.JLabel();
        txt_telefon1 = new javax.swing.JTextField();
        lbl_nacimiento1 = new javax.swing.JLabel();
        txt_nacimiento1 = new javax.swing.JTextField();
        btn_guardar1 = new javax.swing.JButton();
        jspanel_tabla1 = new javax.swing.JScrollPane();
        tbl_personas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbl_salario = new javax.swing.JLabel();
        lbl_salario1 = new javax.swing.JLabel();
        txt_fi = new javax.swing.JTextField();
        txt_codDocente1 = new javax.swing.JTextField();
        txt_salario = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        lbl_id_persona = new javax.swing.JLabel();
        lbl_id_docente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_persona.setBackground(new java.awt.Color(204, 204, 204));
        panel_persona.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_nit1.setText("Nit:");

        txt_nit1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nombres1.setText("Nombres:");

        txt_nombres1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_nombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres1ActionPerformed(evt);
            }
        });

        lbl_apellidos1.setText("Apellidos:");

        txt_apellidos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_direccion1.setText("Direccion:");

        txt_direccion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_telefono1.setText("Numero de telefono:");

        txt_telefon1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_nacimiento1.setText("Fecha de nacimiento:");

        txt_nacimiento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_guardar1.setBackground(new java.awt.Color(0, 102, 255));
        btn_guardar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardar1.setText("Guardar");
        btn_guardar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });

        tbl_personas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_personas.setGridColor(new java.awt.Color(196, 213, 198));
        tbl_personas.setShowGrid(false);
        tbl_personas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_personasMouseClicked(evt);
            }
        });
        tbl_personas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_personasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_personasKeyReleased(evt);
            }
        });
        jspanel_tabla1.setViewportView(tbl_personas);

        jLabel2.setText("Codigo");

        lbl_salario.setText("Salario");

        lbl_salario1.setText("Fecha de ingreso");

        txt_fi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_codDocente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_codDocente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codDocente1ActionPerformed(evt);
            }
        });

        txt_salario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_actualizar.setBackground(new java.awt.Color(0, 102, 51));
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_borrar.setBackground(new java.awt.Color(153, 0, 0));
        btn_borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar.setText("Borrar");
        btn_borrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        lbl_id_persona.setBackground(new java.awt.Color(204, 204, 204));
        lbl_id_persona.setForeground(new java.awt.Color(204, 204, 204));

        lbl_id_docente.setBackground(new java.awt.Color(204, 204, 204));
        lbl_id_docente.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel_personaLayout = new javax.swing.GroupLayout(panel_persona);
        panel_persona.setLayout(panel_personaLayout);
        panel_personaLayout.setHorizontalGroup(
            panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_personaLayout.createSequentialGroup()
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel_personaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_direccion1)
                                    .addComponent(lbl_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_nombres1)
                                    .addComponent(lbl_telefono1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_direccion1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(txt_apellidos1)
                                    .addComponent(txt_telefon1)
                                    .addComponent(txt_fi)
                                    .addComponent(txt_nacimiento1)
                                    .addComponent(txt_salario)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_personaLayout.createSequentialGroup()
                                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_id_docente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_nit1)
                                        .addComponent(jLabel2)))
                                .addGap(75, 75, 75)
                                .addComponent(lbl_id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nit1)
                                    .addComponent(txt_nombres1)
                                    .addComponent(txt_codDocente1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nacimiento1)
                            .addComponent(lbl_salario)
                            .addComponent(lbl_salario1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(btn_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_guardar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174))
            .addGroup(panel_personaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jspanel_tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panel_personaLayout.setVerticalGroup(
            panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_personaLayout.createSequentialGroup()
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codDocente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nit1)
                    .addComponent(txt_nit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id_docente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombres1)
                    .addComponent(txt_nombres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_apellidos1)
                            .addComponent(txt_apellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_direccion1)
                            .addComponent(txt_direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addComponent(lbl_telefono1)
                        .addGap(20, 20, 20)
                        .addComponent(lbl_nacimiento1)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_salario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_salario, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(panel_personaLayout.createSequentialGroup()
                        .addComponent(txt_telefon1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_personaLayout.createSequentialGroup()
                                .addComponent(txt_fi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addComponent(jspanel_tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        tab_principal.addTab("Persona", panel_persona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        // TODO add your handling code here author bomiki:
        double salario = Double.parseDouble(txt_salario.getText());
         java.sql.Timestamp Fecha_registro = new java.sql.Timestamp(System.currentTimeMillis());
        persona = new Persona(
        txt_nit1.getText(),     
        txt_codDocente1.getText(),
        salario,                             
        txt_nombres1.getText(),            
        txt_apellidos1.getText(),         
        txt_direccion1.getText(),         
        txt_telefon1.getText(),           
        txt_nacimiento1.getText(),  
        txt_fi.getText(),  
        Fecha_registro
        );
    try {
        persona.crearp();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();
    } catch (ParseException ex) {
        Logger.getLogger(fr_Personas.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        
    }//GEN-LAST:event_btn_guardar1ActionPerformed

    private void txt_codDocente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codDocente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codDocente1ActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        double salario = Double.parseDouble(txt_salario.getText());
        java.sql.Timestamp Fecha_registro = new java.sql.Timestamp(System.currentTimeMillis());
        persona = new Persona(
        txt_nit1.getText(),     
        txt_codDocente1.getText(),
        salario,                             
        txt_nombres1.getText(),            
        txt_apellidos1.getText(),         
        txt_direccion1.getText(),         
        txt_telefon1.getText(),           
        txt_nacimiento1.getText(),  
        txt_fi.getText(),  
        Fecha_registro,
        Integer.parseInt(lbl_id_persona.getText()), 
        Integer.parseInt(lbl_id_docente.getText())
        );
        persona.actualizarp();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();
        
        
        /*tbl_personas.getColumnModel().getColumn(indexColumn).setMinWidth(0);
        tbl_personas.getColumnModel().getColumn(indexColumn).setMaxWidth(0);
        tbl_personas.getColumnModel().getColumn(indexColumn).setWidth(0);
        tbl_personas.getColumnModel().getColumn(indexColumn).setPreferredWidth(0);*/
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
        persona = new Persona();
        persona.setId_persona(Integer.parseInt(lbl_id_persona.getText()));
        persona.setId_docente(Integer.parseInt(lbl_id_docente.getText()));
        persona.eliminarp();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();
        
        /*persona.eliminarp();
        this.tbl_personas.setModel(persona.leerp());
        ocultarColumnas();*/
        
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void tbl_personasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_personasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_personasKeyPressed

    private void tbl_personasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_personasKeyReleased
        // TODO add your handling code here:
        selec_datos();
    }//GEN-LAST:event_tbl_personasKeyReleased

    private void tbl_personasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_personasMouseClicked
        // TODO add your handling code author bomiki:here:
        selec_datos();
    }//GEN-LAST:event_tbl_personasMouseClicked

    private void txt_nombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombres1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fr_Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fr_Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fr_Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fr_Personas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new fr_Personas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jspanel_tabla1;
    private javax.swing.JLabel lbl_apellidos1;
    private javax.swing.JLabel lbl_direccion1;
    private javax.swing.JLabel lbl_id_docente;
    private javax.swing.JLabel lbl_id_persona;
    private javax.swing.JLabel lbl_nacimiento1;
    private javax.swing.JLabel lbl_nit1;
    private javax.swing.JLabel lbl_nombres1;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JLabel lbl_salario1;
    private javax.swing.JLabel lbl_telefono1;
    private javax.swing.JPanel panel_persona;
    private javax.swing.JTabbedPane tab_principal;
    private javax.swing.JTable tbl_personas;
    private javax.swing.JTextField txt_apellidos1;
    private javax.swing.JTextField txt_codDocente1;
    private javax.swing.JTextField txt_direccion1;
    private javax.swing.JTextField txt_fi;
    private javax.swing.JTextField txt_nacimiento1;
    private javax.swing.JTextField txt_nit1;
    private javax.swing.JTextField txt_nombres1;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_telefon1;
    // End of variables declaration//GEN-END:variables
}







// author bomiki: