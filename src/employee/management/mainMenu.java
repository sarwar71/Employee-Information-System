package employee.management;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class mainMenu extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    public mainMenu() {

        initComponents();
        con = db.java_db();

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        setTitle("Main Menu");
        
        lbl_emp.setText(String.valueOf(Emp.empName).toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("logged In As:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 454, 73, -1));

        lbl_emp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_emp.setText("emp");
        getContentPane().add(lbl_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 454, -1, -1));

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/images/logout1.png"))); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 11, 40, -1));

        jButton1.setText("Employee Manager");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 140, 50));

        jButton4.setText("Payment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 140, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/management/images/mainmenu.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 480));

        jMenu1.setText("Employee");

        jMenuItem6.setText("View All Employees");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Report");

        jMenuItem2.setText("Employees Report");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Employee Total Allowance Report");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Employee Total Deduction Report");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Audit");

        jMenuItem5.setText("Audit Trail");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed

        login x = new login();
        x.setVisible(true);
        this.dispose();

        try {

            Date currentDate = GregorianCalendar.getInstance().getTime();
            DateFormat df = DateFormat.getDateInstance();
            String dateString = df.format(currentDate);

            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String timeString = sdf.format(d);

            int value1 = Emp.empId;
            String value2 = timeString;
            String value3 = dateString;

            String reg = "insert into Audit(emp_id,date,status) values('" + value1 + "','" + value2 + "/" + value3 + "','Logged Out')";
            pstm = con.prepareStatement(reg);
            pstm.execute();
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pstm.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employee Total Deduction Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            try {
                String sql = "select * from Deductions";
                pstm = con.prepareStatement(sql);
                rs = pstm.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(8);
                myDocument.open();

                float[] columnWidths = new float[]{3, 7, 7, 5, 5, 9, 6, 5};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100); // set table width to 100%

                myDocument.add(new Paragraph("Employees Deduction List", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("---------------------------------------------------------------"
                        + "-------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Last Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Deduction Amount", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Deduction Reason", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Employee ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary After Deduction", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));

                while (rs.next()) {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                   
                }
                myDocument.add(table);
                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was Successfully Generated");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    rs.close();
                    pstm.close();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employees Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            try {
                String sql = "select * from Staff_information";
                pstm = con.prepareStatement(sql);
                rs = pstm.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(13);
                myDocument.open();

                float[] columnWidths = new float[]{3, 8, 7, 5, 5, 9, 8, 9, 6, 6, 6, 8, 8};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100); // set table width to 100%

                myDocument.add(new Paragraph("Employees List", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("---------------------------------------------------------------"
                        + "-------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Last Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Date of Birth", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Email", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Telephone", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Address", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Department", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Gender", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Status", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Date of Hired", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Job Title", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));

                while (rs.next()) {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(15), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(18), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(16), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));

                }
                myDocument.add(table);
                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was Successfully Generated");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    rs.close();
                    pstm.close();
                } catch (Exception e) {
                }
            }
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Audit x = new Audit();
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        addEmployee x = new addEmployee();
        x.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SearchEmpSalary x = new SearchEmpSalary();
        x.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employee Total Allowance Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

            try {
                String sql = "select * from Allowance";
                pstm = con.prepareStatement(sql);
                rs = pstm.executeQuery();

                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
                PdfPTable table = new PdfPTable(11);
                myDocument.open();

                float[] columnWidths = new float[]{3, 7, 7, 5, 5, 9, 6, 5, 8, 8, 8};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100); // set table width to 100%

                myDocument.add(new Paragraph("Employees Allowance List", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("---------------------------------------------------------------"
                        + "-------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Overtime", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Medical", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Bonus", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Other", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Employee ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Rate", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Total Allowance", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Last Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));

                while (rs.next()) {

                    table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(9), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(10), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                    table.addCell(new PdfPCell(new Paragraph(rs.getString(11), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));

                }
                myDocument.add(table);
                myDocument.close();
                JOptionPane.showMessageDialog(null, "Report was Successfully Generated");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    rs.close();
                    pstm.close();
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ViewEmployees v = new ViewEmployees();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lbl_emp;
    // End of variables declaration//GEN-END:variables
}
