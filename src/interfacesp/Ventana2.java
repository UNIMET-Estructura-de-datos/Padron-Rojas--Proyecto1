/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacesp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;



/**
 *
 * @author Alexandra
 */
public class Ventana2 extends javax.swing.JFrame {
     
     public static Ventana1 v1;
     private boolean bool;
     private String UsuarioInput;
     
    /**
     * Creates new form Ventana2
     */
    public Ventana2(Ventana1 v1) {
        initComponents();
        this.v1=v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.bool = false;
        this.UsuarioInput = "";
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                Ventana1.grafo.Writetxt(Ventana1.grafo);
                
                System.exit(0);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AtrasVent1 = new javax.swing.JButton();
        SalirVent2 = new javax.swing.JButton();
        NombreUsuario = new javax.swing.JTextField();
        IniciarsesionU = new javax.swing.JButton();
        IngresarUsuarios = new javax.swing.JLabel();
        UsuariosRegistrados = new javax.swing.JLabel();
        Seguir_NoSeguir = new javax.swing.JTextField();
        Seguir = new javax.swing.JButton();
        NoSeguir = new javax.swing.JButton();
        UsuariosR = new javax.swing.JComboBox<>();
        EliminarSeguir = new javax.swing.JLabel();
        FondoVent2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        AtrasVent1.setBackground(new java.awt.Color(255, 153, 51));
        AtrasVent1.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        AtrasVent1.setForeground(new java.awt.Color(0, 0, 0));
        AtrasVent1.setText("Atrás");
        AtrasVent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasVent1ActionPerformed(evt);
            }
        });
        getContentPane().add(AtrasVent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        SalirVent2.setBackground(new java.awt.Color(255, 153, 51));
        SalirVent2.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        SalirVent2.setForeground(new java.awt.Color(0, 0, 0));
        SalirVent2.setText("Salir");
        SalirVent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirVent2ActionPerformed(evt);
            }
        });
        getContentPane().add(SalirVent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        NombreUsuario.setBackground(new java.awt.Color(255, 255, 153));
        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, -1));

        IniciarsesionU.setBackground(new java.awt.Color(255, 255, 153));
        IniciarsesionU.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        IniciarsesionU.setForeground(new java.awt.Color(0, 0, 0));
        IniciarsesionU.setText("Ok");
        IniciarsesionU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarsesionUActionPerformed(evt);
            }
        });
        getContentPane().add(IniciarsesionU, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        IngresarUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        IngresarUsuarios.setFont(new java.awt.Font("Swis721 Ex BT", 0, 14)); // NOI18N
        IngresarUsuarios.setText("Ingrese su nombre de usuario");
        getContentPane().add(IngresarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 30, 260, -1));

        UsuariosRegistrados.setBackground(new java.awt.Color(0, 0, 0));
        UsuariosRegistrados.setFont(new java.awt.Font("Swis721 Ex BT", 0, 14)); // NOI18N
        UsuariosRegistrados.setText("Usuarios Registrados:");
        getContentPane().add(UsuariosRegistrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 170, 20));

        Seguir_NoSeguir.setBackground(new java.awt.Color(255, 255, 153));
        Seguir_NoSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seguir_NoSeguirActionPerformed(evt);
            }
        });
        getContentPane().add(Seguir_NoSeguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 160, -1));

        Seguir.setBackground(new java.awt.Color(255, 255, 153));
        Seguir.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        Seguir.setForeground(new java.awt.Color(0, 0, 0));
        Seguir.setText("Seguir");
        Seguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguirActionPerformed(evt);
            }
        });
        getContentPane().add(Seguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        NoSeguir.setBackground(new java.awt.Color(255, 255, 153));
        NoSeguir.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        NoSeguir.setForeground(new java.awt.Color(0, 0, 0));
        NoSeguir.setText("Dejar de seguir");
        NoSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoSeguirActionPerformed(evt);
            }
        });
        getContentPane().add(NoSeguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        UsuariosR.setBackground(new java.awt.Color(255, 255, 153));
        UsuariosR.setForeground(new java.awt.Color(255, 255, 153));
        UsuariosR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                UsuariosRItemStateChanged(evt);
            }
        });
        UsuariosR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosRActionPerformed(evt);
            }
        });
        getContentPane().add(UsuariosR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, -1));

        EliminarSeguir.setBackground(new java.awt.Color(0, 0, 0));
        EliminarSeguir.setFont(new java.awt.Font("Swis721 Ex BT", 0, 12)); // NOI18N
        EliminarSeguir.setForeground(new java.awt.Color(0, 0, 0));
        EliminarSeguir.setText("Seleccione de la lista, el Usuario que desea(o no) seguir ");
        getContentPane().add(EliminarSeguir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 380, 60));

        FondoVent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen1/FondoVent2.jpg"))); // NOI18N
        getContentPane().add(FondoVent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasVent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasVent1ActionPerformed
        
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_AtrasVent1ActionPerformed

    private void SalirVent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirVent2ActionPerformed
        Ventana1.grafo.Writetxt(Ventana1.grafo);
        System.exit(0);
        
    }//GEN-LAST:event_SalirVent2ActionPerformed

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed
/**
 * Este método se ejecuta cuando el usuario hace clic en el botón de inicio de sesión.
 * Primero, recupera el texto del campo NombreUsuario y lo valida.
 * Si el nombre de usuario no existe en el grafo, muestra un mensaje indicando que el usuario no existe.
 * Si el nombre de usuario existe, muestra un saludo al usuario y llena la lista desplegable UsuariosR con los nombres de los otros usuarios.
 *
 * @param evt El evento de acción. Este parámetro no se utiliza en el método.
 * 
 */

    private void IniciarsesionUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarsesionUActionPerformed
      
         
         UsuarioInput =NombreUsuario.getText();
         
         
          if (Ventana1.grafo.numVertice(UsuarioInput) == -1){
              JOptionPane.showMessageDialog(null, "El usuario no existe, intente registrarse.");
              NombreUsuario.setText("");
          }else{
              
                      int i =Ventana1.grafo.numVertice(UsuarioInput);
                  if (Ventana1.grafo.getTabAdy()[i].getUsuario().equalsIgnoreCase(UsuarioInput)){
                      JOptionPane.showMessageDialog(null, "Hola  "+Ventana1.grafo.getTabAdy()[i].getUsuario()+ " ! ");
                      NombreUsuario.setText("");
                      for (int j = 0; j < Ventana1.grafo.getNumVerts(); j++) {
                          if(!UsuarioInput.equalsIgnoreCase(Ventana1.grafo.getTabAdy()[j].getUsuario()))
                          UsuariosR.addItem(Ventana1.grafo.getTabAdy()[j].getUsuario());
                      }
                      
                  }
              }

         
        
    }//GEN-LAST:event_IniciarsesionUActionPerformed

    private void UsuariosRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosRActionPerformed
