
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
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

public class etud extends javax.swing.JFrame {

    public etud() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        Confirmer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablee = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        Modifier = new javax.swing.JButton();
        reinitialiser = new javax.swing.JButton();
        Ajoute = new javax.swing.JButton();
        Supprimer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        matri = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        matie = new javax.swing.JTextField();
        Modifier1 = new javax.swing.JButton();
        affiche = new javax.swing.JButton();
        affiche1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setForeground(new java.awt.Color(51, 153, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listes des etudiants");

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
                "Matricule", "Nom", "Prenom", "Date dn", "Niveau"
            }
        ));
        tablee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableeMouseClicked(evt);
            }
        });
        tablee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableedisplayKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tablee);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(Confirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search)
                    .addComponent(Confirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Matricule:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Nom:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Prenom:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("Date dn:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("niveau:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ajoute, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(34, 34, 34)
                        .addComponent(matie))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(date))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)
                        .addComponent(fname))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(name))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(matri))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Modifier1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(affiche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Supprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reinitialiser, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(affiche1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modifier1)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modifier)
                    .addComponent(Ajoute))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reinitialiser)
                    .addComponent(Supprimer))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(affiche)
                    .addComponent(affiche1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public ArrayList<etudiant> getTeachersList() {
        ArrayList<etudiant> teachersList = new ArrayList<>();
        Connection conn = dbconn.ConnectDB();
        String sql = "SELECT * FROM `etu`";
        Statement st;
        ResultSet rs;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            etudiant teach;
            while (rs.next()) {
                teach = new etudiant(rs.getInt("nume"), rs.getString("nome"), rs.getString("prenmoe"), rs.getDate("datee"), rs.getString("niveau"));
                teachersList.add(teach);
            }
        } catch (Exception e) {
        }
        return teachersList;
    }
    private void ConfirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmerActionPerformed
        // TODO add your handling code here:

        ArrayList<etudiant> liste = getTeachersList();
        DefaultTableModel mode1 = (DefaultTableModel) tablee.getModel();
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
public void display() {
        ArrayList<etudiant> list = getTeachersList();
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
                JOptionPane.showMessageDialog(null, "letudiant " + message + " ");
                reinitialiserActionPerformed(null);

            } else {
                JOptionPane.showMessageDialog(null, "letudiant nest pas " + message + "");
            }
        } catch (SQLException | HeadlessException e) {
        }

    }
     public ArrayList<etudiant> getTeachersList1() {
        ArrayList<etudiant> teachersList = new ArrayList<>();
        Connection conn = dbconn.ConnectDB();
         String sql ="select * from etu where nume = '" + search.getText()+"'";
        Statement st;
        ResultSet rs;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            etudiant teach;
            while (rs.next()) {
                teach = new etudiant(rs.getInt("nume"), rs.getString("nome"), rs.getString("prenmoe"), rs.getDate("dateee"), rs.getString("niveau"));
                teachersList.add(teach);
            }
        } catch (Exception e) {
        }
        return teachersList;
    }
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

    private void tableedisplayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableedisplayKeyReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        int i = tablee.getSelectedRow();
        TableModel mode1 = tablee.getModel();
        matri.setText(mode1.getValueAt(i, 0).toString());
        name.setText(mode1.getValueAt(i, 1).toString());
        fname.setText(mode1.getValueAt(i, 2).toString());
        date.setText(mode1.getValueAt(i, 3).toString());
        matie.setText(mode1.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tableedisplayKeyReleased


    
    private void afficheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afficheActionPerformed
        // TODO add your handling code here:
        display();
    }//GEN-LAST:event_afficheActionPerformed

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
        // TODO add your handling code here:
        String sql = "UPDATE `etu` SET `nume`='" + matri.getText() + "',`nome`='" + name.getText() + "',`prenmoe`='" + name.getText() + "',`datede`='" + date.getText() + "',`niveau`='" + matie.getText() + "' WHERE `nume`=" + matri.getText();
        execute(sql, "updated");
    }//GEN-LAST:event_ModifierActionPerformed

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

    private void AjouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouteActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO `etu`(`nume`, `nome`, `prenmoe`, `datee`, `niveau`) VALUES ('" + matri.getText() + "','" + name.getText() + "','" + fname.getText() + "','" + date.getText() + "','" + matie.getText() + "')";
        execute(sql, "inserted");
    }//GEN-LAST:event_AjouteActionPerformed

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM `etu` WHERE `nume`= " + matri.getText();
        execute(sql, "deleted");
    }//GEN-LAST:event_SupprimerActionPerformed

    private void matriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriActionPerformed

    private void Modifier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modifier1ActionPerformed
        // TODO add your handling code here:
        Mainform t=new Mainform();
        t.setVisible(true);
        this.hide();
    }//GEN-LAST:event_Modifier1ActionPerformed

    private void affiche1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affiche1ActionPerformed
        // TODO add your handling code here:
         try {
            
            String report="C:\\Users\\ROSS\\Desktop\\Gestiondcl\\selecetud.jrxml";
             
            JasperReport jr = JasperCompileManager.compileReport(report);
            HashMap st= new HashMap();
            int s= Integer.parseInt(matri.getText());
            st.put("id" , s);
            
            JasperPrint jp=JasperFillManager.fillReport(jr, st,dbconn.ConnectDB());
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
            java.util.logging.Logger.getLogger(etud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(etud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(etud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(etud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new etud().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField matie;
    private javax.swing.JTextField matri;
    private javax.swing.JTextField name;
    private javax.swing.JButton reinitialiser;
    private javax.swing.JTextField search;
    private javax.swing.JTable tablee;
    // End of variables declaration//GEN-END:variables
}
