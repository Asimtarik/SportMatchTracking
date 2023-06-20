/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sportmatchtracking;

import static com.mycompany.sportmatchtracking.AddMatch.basketball;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * &
 *
 * @author Lenovo
 */
public class Football extends javax.swing.JFrame {

    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultListModel listModel = new DefaultListModel();
    String[] columnStrings = {"Team Name", "Won", "Tied", "Lost", "Point"};
    String selectedGroupName = "Group 1";
    String previousPanel;
    String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String username = "root";
    String password = "kutluer";

    /**
     * Creates new form Football
     */
    public Football() {
        initComponents();
        tableModel.setColumnIdentifiers(columnStrings);
        TeamTable.setModel(tableModel);
        RefreshTable();
        BestTeamList.setModel(listModel);

        RefreshList();

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
        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        DeleteTeamButton = new javax.swing.JButton();
        GroupComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TeamTable = new javax.swing.JTable();
        Group1RB = new javax.swing.JRadioButton();
        Group2RB = new javax.swing.JRadioButton();
        Group3RB = new javax.swing.JRadioButton();
        AddTeamButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BestTeamList = new javax.swing.JList<>();
        txtTeamName = new javax.swing.JTextField();
        AddMatchButton = new javax.swing.JButton();
        ShowMatchButton = new javax.swing.JButton();
        BasketballButton = new javax.swing.JButton();
        VolleyballButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Group Number :");

        DeleteTeamButton.setText("Delete");
        DeleteTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteTeamButtonActionPerformed(evt);
            }
        });

        GroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        GroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FOOTBALL MATCH MANAGEMENT");

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
        Group1RB.setSelected(true);
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

        buttonGroup1.add(Group3RB);
        Group3RB.setText("Group 3");
        Group3RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Group3RBActionPerformed(evt);
            }
        });

        AddTeamButton.setText("Add");
        AddTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeamButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Team Name :");

        BestTeamList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "item 6" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(BestTeamList);

        AddMatchButton.setText("Add Match");
        AddMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMatchButtonActionPerformed(evt);
            }
        });

        ShowMatchButton.setText("Show Match");
        ShowMatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMatchButtonActionPerformed(evt);
            }
        });

        BasketballButton.setText("Basketball");
        BasketballButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasketballButtonActionPerformed(evt);
            }
        });

        VolleyballButton.setText("Volleyball");
        VolleyballButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolleyballButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
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
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BasketballButton)
                        .addGap(18, 18, 18)
                        .addComponent(VolleyballButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ShowMatchButton)
                        .addGap(18, 18, 18)
                        .addComponent(AddMatchButton))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Group1RB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Group2RB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(Group3RB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 40, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTeamName, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(GroupComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AddTeamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DeleteTeamButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(SaveButton)))))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)))
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
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveButton))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Group1RB)
                            .addComponent(Group2RB)
                            .addComponent(Group3RB)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddMatchButton)
                    .addComponent(ShowMatchButton)
                    .addComponent(BasketballButton)
                    .addComponent(VolleyballButton))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeamButtonActionPerformed

        DataBase.AddFootballTeam(txtTeamName.getText(), GroupComboBox.getSelectedItem().toString());

            RefreshTable();
    }//GEN-LAST:event_AddTeamButtonActionPerformed

    private void DeleteTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteTeamButtonActionPerformed

        for (int i = 0; i < DataBase.getTeams().size(); i++) {
            if (DataBase.getTeams().get(i) instanceof FootballTeam) {
                if (DataBase.getTeams().get(i).getName().equals(tableModel.getValueAt(TeamTable.getSelectedRow(), 0))) {
                    DataBase.getTeams().remove(i);
                }

            }
        }
        String teamName = txtTeamName.getText();

    // Delete the team from the database
    try (Connection connection = DriverManager.getConnection(url, username, password);
         PreparedStatement statement = connection.prepareStatement("DELETE FROM sys.team WHERE TeamName = ?")) {

        statement.setString(1, teamName);

        int rowsAffected = statement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Team deleted successfully.");
        } else {
            System.out.println("Failed to delete team.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    RefreshTable();

      
    }//GEN-LAST:event_DeleteTeamButtonActionPerformed

    private void Group1RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Group1RBActionPerformed
        selectedGroupName = "Group 1";
         tableModel.setRowCount(0);

        try (Connection connection = DriverManager.getConnection(url, username, password);
     PreparedStatement statement = connection.prepareStatement("SELECT * FROM sys.team WHERE TeamType = 'Football' AND GroupNumber = 1")) {

    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        
        String teamName = resultSet.getString("TeamName");
        int winNumber = resultSet.getInt("WinNumber");
        int loseNumber = resultSet.getInt("LoseNumber");
        int tieNumber = resultSet.getInt("TieNumber");
        int score = resultSet.getInt("Score");

        // Add a new row to the table model
        tableModel.addRow(new Object[]{teamName, winNumber, loseNumber, tieNumber, score});
    }
} catch (SQLException ex) {
    ex.printStackTrace();
}
       


    }//GEN-LAST:event_Group1RBActionPerformed

    private void Group2RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Group2RBActionPerformed
        selectedGroupName = "Group 2";
         tableModel.setRowCount(0);

         try (Connection connection = DriverManager.getConnection(url, username, password);
     PreparedStatement statement = connection.prepareStatement("SELECT * FROM sys.team WHERE TeamType = 'Football' AND GroupNumber = 2")) {

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
     PreparedStatement statement = connection.prepareStatement("SELECT * FROM sys.team WHERE TeamType = 'Football' AND GroupNumber = 3")) {

    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
       
        String teamName = resultSet.getString("TeamName");
        
        int winNumber = resultSet.getInt("WinNumber");
        int loseNumber = resultSet.getInt("LoseNumber");
        int tieNumber = resultSet.getInt("TieNumber");
        int score = resultSet.getInt("Score");

        // Add a new row to the table model
        tableModel.addRow(new Object[]{teamName, winNumber, loseNumber, tieNumber, score});
    }
} catch (SQLException ex) {
    ex.printStackTrace();
}
       
    }//GEN-LAST:event_Group3RBActionPerformed

    private void AddMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMatchButtonActionPerformed
        AddMatch addmatch = new AddMatch(AddMatch.football);
        addmatch.show();
        this.dispose();

    }//GEN-LAST:event_AddMatchButtonActionPerformed

    private void ShowMatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMatchButtonActionPerformed
        ShowMatch showmatch = new ShowMatch(ShowMatch.football);
        showmatch.show();
        this.dispose();
    }//GEN-LAST:event_ShowMatchButtonActionPerformed

    private void BasketballButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasketballButtonActionPerformed

        Basketball basketball1 = new Basketball();
        basketball1.show();
        this.dispose();
    }//GEN-LAST:event_BasketballButtonActionPerformed

    private void VolleyballButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolleyballButtonActionPerformed
        Volleyball volleyball1 = new Volleyball();
        volleyball1.show();
        this.dispose();
    }//GEN-LAST:event_VolleyballButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
