
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROSS
 */
public class prof extends javax.swing.JFrame {

    /**
     * Creates new form prof
     */
    public prof() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        Confirmer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablee = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Modifier = new javax.swing.JButton();
        reinitialiser = new javax.swing.JButton();
        Ajoute = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        matri = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        matie = new javax.swing.JTextField();
        Modifier1 = new javax.swing.JButton();
        affiche = new javax.swing.JButton();
        affiche1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listes des enseignants");

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Confirmer.setBackground(new java.awt.Color(255, 255, 255));
        Confirmer.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Confirmer.setText("Rechercher");
        Confirmer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Confirmer.setContentAreaFilled(false);
        Confirmer.setOpaque(true);
        Confirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmerActionPerformed(evt);
            }
        });

        tablee.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricule", "Nom", "Prenom", "Date dn", "Matiere"
            }
        ));
        tablee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableeMouseClicked(evt);
            }
        });
        tablee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                displayKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tablee);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Confirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Confirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Modifier.setBackground(new java.awt.Color(51, 153, 255));
        Modifier.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Modifier.setText("Modifier");
        Modifier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Modifier.setContentAreaFilled(false);
        Modifier.setOpaque(true);
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });

        reinitialiser.setBackground(new java.awt.Color(51, 153, 255));
        reinitialiser.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        reinitialiser.setText("reinitialiser");
        reinitialiser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reinitialiser.setContentAreaFilled(false);
        reinitialiser.setOpaque(true);
        reinitialiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinitialiserActionPerformed(evt);
            }
        });

        Ajoute.setBackground(new java.awt.Color(51, 153, 255));
        Ajoute.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Ajoute.setText("Ajouter");
        Ajoute.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ajoute.setContentAreaFilled(false);
        Ajoute.setOpaque(true);
        Ajoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouteActionPerformed(evt);
            }
        });

        Supprimer.setBackground(new java.awt.Color(51, 153, 255));
        Supprimer.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Supprimer.setText("Supprimer");
        Supprimer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Supprimer.setContentAreaFilled(false);
        Supprimer.setOpaque(true);
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Matricule:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Nom:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Prenom:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Date dn:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Matiere:");

        matri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriActionPerformed(evt);
            }
        });

        Modifier1.setBackground(new java.awt.Color(255, 255, 255));
        Modifier1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Modifier1.setIcon(new javax.swing.ImageIcon("D:\\Etude\\3 eme anne\\s5\\NetBeansProjects\\Gestion\\Undo-icon.png")); // NOI18N
        Modifier1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Modifier1.setContentAreaFilled(false);
        Modifier1.setOpaque(true);
        Modifier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modifier1ActionPerformed(evt);
            }
        });

        affiche.setBackground(new java.awt.Color(51, 153, 255));
        affiche.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        affiche.setText("Afficher");
        affiche.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        affiche.setContentAreaFilled(false);
        affiche.setOpaque(true);
        affiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afficheActionPerformed(evt);
            }
        });

        affiche1.setBackground(new java.awt.Color(51, 153, 255));
        affiche1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        affiche1.setText("Imprimer");
        affiche1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        affiche1.setContentAreaFilled(false);
        affiche1.setOpaque(true);
        affiche1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affiche1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ajoute, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(matri))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(28, 28, 28)
                        .addComponent(matie))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(date)
                            .addComponent(fname)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Modifier1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(affiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(18, 23, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reinitialiser, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(affiche1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Modifier1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modifier)
                    .addComponent(Ajoute))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reinitialiser)
                    .addComponent(Supprimer))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(affiche)
                    .addComponent(affiche1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Modifier.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public ArrayList<profes> getTeachersList() {
        ArrayList<profes> teachersList = new ArrayList<>();
        Connection conn = dbconn.ConnectDB();
        String sql = "SELECT * FROM `prof`";
        Statement st;
        ResultSet rs;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            profes teach;
            while (rs.next()) {
                teach = new profes(rs.getInt("numpro"), rs.getString("nomp"), rs.getString("prenomp"), rs.getDate("datedp"), rs.getString("mat"));
                teachersList.add(teach);
            }
        } catch (Exception e) {
        }
        return teachersList;
    }
