/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sportmatchtracking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Basketball extends javax.swing.JFrame {

    DefaultTableModel tableModel = new DefaultTableModel();
    String[] columnStrings = {"Team Name", "Won", "Tied", "Lost", "Point"};
    String selectedGroupName = "Group1";
     DefaultListModel listModel = new DefaultListModel();
      String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String username = "root";
    String password = "kutluer";

    /**
     * Creates new form Basketball
     */
    public Basketball() {
        initComponents();
        tableModel.setColumnIdentifiers(columnStrings);
        TeamTable.setModel(tableModel);
        RefreshTable();
        BestTeamList.setModel(listModel);
        RefreshList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        AddTeamButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BestTeamList = new javax.swing.JList<>();
        DeleteTeamButton = new javax.swing.JButton();
        GroupComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TeamTable = new javax.swing.JTable();
        Group1RB = new javax.swing.JRadioButton();
        Group2RB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtTeamName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Group3RB = new javax.swing.JRadioButton();
        AddMatchButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddTeamButton.setText("Add");
        AddTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeamButtonActionPerformed(evt);
            }
        });

        BestTeamList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(BestTeamList);

        DeleteTeamButton.setText("Delete");
        DeleteTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTeamButtonActionPerformed(evt);
            }
        });

        GroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group 1", "Group 2", "Group 3" }));

        jLabel6.setText("Best Teams");

        TeamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Team Name", "Won", "Tied", "Lost", "Point"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TeamTable);

        buttonGroup1.add(Group1RB);
        Group1RB.setText("Group 1");
        Group1RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Group1RBActionPerformed(evt);
            }
        });

        buttonGroup1.add(Group2RB);
        Group2RB.setText("Group 2");
        Group2RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Group2RBActionPerformed(evt);
            }
        });

        jLabel1.setText("Team Name :");

        txtTeamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Group Number :");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BASKETBALL MATCH MANAGEMENT");

        buttonGroup1.add(Group3RB);
        Group3RB.setText("Group 3");
        Group3RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Group3RBActionPerformed(evt);
            }
        });

        AddMatchButton.setText("Add Match");
        AddMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMatchButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Football");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volleyball");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Group1RB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Group2RB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Group3RB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 80, Short.MAX_VALUE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTeamName, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                            .addComponent(GroupComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DeleteTeamButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddMatchButton)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddTeamButton)
                            .addComponent(DeleteTeamButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Group1RB)
                            .addComponent(Group2RB)
                            .addComponent(Group3RB)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddMatchButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeamButtonActionPerformed

        DataBase.AddBasketballTeam(txtTeamName.getText(), GroupComboBox.getSelectedItem().toString());
        RefreshTable();

    }//GEN-LAST:event_AddTeamButtonActionPerformed

    private void DeleteTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTeamButtonActionPerformed
        for (int i = 0; i < DataBase.getTeams().size(); i++) {
            if (DataBase.getTeams().get(i) instanceof BasketballTeam) {
                if (DataBase.getTeams().get(i).getName().equals(tableModel.getValueAt(TeamTable.getSelectedRow(), 0))) {
                    DataBase.getTeams().remove(i);
                }

            }
        }
        RefreshTable();
    }//GEN-LAST:event_DeleteTeamButtonActionPerformed

    private void Group1RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Group1RBActionPerformed
        selectedGroupName = "Group 1";
        tableModel.setRowCount(0);

         try (Connection connection = DriverManager.getConnection(url, username, password);
     PreparedStatement statement = connection.prepareStatement("SELECT * FROM sys.team WHERE TeamType = 'Basketball' AND GroupNumber = 1")) {

    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        
        String teamName = resultSet.getString("TeamName");
        int winNumber = resultSet.getInt("WinNumber");
        int loseNumber = resultSet.getInt("LoseNumber");
        int tieNumber = resultSet.getInt("TieNumber");
        int score = resultSet.getInt("Score");

        // Add a new row to the table model
        tableModel.addRow(new Object[]{ teamName, winNumber, loseNumber, tieNumber, score});
    }
} catch (SQLException ex) {
    ex.printStackTrace();
}
        
    }//GEN-LAST:event_Group1RBActionPerformed

    private void Group2RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Group2RBActionPerformed
        selectedGroupName = "Group 2";
        
         tableModel.setRowCount(0);

         try (Connection connection = DriverManager.getConnection(url, username, password);
     PreparedStatement statement = connection.prepareStatement("SELECT * FROM sys.team WHERE TeamType = 'Basketball' AND GroupNumber = 2")) {

    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        
        String teamName = resultSet.getString("TeamName");
        int winNumber = resultSet.getInt("WinNumber");
        int loseNumber = resultSet.getInt("LoseNumber");
        int tieNumber = resultSet.getInt("TieNumber");
        int score = resultSet.getInt("Score");

        // Add a new row to the table model
        tableModel.addRow(new Object[]{ teamName, winNumber, loseNumber, tieNumber, score});
    }
} catch (SQLException ex) {
    ex.printStackTrace();
}
      
    }//GEN-LAST:event_Group2RBActionPerformed

    private void Group3RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Group3RBActionPerformed
        selectedGroupName = "Group 3";
         tableModel.setRowCount(0);

         try (Connection connection = DriverManager.getConnection(url, username, password);
     PreparedStatement statement = connection.prepareStatement("SELECT * FROM sys.team WHERE TeamType = 'Basketball' AND GroupNumber = 1")) {

    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        
        String teamName = resultSet.getString("TeamName");
        int winNumber = resultSet.getInt("WinNumber");
        int loseNumber = resultSet.getInt("LoseNumber");
        int tieNumber = resultSet.getInt("TieNumber");
        int score = resultSet.getInt("Score");

        // Add a new row to the table model
        tableModel.addRow(new Object[]{ teamName, winNumber, loseNumber, tieNumber, score});
    }
} catch (SQLException ex) {
    ex.printStackTrace();
}
        
    }//GEN-LAST:event_Group3RBActionPerformed

    private void AddMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMatchButtonActionPerformed
        AddMatch addmatch = new AddMatch(AddMatch.basketball);
        addmatch.show();
        this.dispose();
    }//GEN-LAST:event_AddMatchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Football football1 = new Football();
        football1.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Volleyball volleyball1 = new Volleyball();
        volleyball1.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTeamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamNameActionPerformed

    private void RefreshTable() {
        tableModel.setRowCount(0);
        for (SportTeam team : DataBase.getTeams()) {
            if (team instanceof BasketballTeam basketballteam) {
                if (basketballteam.getGroupname().equals(selectedGroupName)) {
                    Vector vector = new Vector();
                    vector.add(team.getName());
                    vector.add(team.getWinNumber());
                    vector.add(team.getTieNumber());
                    vector.add(team.getLoseNumber());
                    vector.add(team.getScore());

                    tableModel.addRow(vector);

                }

            }

        }

    }

    public void RefreshList() {
        listModel.removeAllElements();

        ArrayList<SportTeam> basketballteams = new ArrayList<>();

        basketballteams.addAll(DataBase.getTeams());
        for (int i = 0; i < 6; i++) {
            int maxPoint = 0;
            SportTeam maxSportTeam = null;
            for (int j = 0; j < basketballteams.size(); j++) {
                if (basketballteams.get(j) instanceof FootballTeam) {
                    if (basketballteams.get(j).getScore() > maxPoint) {
                        maxPoint = basketballteams.get(j).getScore();
                        maxSportTeam = basketballteams.get(j);

                    }

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
            java.util.logging.Logger.getLogger(Basketball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basketball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basketball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basketball.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Basketball().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMatchButton;
    private javax.swing.JButton AddTeamButton;
    private javax.swing.JList<String> BestTeamList;
    private javax.swing.JButton DeleteTeamButton;
    private javax.swing.JRadioButton Group1RB;
    private javax.swing.JRadioButton Group2RB;
    private javax.swing.JRadioButton Group3RB;
    private javax.swing.JComboBox<String> GroupComboBox;
    private javax.swing.JTable TeamTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtTeamName;
    // End of variables declaration//GEN-END:variables
}
