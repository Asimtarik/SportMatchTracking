/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sportmatchtracking;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AddMatch extends javax.swing.JFrame {

    String previousPanel;
    String groupName = "Group 1";
    public final static String football = "football";
    public final static String basketball = "basketball";
    public final static String volleyball = "volleyball";

    /**
     * Creates new form AddMatch
     */
    public AddMatch(String previousPanel) {
        initComponents();
        this.previousPanel = previousPanel;
        RefreshComboBox();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        FootballRB = new javax.swing.JRadioButton();
        VolleyballRB = new javax.swing.JRadioButton();
        BasketballRB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        DeplacementCB = new javax.swing.JComboBox<>();
        StadiumCB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FirstTeamScore = new javax.swing.JSpinner();
        SecondTeamScore = new javax.swing.JSpinner();
        AddButton = new javax.swing.JButton();
        ReturnButton = new javax.swing.JButton();
        GroupComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(FootballRB);
        FootballRB.setSelected(true);
        FootballRB.setText("Football");
        FootballRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FootballRBActionPerformed(evt);
            }
        });
        getContentPane().add(FootballRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 52, 98, -1));

        buttonGroup1.add(VolleyballRB);
        VolleyballRB.setText("Volleyball");
        VolleyballRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolleyballRBActionPerformed(evt);
            }
        });
        getContentPane().add(VolleyballRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 91, 98, -1));

        buttonGroup1.add(BasketballRB);
        BasketballRB.setText("Basketball");
        BasketballRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasketballRBActionPerformed(evt);
            }
        });
        getContentPane().add(BasketballRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 130, 98, -1));

        jLabel1.setText("Sport Type :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 18, 98, -1));

        DeplacementCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Real Madrid" }));
        DeplacementCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeplacementCBActionPerformed(evt);
            }
        });
        getContentPane().add(DeplacementCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 105, 369, 30));

        StadiumCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barcelona" }));
        StadiumCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StadiumCBActionPerformed(evt);
            }
        });
        getContentPane().add(StadiumCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 61, 369, 30));

        jLabel2.setText("Own Stadium");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 68, 89, -1));

        jLabel3.setText("Deplacement");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 112, 89, -1));

        jLabel4.setText("Score :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 163, 44, 30));
        getContentPane().add(FirstTeamScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 167, -1, -1));
        getContentPane().add(SecondTeamScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 167, -1, -1));

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 211, 269, -1));

        ReturnButton.setText("Return");
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        GroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group 1", "Group 2", "Group 3" }));
        GroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(GroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeplacementCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeplacementCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeplacementCBActionPerformed

    private void StadiumCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StadiumCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StadiumCBActionPerformed

    private void FootballRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FootballRBActionPerformed
        RefreshComboBox();
    }//GEN-LAST:event_FootballRBActionPerformed

    private void VolleyballRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolleyballRBActionPerformed
        RefreshComboBox();
    }//GEN-LAST:event_VolleyballRBActionPerformed

    private void BasketballRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasketballRBActionPerformed
        RefreshComboBox();
    }//GEN-LAST:event_BasketballRBActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        SportTeam sportTeam1 = (SportTeam) StadiumCB.getSelectedItem();
        SportTeam sportTeam2 = (SportTeam) DeplacementCB.getSelectedItem();
        int score1 = (Integer) FirstTeamScore.getValue();
        int score2 = (Integer) SecondTeamScore.getValue();

        if (sportTeam1.equals(sportTeam2)) {
            JOptionPane.showMessageDialog(this, "Team names can not be the same!!!", "Matching Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (buttonGroup1.getSelection().equals(FootballRB.getModel())) {
            FootballMatch footballMatch = new FootballMatch(sportTeam1, sportTeam2, score1, score2);
            FootballTeam team1 = (FootballTeam) sportTeam1;
            FootballTeam team2 = (FootballTeam) sportTeam2;
            team1.getMatches().add(footballMatch);
            team2.getMatches().add(footballMatch);

            if (score1 > score2) {
                team1.setWinNumber(team1.getWinNumber() + 1);
                team2.setLoseNumber(team2.getLoseNumber() + 1);

            } else if (score1 == score2) {
                team1.setTieNumber(team1.getTieNumber() + 1);
                team2.setTieNumber(team2.getTieNumber() + 1);

            } else {
                team2.setWinNumber(team2.getWinNumber() + 1);
                team1.setLoseNumber(team1.getLoseNumber() + 1);

            }
            team1.setPoint();
            team2.setPoint();
            DataBase.getMatches().add(footballMatch);

        } else if (buttonGroup1.getSelection().equals(BasketballRB.getModel())) {
            BasketballMatch basketballMatch = new BasketballMatch(sportTeam1, sportTeam2, score1, score2);
            BasketballTeam team1 = (BasketballTeam) sportTeam1;
            BasketballTeam team2 = (BasketballTeam) sportTeam2;
            team1.getMatches().add(basketballMatch);
            team2.getMatches().add(basketballMatch);

            if (score1 > score2) {
                team1.setWinNumber(team1.getWinNumber() + 1);
                team2.setLoseNumber(team2.getLoseNumber() + 1);

            } else if (score1 == score2) {
                team1.setTieNumber(team1.getTieNumber() + 1);
                team2.setTieNumber(team2.getTieNumber() + 1);

            } else {
                team2.setWinNumber(team2.getWinNumber() + 1);
                team1.setLoseNumber(team1.getLoseNumber() + 1);

            }
            team1.setPoint();
            team2.setPoint();
            DataBase.getMatches().add(basketballMatch);

        } else if (buttonGroup1.getSelection().equals(VolleyballRB.getModel())) {
            VolleyballMatch volleyballMatch = new VolleyballMatch(sportTeam1, sportTeam2, score1, score2);
            VolleyballTeam team1 = (VolleyballTeam) sportTeam1;
            VolleyballTeam team2 = (VolleyballTeam) sportTeam2;
            team1.getMatches().add(volleyballMatch);
            team2.getMatches().add(volleyballMatch);

            if (score1 > score2) {
                team1.setWinNumber(team1.getWinNumber() + 1);
                team2.setLoseNumber(team2.getLoseNumber() + 1);

            } else {
                team2.setWinNumber(team2.getWinNumber() + 1);
                team1.setLoseNumber(team1.getLoseNumber() + 1);

            }
            team1.setPoint();
            team2.setPoint();
            DataBase.getMatches().add(volleyballMatch);

        }

JOptionPane.showMessageDialog(this, "Updated successfuly", "Succes!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AddButtonActionPerformed

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

    private void GroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupComboBoxActionPerformed
        groupName = GroupComboBox.getSelectedItem().toString();
        RefreshComboBox();

    }//GEN-LAST:event_GroupComboBoxActionPerformed

    private void RefreshComboBox() {

        StadiumCB.removeAllItems();
        DeplacementCB.removeAllItems();

        for (SportTeam team : DataBase.getTeams()) {
            if (buttonGroup1.getSelection().equals(FootballRB.getModel()) && team instanceof FootballTeam) {
                if (team.getGroupname().equals(groupName)) {
                    StadiumCB.addItem(team);
                    DeplacementCB.addItem(team);

                }

            } else if (buttonGroup1.getSelection().equals(BasketballRB.getModel()) && team instanceof BasketballTeam) {
                if (team.getGroupname().equals(groupName)) {
                    StadiumCB.addItem(team);
                    DeplacementCB.addItem(team);

                }
            } else if (buttonGroup1.getSelection().equals(VolleyballRB.getModel()) && team instanceof VolleyballTeam) {
                if (team.getGroupname().equals(groupName)) {
                    StadiumCB.addItem(team);
                    DeplacementCB.addItem(team);

                }

            }

        }

    }

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
            java.util.logging.Logger.getLogger(AddMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AddMatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JRadioButton BasketballRB;
    private javax.swing.JComboBox<Object> DeplacementCB;
    private javax.swing.JSpinner FirstTeamScore;
    private javax.swing.JRadioButton FootballRB;
    private javax.swing.JComboBox<String> GroupComboBox;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JSpinner SecondTeamScore;
    private javax.swing.JComboBox<Object> StadiumCB;
    private javax.swing.JRadioButton VolleyballRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
