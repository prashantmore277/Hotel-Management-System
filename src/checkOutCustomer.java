/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.nio.file.Files.exists;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.*;
/**
 *
 * @author PRASHANT MORE
 */
public class checkOutCustomer extends javax.swing.JFrame {

    /**
     * Creates new form checkOutCustomer
     */
    public checkOutCustomer() {
        initComponents();
        txtName.setEditable(false);
        txtCDate.setEditable(false);
        txtCheckOutDate.setEditable(false);
        txtMobNo.setEditable(false);
        txtPricePerDay.setEditable(false);
        txtNumbeOfDaysStay.setEditable(false);
        txtTotalAmount.setEditable(false);
        txtEmail.setEditable(false);
        
    }
    
    int id = 0;
    String Query;
    String roomType;
    String bed;
    String roomNo;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnCheckOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCheckOut = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtMobNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCheckOutDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPricePerDay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumbeOfDaysStay = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(110, 100));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Customer Check Out.png"))); // NOI18N
        jLabel1.setText("Customer Check Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 30, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Room No ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 120, 30));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(102, 0, 0));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 370, 30));

        btnCheckOut.setBackground(new java.awt.Color(102, 0, 51));
        btnCheckOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCheckOut.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut.setText("CheckOut");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 30));

        tableCheckOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Mobile Number", "Nationality", "Gender", "Email", "ID Proof", "Address", "CheckIn Date", "Room Number", "Bed", "Room Type", "Price Per Day"
            }
        ));
        jScrollPane1.setViewportView(tableCheckOut);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 1210, 180));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Customer Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 300, 30));

        txtMobNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMobNo.setForeground(new java.awt.Color(102, 0, 51));
        txtMobNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 280, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Check IN Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 300, 30));

        txtCDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCDate.setForeground(new java.awt.Color(102, 0, 51));
        txtCDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtCDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 290, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Check Out Date (Today)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 300, 30));

        txtCheckOutDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCheckOutDate.setForeground(new java.awt.Color(102, 0, 51));
        txtCheckOutDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckOutDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtCheckOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 290, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Customer Name ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, 30));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(102, 0, 51));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 290, 30));

        txtPricePerDay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPricePerDay.setForeground(new java.awt.Color(102, 0, 51));
        txtPricePerDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricePerDayActionPerformed(evt);
            }
        });
        getContentPane().add(txtPricePerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 290, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setText("Price Per Day");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 300, 30));

        txtNumbeOfDaysStay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNumbeOfDaysStay.setForeground(new java.awt.Color(102, 0, 51));
        txtNumbeOfDaysStay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumbeOfDaysStayActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumbeOfDaysStay, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 290, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("Number Of Days Stay");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 300, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 51));
        jLabel10.setText("Total Amount to Collect From Customer");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 330, 30));

        txtTotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTotalAmount.setForeground(new java.awt.Color(102, 0, 51));
        txtTotalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 290, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 51));
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 300, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 0, 51));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 280, 30));

        btnClear.setBackground(new java.awt.Color(102, 0, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 130, 30));

        btnSearch.setBackground(new java.awt.Color(102, 0, 51));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 130, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtMobNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobNoActionPerformed

    private void txtCDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCDateActionPerformed

    private void txtCheckOutDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckOutDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckOutDateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPricePerDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricePerDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricePerDayActionPerformed

    private void txtNumbeOfDaysStayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumbeOfDaysStayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumbeOfDaysStayActionPerformed

    private void txtTotalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String mobileNo = txtMobNo.getText();
        String email = txtEmail.getText();
        
        String checkOut = txtCheckOutDate.getText();
        String numberOfDaysStay = txtNumbeOfDaysStay.getText();
        String totalAmount = txtTotalAmount.getText();
        
        roomNo = txtSearch.getText();
        
        Query = "update customer set numberOfDays = '"+numberOfDaysStay+"', totalAmount = '"+totalAmount+"',checkOut = '"+checkOut+"' where id = '"+id+"' ";
        InsertUpdateDelete.setData(Query, "");
        Query="update room set status='Not Booked' where roomNo= '"+roomNo+"'";
        InsertUpdateDelete.setData(Query, "");
        
        String path = "P:\\Coding\\Projects\\Hotel Management System\\BillPDFs";
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        try {
             PdfWriter.getInstance(doc, new FileOutputStream(path+""+id+".pdf"));
             doc.open();
             Paragraph paragraph1 = new Paragraph("                                               Hotel Management System                                               ");
             doc.add(paragraph1);

             Paragraph paragraph2 = new Paragraph("*********************************************************************************************************************");
             doc.add(paragraph2);

             Paragraph paragraph3 = new Paragraph("\tBill ID : '"+id+"'\nCustomer Details : \nName : '"+name+"'\nMobileNo : '"+mobileNo+"'\nEmail : '"+email+"'");
             doc.add(paragraph3);

             doc.add(paragraph2);

             Paragraph paragraph4 = new Paragraph("\tRoom Details : \nNumber : '"+txtSearch.getText()+"'\nType : '"+roomType+"'\nBed : '"+bed+"'\nPrice Per Day : "+txtPricePerDay.getText()+"");
             doc.add(paragraph4);
             
             doc.add(paragraph2);
             
             PdfPTable tb1 =new PdfPTable(4);
             tb1.addCell("Check IN Date" + txtCDate.getText());
             
             tb1.addCell("Check OUT Date" + checkOut);
             
             tb1.addCell("Check IN Date" + numberOfDaysStay);
             
             tb1.addCell("Check IN Date" + totalAmount);
             
             doc.add(tb1);
             
             Paragraph paragraph5 = new Paragraph("Thanks you, Please Visit Again.");
             doc.add(paragraph5);
        }   
        catch (Exception e) {
            int a = JOptionPane.showConfirmDialog(null, "Do you want to Print Bill","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                try {
                    if((new File(path+id+".pdf")).exists()){
                        Process p = Runtime
                                .getRuntime()
                                .exec("rund1132 url.dll,FileProtocolHandler "+path+"+"+id+".pdf");
                       
                    }
                } 
                catch (IOException f) {
                    JOptionPane.showMessageDialog(null, f);
                }
            }
            setVisible(false);
            new checkOutCustomer().setVisible(true);
                    
        }
        
        
        
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new checkOutCustomer().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String roomNo = txtSearch.getText();
        try {
            ResultSet rs = Select.getData("select * from customer where roomNo ='"+roomNo+"' and checkout is NUll");
            if(rs.next()){
                txtSearch.setEditable(false);
                id = rs.getInt(1);
                txtName.setText(rs.getString(2));
                txtCDate.setText(rs.getString(9));
                txtPricePerDay.setText(rs.getString(13));
                txtMobNo.setText(rs.getString(3));
                SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
                Calendar cal = Calendar.getInstance();
                
                txtCheckOutDate.setText(myFormat.format(cal.getTime()));
                String dateBeforeString = rs.getString(9);
                java.util.Date dateBefore = myFormat.parse(dateBeforeString);
                String dateAfterString = myFormat.format(cal.getTime());
                java.util.Date dateAfter = myFormat.parse(dateAfterString);
                long difference = dateAfter.getTime() - dateBefore.getTime();
                int noOfDayStay = ( int ) (difference/(1000*60*60*24));
                if(noOfDayStay  == 0){
                    noOfDayStay = 1;
                }
                txtNumbeOfDaysStay.setText(String.valueOf(noOfDayStay));
                float price = Float.parseFloat(txtPricePerDay.getText());
                txtTotalAmount.setText(String.valueOf(noOfDayStay*price));
                txtEmail.setText(rs.getString(6));
                roomType = rs.getString(12);
                bed = rs.getString(11);
                
            }
            
            else{
                       JOptionPane.showMessageDialog(null,"Room Numbder is not booked or does not exist!!!!");
            }                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs = Select.getData("SELECT * from customer where checkOut is NULL");
        DefaultTableModel model = (DefaultTableModel) tableCheckOut.getModel();
        try{
            while(rs.next()){
                model.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)});     
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
            java.util.logging.Logger.getLogger(checkOutCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkOutCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkOutCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkOutCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkOutCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCheckOut;
    private javax.swing.JTextField txtCDate;
    private javax.swing.JTextField txtCheckOutDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumbeOfDaysStay;
    private javax.swing.JTextField txtPricePerDay;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalAmount;
    // End of variables declaration//GEN-END:variables
}