public ArrayList<profes> getTeachersList1() {
        ArrayList<profes> teachersList = new ArrayList<>();
        Connection conn = dbconn.ConnectDB();
         String sql ="select * from prof where numpro = '" + search.getText()+"'";
        Statement st;
        ResultSet rs;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            profes teach;
            while (rs.next()) {
                teach = new profes(rs.getInt("numpro"), rs.getString("nomp"), rs.getString("prenomp"), rs.getDate("datedp"), rs.getString("mat"));
                teachersList.add(teach);
            }
        } catch (Exception e) {
        }
        return teachersList;
    }

    public void display() {
        ArrayList<profes> list = getTeachersList();
        DefaultTableModel mode1 = (DefaultTableModel) tablee.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMAT();
            row[1] = list.get(i).getFirstname();
            row[2] = list.get(i).getLastname();
            row[3] = list.get(i).getdate();
            row[4] = list.get(i).getMat();
            mode1.addRow(row);
        }
    }
    
     public void execute(String sql, String message) {
        Connection conn = dbconn.ConnectDB();
        Statement st;
        try {
            st = conn.createStatement();
            if (1 == st.executeUpdate(sql)) {

                //refrech 
                DefaultTableModel mode1 = (DefaultTableModel) tablee.getModel();
                mode1.setRowCount(0);
                display();
                JOptionPane.showMessageDialog(null, "le prof " + message + " ");
                reinitialiserActionPerformed(null);

            } else {
                JOptionPane.showMessageDialog(null, "le prof nest pas " + message + "");
            }
        } catch (SQLException | HeadlessException e) {
        }

    }
    
    
    
    
    
    
    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM `prof` WHERE `numpro`= " + matri.getText();
        execute(sql, "deleted");
    }//GEN-LAST:event_SupprimerActionPerformed

    private void reinitialiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinitialiserActionPerformed
        // TODO add your handling code here:
        matri.setText("");
        name.setText("");
        fname.setText("");
        date.setText("");
        matie.setText("");
        search.setText("");
        
        DefaultTableModel mode1 = (DefaultTableModel) tablee.getModel();
                mode1.setRowCount(0);
    }//GEN-LAST:event_reinitialiserActionPerformed

    private void matriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriActionPerformed

    
    
    private void ConfirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmerActionPerformed
        // TODO add your handling code here:
       
       ArrayList<profes> liste = getTeachersList1();
        DefaultTableModel mode1 = (DefaultTableModel) tablee.getModel();
         mode1.setRowCount(0);
        Object[] row = new Object[5];
        for (int i = 0; i < liste.size(); i++) {
            row[0] = liste.get(i).getMAT();
            row[1] = liste.get(i).getFirstname();
            row[2] = liste.get(i).getLastname();
            row[3] = liste.get(i).getdate();
            row[4] = liste.get(i).getMat();
            mode1.addRow(row);
        }
       
            
      
       
    }//GEN-LAST:event_ConfirmerActionPerformed

    private void AjouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouteActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO `prof`(`numpro`, `nomp`, `prenomp`, `datedp`, `mat`) VALUES ('" + matri.getText() + "','" + name.getText() + "','" + fname.getText() + "','" + date.getText() + "','" + matie.getText() + "')";
        execute(sql, "inserted");
    }//GEN-LAST:event_AjouteActionPerformed

    private void displayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_displayKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        int i = tablee.getSelectedRow();
        TableModel mode1 = tablee.getModel();
        matri.setText(mode1.getValueAt(i, 0).toString());
        name.setText(mode1.getValueAt(i, 1).toString());
        fname.setText(mode1.getValueAt(i, 2).toString());
        date.setText(mode1.getValueAt(i, 3).toString());
        matie.setText(mode1.getValueAt(i, 4).toString());
    }//GEN-LAST:event_displayKeyReleased

    private void tableeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableeMouseClicked
        // TODO add your handling code here:
        int i = tablee.getSelectedRow();
        TableModel mode1 = tablee.getModel();
        matri.setText(mode1.getValueAt(i, 0).toString());
        name.setText(mode1.getValueAt(i, 1).toString());
        fname.setText(mode1.getValueAt(i, 2).toString());
        date.setText(mode1.getValueAt(i, 3).toString());
        matie.setText(mode1.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tableeMouseClicked

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
        // TODO add your handling code here:
        String sql = "UPDATE `prof` SET `numpro`='" + matri.getText() + "',`nomp`='" + name.getText() + "',`prenomp`='" + name.getText() + "',`datedp`='" + date.getText() + "',`mat`='" + matie.getText() + "' WHERE `numpro`=" + matri.getText();
        execute(sql, "updated");
    }//GEN-LAST:event_ModifierActionPerformed

    private void afficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficheActionPerformed
        // TODO add your handling code here:
        display();
    }//GEN-LAST:event_afficheActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void Modifier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifier1ActionPerformed
        // TODO add your handling code here:
        Mainform t=new Mainform();
        t.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Modifier1ActionPerformed

    private void affiche1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affiche1ActionPerformed
        // TODO add your handling code here:
         try {
            String report="C:\\Users\\ROSS\\Desktop\\Gestiondcl\\tabprof.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(report);
            JasperPrint jp=JasperFillManager.fillReport(jr, null,dbconn.ConnectDB());
            JasperViewer.viewReport(jp);
        } catch (JRException ex) {
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_affiche1ActionPerformed

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
            java.util.logging.Logger.getLogger(prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prof().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajoute;
    private javax.swing.JButton Confirmer;
    private javax.swing.JButton Modifier;
    private javax.swing.JButton Modifier1;
    private javax.swing.JButton Supprimer;
    private javax.swing.JButton affiche;
    private javax.swing.JButton affiche1;
    private javax.swing.JTextField date;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matie;
    private javax.swing.JTextField matri;
    private javax.swing.JTextField name;
    private javax.swing.JButton reinitialiser;
    private javax.swing.JTextField search;
    private javax.swing.JTable tablee;
    // End of variables declaration//GEN-END:variables
}