String teamName = txtTeamName.getText();
    String groupNumber = GroupComboBox.getSelectedItem().toString();

    // Add the team to the database
    try (Connection connection = DriverManager.getConnection(url, username, password);
         PreparedStatement statement = connection.prepareStatement("INSERT INTO sys.team (TeamName,TeamId, TeamType, GroupNumber, WinNumber, LoseNumber, TieNumber, Score) VALUES (?,0 , 'Football', ?, 0, 0, 0, 0)")) {

        statement.setString(1, teamName);
        statement.setString(2, groupNumber);

        int rowsAffected = statement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Team added successfully.");
        } else {
            System.out.println("Failed to add team.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    

        
    }        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void GroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupComboBoxActionPerformed

    

    private void RefreshTable() {
        tableModel.setRowCount(0);
        for (SportTeam team : DataBase.getTeams()) {
            if (team instanceof FootballTeam footballteam) {
                if (footballteam.getGroupname().equals(selectedGroupName)) {
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

        ArrayList<SportTeam> footballteams = new ArrayList<>();

        footballteams.addAll(DataBase.getTeams());
        for (int i = 0; i < 6; i++) {
            int maxPoint = 0;
            SportTeam maxSportTeam = null;
            for (int j = 0; j < footballteams.size(); j++) {
                if (footballteams.get(j) instanceof FootballTeam) {
                    if (footballteams.get(j).getScore() > maxPoint) {
                        maxPoint = footballteams.get(j).getScore();
                        maxSportTeam = footballteams.get(j);

                    }

                }

            }
            if (maxSportTeam != null) {
                listModel.addElement(maxSportTeam.toString() + " " + maxSportTeam.getScore());
                footballteams.remove(maxSportTeam);
            }

        }

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
            java.util.logging.Logger.getLogger(Football.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Football.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Football.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Football.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Football().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMatchButton;
    private javax.swing.JButton AddTeamButton;
    private javax.swing.JButton BasketballButton;
    private javax.swing.JList<String> BestTeamList;
    private javax.swing.JButton DeleteTeamButton;
    private javax.swing.JRadioButton Group1RB;
    private javax.swing.JRadioButton Group2RB;
    private javax.swing.JRadioButton Group3RB;
    private javax.swing.JComboBox<String> GroupComboBox;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton ShowMatchButton;
    private javax.swing.JTable TeamTable;
    private javax.swing.JButton VolleyballButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtTeamName;
    // End of variables declaration//GEN-END:variables
}