/**
 * Este método se ejecuta cuando el usuario hace clic en el botón de seguir.
 * Primero recupera el texto del campo Seguir_NoSeguir.
 * Si el usuario ya sigue a la persona indicada se muestra un mensaje indicando que ya sigue a esa persona.
 * Si el usuario no sigue a la persona indicada se  crea un nuevo arco en el grafo y muestra un mensaje indicando que ahora sigue a esa persona.
 *
 * @param evt El evento de acción. Este parámetro no se utiliza en el método.
 * 
 */

    private void SeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguirActionPerformed
        // TODO add your handling code here:
        String SeguirA_ = Seguir_NoSeguir.getText();
        //UsuarioInput= NombreUsuario.getText();
        if (Ventana1.grafo.adyacente(UsuarioInput, SeguirA_)){
            JOptionPane.showMessageDialog(null, "Usted ya sigue a "+SeguirA_+"!");
            Seguir_NoSeguir.setText("");
        }else{
        
        boolean bool =Ventana1.grafo.nuevoArco(UsuarioInput,SeguirA_ );
        if(bool){
        JOptionPane.showMessageDialog(null, "A partir de ahora sigue a:  "+SeguirA_  + "\nSi desea seguir a alguien más, seleccionelo en la lista!");
        }
        Seguir_NoSeguir.setText("");
    }//GEN-LAST:event_SeguirActionPerformed
    }
     /**
 * Este método se ejecuta cuando el usuario hace clic en el botón de no seguir.
 * Primero, recupera el texto del campo Seguir_NoSeguir.
 * Si el usuario sigue a la persona indicada se  elimina el arco correspondiente en el grafo y muestra un mensaje indicando que ya no sigue a esa persona.
 * Si el usuario no sigue a la persona indicada se  muestra un mensaje indicando que no sigue a esa persona.
 *
 * @param evt 
 * @author Alexandra Padrón
 */

    private void NoSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoSeguirActionPerformed
        // TODO add your handling code here:
        String NoSeguirA_ = Seguir_NoSeguir.getText();
        if (Ventana1.grafo.adyacente(UsuarioInput,NoSeguirA_)){
            int usuario = Ventana1.grafo.numVertice(UsuarioInput);
            int Uto_Delete = Ventana1.grafo.numVertice(NoSeguirA_);
            Ventana1.grafo.getTabAdy()[usuario].getList_ady().DeleteArconro(Uto_Delete);
            JOptionPane.showMessageDialog(null, "Usted ha dejado de Seguir a "+ NoSeguirA_);
            Seguir_NoSeguir.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Usted no sigue a "+NoSeguirA_);
            Seguir_NoSeguir.setText("");
        }
       
       
    }//GEN-LAST:event_NoSeguirActionPerformed
/**
 * Este método se ejecuta cuando el estado del elemento seleccionado en UsuariosR cambia.
 * Recupera el usuario seleccionado de UsuariosR y busca su correspondencia en el grafo.
 * Si encuentra una correspondencia se establece el texto de Seguir_NoSeguir en el usuario seleccionado.
 *
 * @param evt  Este parámetro no se utiliza en el método.
*/
    private void UsuariosRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_UsuariosRItemStateChanged
        // TODO add your handling code here:
        String Uselected =(String) UsuariosR.getSelectedItem();
            for (int i = 0; i < Ventana1.grafo.getNumVerts(); i++) {
                if (Uselected ==Ventana1.grafo.getTabAdy()[i].getUsuario()){
                Seguir_NoSeguir.setText(Uselected);
            }
        }
    }//GEN-LAST:event_UsuariosRItemStateChanged

    private void Seguir_NoSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seguir_NoSeguirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Seguir_NoSeguirActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasVent1;
    private javax.swing.JLabel EliminarSeguir;
    private javax.swing.JLabel FondoVent2;
    private javax.swing.JLabel IngresarUsuarios;
    private javax.swing.JButton IniciarsesionU;
    private javax.swing.JButton NoSeguir;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JButton SalirVent2;
    private javax.swing.JButton Seguir;
    private javax.swing.JTextField Seguir_NoSeguir;
    private javax.swing.JComboBox<String> UsuariosR;
    private javax.swing.JLabel UsuariosRegistrados;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
