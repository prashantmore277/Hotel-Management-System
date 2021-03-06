/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.mysql.cj.protocol.Resultset;
import project.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author PRASHANT MORE
 */
public class ManageRoom extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoom
     */
    public ManageRoom() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRoom = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtRoomNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboBed = new javax.swing.JComboBox<>();
        txtPrice = new javax.swing.JTextField();
        btnAddRoom = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setBackground(new java.awt.Color(102, 0, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Price");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(120, 140));
        setMinimumSize(new java.awt.Dimension(1266, 600));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage room.png"))); // NOI18N
        jLabel1.setText("Manage Room");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 178, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, -1));

        tableRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableRoom);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 121, 730, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Room Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 300, 30));

        txtRoomNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRoomNo.setForeground(new java.awt.Color(102, 0, 51));
        getContentPane().add(txtRoomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 300, 30));

        jLabel3.setBackground(new java.awt.Color(102, 0, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Room Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 300, 30));

        comboType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboType.setForeground(new java.awt.Color(102, 0, 51));
        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-AC" }));
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });
        getContentPane().add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 300, 30));

        jLabel4.setBackground(new java.awt.Color(102, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Bed");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 300, 30));

        comboBed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboBed.setForeground(new java.awt.Color(102, 0, 51));
        comboBed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Tripple" }));
        comboBed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBedActionPerformed(evt);
            }
        });
        getContentPane().add(comboBed, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 300, 30));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(102, 0, 51));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, 300, 30));

        btnAddRoom.setBackground(new java.awt.Color(102, 0, 51));
        btnAddRoom.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRoom.setText("Add Room");
        btnAddRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, 110, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomActionPerformed
        // TODO add your handling code here:
        String roomNo = txtRoomNo.getText();
        String roomType = (String) comboType.getSelectedItem();
        String bed = (String ) comboBed.getSelectedItem();
        String price = txtPrice.getText();
        
        
        String query = "insert into room values('"+roomNo+"','"+roomType+"','"+bed+"','"+price+"','Not Booked')";
        InsertUpdateDelete.setData(query, "Successfully Updated");
        setVisible(false);
        new ManageRoom().setVisible(true);
    }//GEN-LAST:event_btnAddRoomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTypeActionPerformed

    private void comboBedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBedActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs =  Select.getData("select * from room");
        DefaultTableModel model = (DefaultTableModel) tableRoom.getModel();
        
        try{    
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }
            rs.close();

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRoom;
    private javax.swing.JComboBox<String> comboBed;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableRoom;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomNo;
    // End of variables declaration//GEN-END:variables
}
