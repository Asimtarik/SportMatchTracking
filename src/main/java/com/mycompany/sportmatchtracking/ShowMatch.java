/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sportmatchtracking;

import static com.mycompany.sportmatchtracking.AddMatch.basketball;
import static com.mycompany.sportmatchtracking.AddMatch.football;
import static com.mycompany.sportmatchtracking.AddMatch.volleyball;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class ShowMatch extends javax.swing.JFrame {

    String previousPanel;
    public final static String football = "football";
    public final static String basketball = "basketball";
    public final static String volleyball = "volleyball";

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columnStrings = {"Own Stadium", "Score 1", "Score 2", "Deplacement", "Group", "Id"};

    /**
     * Creates new form ShowMatch
     */
    public ShowMatch(String previousPanel) {
        initComponents();
        this.previousPanel = previousPanel;
        tableModel.setColumnIdentifiers(columnStrings);
        ShowTable.setModel(tableModel);
        RefreshComboBox();
        RefreshTable();
    }

    private void RefreshTable() {
        tableModel.setRowCount(0);
        for (Match match : DataBase.getMatches()) {
            if (buttonGroup1.getSelection().equals(FootballRB.getModel()) && match instanceof FootballMatch footballmatch) {

                Vector vector = new Vector();
                vector.add(match.getTeam1());
                vector.add(match.getScore1());
                vector.add(match.getScore2());
                vector.add(match.getTeam2());
                vector.add(match.getTeam1().getGroupname());
                vector.add(match.getId());

                tableModel.addRow(vector);

            } else if (buttonGroup1.getSelection().equals(BasketballRB.getModel()) && match instanceof BasketballMatch basketballmatch) {
                Vector vector = new Vector();
                vector.add(match.getTeam1());
                vector.add(match.getScore1());
                vector.add(match.getScore2());
                vector.add(match.getTeam2());
                vector.add(match.getTeam1().getGroupname());
                vector.add(match.getId());

                tableModel.addRow(vector);
            } else if (buttonGroup1.getSelection().equals(VolleyballRB.getModel()) && match instanceof VolleyballMatch volleyballmatch) {
                Vector vector = new Vector();
                vector.add(match.getTeam1());
                vector.add(match.getScore1());
                vector.add(match.getScore2());
                vector.add(match.getTeam2());
                vector.add(match.getTeam1().getGroupname());
                vector.add(match.getId());

                tableModel.addRow(vector);

            }

        }

    }

    private void RefreshComboBox() {

        TeamComboBox.removeAllItems();

        for (SportTeam team : DataBase.getTeams()) {
            if (buttonGroup1.getSelection().equals(FootballRB.getModel()) && team instanceof FootballTeam) {

                TeamComboBox.addItem(team);

            } else if (buttonGroup1.getSelection().equals(BasketballRB.getModel()) && team instanceof BasketballTeam) {

                TeamComboBox.addItem(team);

            } else if (buttonGroup1.getSelection().equals(VolleyballRB.getModel()) && team instanceof VolleyballTeam) {

                TeamComboBox.addItem(team);

            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        FootballRB = new javax.swing.JRadioButton();
        VolleyballRB = new javax.swing.JRadioButton();
        BasketballRB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowTable = new javax.swing.JTable();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        txtTeam1 = new javax.swing.JTextField();
        txtTeam2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TeamComboBox = new javax.swing.JComboBox<>();
        ListButton = new javax.swing.JButton();
        ReturnButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(FootballRB);
        FootballRB.setSelected(true);
        FootballRB.setText("Football");
        FootballRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FootballRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(VolleyballRB);
        VolleyballRB.setText("Volleyball");
        VolleyballRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolleyballRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(BasketballRB);
        BasketballRB.setText("Basketball");
        BasketballRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasketballRBActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sport Type");
        jLabel1.setToolTipText("");

        ShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ShowTable);

        UpdateButton.setText("Update Team Scores");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Team 1");

        jLabel3.setText("Team 2");

        ListButton.setText("List");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        RefreshButton.setText("Clear Filter");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(320, 320, 320)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(txtTeam1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ReturnButton)))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FootballRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(BasketballRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(VolleyballRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TeamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(ListButton)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RefreshButton)
                                .addGap(84, 84, 84))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RefreshButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FootballRB)
                    .addComponent(VolleyballRB)
                    .addComponent(BasketballRB)
                    .addComponent(TeamComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BasketballRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasketballRBActionPerformed
        RefreshComboBox();
        RefreshTable();
    }//GEN-LAST:event_BasketballRBActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if (ShowTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selection is null?!", "Selection Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id = (int) tableModel.getValueAt(ShowTable.getSelectedRow(), 5);
        Match selectedMatch = null;
        for (Match match : DataBase.getMatches()) {
            if (match.getId() == id) {
                selectedMatch = match;
                break;
            }

        }
        try {

            if (selectedMatch.getTeam1() instanceof FootballTeam) {
                FootballTeam footballTeam = (FootballTeam) selectedMatch.getTeam1();
                FootballTeam footballTeam2 = (FootballTeam) selectedMatch.getTeam2();
                if (selectedMatch.getScore1() > selectedMatch.getScore2()) {
                    footballTeam.setWinNumber(footballTeam.getWinNumber() - 1);
                    footballTeam2.setLoseNumber(footballTeam2.getLoseNumber() - 1);

                } else if (selectedMatch.getScore1() == selectedMatch.getScore2()) {
                    footballTeam.setTieNumber(footballTeam.getTieNumber() - 1);
                    footballTeam2.setTieNumber(footballTeam2.getTieNumber() - 1);

                } else {
                    footballTeam2.setWinNumber(footballTeam2.getWinNumber() - 1);
                    footballTeam.setLoseNumber(footballTeam.getLoseNumber() - 1);

                }
                selectedMatch.setScore1(Integer.parseInt(txtTeam1.getText()));
                selectedMatch.setScore2(Integer.parseInt(txtTeam2.getText()));

                if (selectedMatch.getScore1() > selectedMatch.getScore2()) {
                    footballTeam.setWinNumber(footballTeam.getWinNumber() + 1);
                    footballTeam2.setLoseNumber(footballTeam2.getLoseNumber() + 1);
                    System.out.println("aesdrfghjkl");

                } else if (selectedMatch.getScore1() == selectedMatch.getScore2()) {
                    footballTeam.setTieNumber(footballTeam.getTieNumber() + 1);
                    footballTeam2.setTieNumber(footballTeam2.getTieNumber() + 1);

                } else {
                    footballTeam2.setWinNumber(footballTeam2.getWinNumber() + 1);
                    footballTeam.setLoseNumber(footballTeam.getLoseNumber() + 1);

                }
                footballTeam.setPoint();
                footballTeam2.setPoint();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter number", "Text Error", JOptionPane.ERROR_MESSAGE);
        }
        RefreshTable();
        JOptionPane.showMessageDialog(this, "Updated successfuly", "Succes!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void FootballRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FootballRBActionPerformed
        RefreshComboBox();
        RefreshTable();
    }//GEN-LAST:event_FootballRBActionPerformed

    private void VolleyballRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolleyballRBActionPerformed
        RefreshComboBox();
        RefreshTable();
    }//GEN-LAST:event_VolleyballRBActionPerformed

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        if (previousPanel.equals(football)) {
            Football football1 = new Football();
            football1.show();
            this.dispose();

        }
        if (previousPanel.equals(basketball)) {
            Basketball basketball1 = new Basketball();
            basketball1.show();
            this.dispose();
        }
        if (previousPanel.equals(volleyball)) {
            Volleyball volleyball1 = new Volleyball();
            volleyball1.show();
            this.dispose();
        }
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListButtonActionPerformed
        tableModel.setRowCount(0);
        SportTeam selectedTeam = (SportTeam) TeamComboBox.getSelectedItem();
        for (Match match : selectedTeam.getMatches()) {

            Vector vector = new Vector();
            vector.add(match.getTeam1());
            vector.add(match.getScore1());
            vector.add(match.getScore2());
            vector.add(match.getTeam2());
            vector.add(match.getTeam1().getGroupname());
            vector.add(match.getId());

            tableModel.addRow(vector);

        }

    }//GEN-LAST:event_ListButtonActionPerformed

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshButtonActionPerformed
        RefreshTable();
    }//GEN-LAST:event_RefreshButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if (ShowTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selection is null?!", "Selection Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id = (int) tableModel.getValueAt(ShowTable.getSelectedRow(), 5);
        Match selectedMatch = null;
        for (Match match : DataBase.getMatches()) {
            if (match.getId() == id) {
                selectedMatch = match;
                break;
            }

        }

        if (selectedMatch.getTeam1() instanceof FootballTeam) {
            FootballTeam footballTeam = (FootballTeam) selectedMatch.getTeam1();
            FootballTeam footballTeam2 = (FootballTeam) selectedMatch.getTeam2();
            if (selectedMatch.getScore1() > selectedMatch.getScore2()) {
                footballTeam.setWinNumber(footballTeam.getWinNumber() - 1);
                footballTeam2.setLoseNumber(footballTeam2.getLoseNumber() - 1);

            } else if (selectedMatch.getScore1() == selectedMatch.getScore2()) {
                footballTeam.setTieNumber(footballTeam.getTieNumber() - 1);
                footballTeam2.setTieNumber(footballTeam2.getTieNumber() - 1);

            } else {
                footballTeam2.setWinNumber(footballTeam2.getWinNumber() - 1);
                footballTeam.setLoseNumber(footballTeam.getLoseNumber() - 1);

            }
            footballTeam.setPoint();
            footballTeam2.setPoint();
    }//GEN-LAST:event_DeleteButtonActionPerformed
   
       selectedMatch.getTeam1().getMatches().remove(selectedMatch);
       selectedMatch.getTeam2().getMatches().remove(selectedMatch);
       DataBase.getMatches().remove(selectedMatch);
       RefreshTable();
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
            java.util.logging.Logger.getLogger(ShowMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ShowMatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BasketballRB;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JRadioButton FootballRB;
    private javax.swing.JButton ListButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JTable ShowTable;
    private javax.swing.JComboBox<Object> TeamComboBox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JRadioButton VolleyballRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTeam1;
    private javax.swing.JTextField txtTeam2;
    // End of variables declaration//GEN-END:variables
}
