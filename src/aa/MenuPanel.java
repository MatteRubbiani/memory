/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JLabel;

/**
 *  
 * @author matte
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    JLabel cardLabel = new JLabel(); Player[] playersMatrix; int playerTurn = 0; Player[] sortedPlayers; boolean bettiniWasTaken=false; int whoHasBettini; int tancreCounter=0;
    public MenuPanel(Player[] playersMatrix) {
        initComponents();
        setBackground(Costants.mainColor);
        this.playersMatrix = playersMatrix;
        this.sortedPlayers = playersMatrix;
        this.updatePlayerInfo();
        this.setClassifica();
    }
    
    public void setSortedPlayers(){
       Arrays.sort(this.sortedPlayers, Comparator.comparing(Player::getPoints).reversed());
    }
    
    public void setClassifica(){
        this.setSortedPlayers();
        int numberofplayers = this.playersMatrix.length;
        Player player;
        if (numberofplayers >= 4){
            player = sortedPlayers[3];
            fourthLabel.setText(player.name);
            fourthPointsLabel.setText(player.points + "");
        }else{
            fourthLabel.setVisible(false);
            fourthPointsLabel.setVisible(false);
            fourthNumber.setVisible(false);
        }
        
        if (numberofplayers >= 3){
            player = sortedPlayers[2];
            thirdLabel.setText(player.name);
            thirdPointsLabel.setText(player.points + "");
        }else{
            thirdLabel.setVisible(false);
            thirdPointsLabel.setVisible(false);
            thirdNumber.setVisible(false);
        }
        if (numberofplayers >= 2){
            player = sortedPlayers[1];
            secondLabel.setText(player.name);
            secondPointLabel.setText(player.points + "");
        }else{
            secondLabel.setVisible(false);
            secondPointLabel.setVisible(false);
            secondNumber.setVisible(false);
        }
        if (numberofplayers >= 1){
            player = sortedPlayers[0];
            firstLabel.setText(player.name);
            firstPointsLabel.setText(player.points + "");
        }else{
            firstLabel.setVisible(false);
            firstPointsLabel.setVisible(false);
            firstNumber.setVisible(false);
        }
    }
    
    public void setDescriptionLabel(String text){
        descriptionLabel.setText("<html>"+text+"</html>");
        descriptionLabel.setForeground(Color.black);

    }
    
    public void setNameLabel(String text){
        nameLabel.setText(text);
    }
    
    public void refresh(JLabel label){
        remove(this.cardLabel);
        setLabel(label);
        this.cardLabel = label;
        
    }
    
    public void setLabel(JLabel label){
        setLayout(new BorderLayout());
        add(label);
    }
    
    public void updatePlayerInfo(){
        playerLabel.setText("<html>"+this.playersMatrix[this.playerTurn%(this.playersMatrix.length)].name+"</html>");
    }
    
    public void addPointsToCurrentPlayer(int points){
        addPointsToPlayer(this.playerTurn, points);
    }
    
    public void addPointsToPlayer(int player, int points){
        this.playersMatrix[player%(this.playersMatrix.length)].points += points;
    }
    
    public void takeBettini(){
        bettiniWasTaken = true;
        whoHasBettini = this.playerTurn%(this.playersMatrix.length);
    }
    
    public void alertWrongCouple(int id){
        String text = "TEXT";
        //WRONG
        if (id == 3){
            text = "IL TABELLONE E' STATO MESCOLATO";
        }
        if (id == 4){
            text = "IL TABELLONE E' STATO RUOTATO SOTTOSOPRA";
        }
        if (id == 3){
            text = "IL TABELLONE E' STATO MESCOLATO";
        }
        
        if (!text.equals("TEXT")){
            descriptionLabel.setText("<html>"+text+"</html>");
            descriptionLabel.setForeground(Color.red);
        }
    }
    
    public void alertRightCouple(int id){
        String text = "TEXT";
        //RIGHT
        if (id == 0){
            text = "E' STATO SOTTRATTO UN PUNTO A TUTTI I GIOCATORI MENO CHE " +  this.playersMatrix[this.playerTurn%(this.playersMatrix.length)].name;
        }
        
        if (id == 6){
                text = "I PUNTI BETTINI SONO STATI ANNULLATI";
        }
        
        if (id == 9){
            text = "SONO STATI AGGIUNTI DUE PUNTI A " +  this.playersMatrix[this.playerTurn%(this.playersMatrix.length)].name;
        }
        
        if (!text.equals("TEXT")){
            descriptionLabel.setText("<html>"+text+"</html>");
            descriptionLabel.setForeground(Color.red);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        pointLabel = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        playerLabel = new javax.swing.JLabel();
        firstNumber = new javax.swing.JLabel();
        secondNumber = new javax.swing.JLabel();
        thirdNumber = new javax.swing.JLabel();
        fourthNumber = new javax.swing.JLabel();
        secondLabel = new javax.swing.JLabel();
        thirdLabel = new javax.swing.JLabel();
        fourthLabel = new javax.swing.JLabel();
        firstLabel = new javax.swing.JLabel();
        secondPointLabel = new javax.swing.JLabel();
        thirdPointsLabel = new javax.swing.JLabel();
        fourthPointsLabel = new javax.swing.JLabel();
        firstPointsLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        descriptionLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionLabel.setText("Descrizione");

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        nameLabel.setText("Nome");

        pointLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        label1.setText("è il turno di:");
        label1.setToolTipText("");
        label1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        playerLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        playerLabel.setText("Player");
        playerLabel.setToolTipText("");
        playerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        firstNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        firstNumber.setForeground(new java.awt.Color(232, 186, 19));
        firstNumber.setText("1°");

        secondNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        secondNumber.setForeground(new java.awt.Color(186, 183, 171));
        secondNumber.setText("2°");

        thirdNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        thirdNumber.setForeground(new java.awt.Color(181, 109, 0));
        thirdNumber.setText("3°");

        fourthNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fourthNumber.setText("4°");

        secondLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        secondLabel.setForeground(new java.awt.Color(186, 183, 171));
        secondLabel.setText("Player");
        secondLabel.setToolTipText("");
        secondLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        thirdLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        thirdLabel.setForeground(new java.awt.Color(181, 109, 0));
        thirdLabel.setText("Player");
        thirdLabel.setToolTipText("");
        thirdLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        fourthLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fourthLabel.setText("Player");
        fourthLabel.setToolTipText("");
        fourthLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        firstLabel.setBackground(new java.awt.Color(232, 186, 19));
        firstLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        firstLabel.setForeground(new java.awt.Color(232, 186, 19));
        firstLabel.setText("Player");
        firstLabel.setToolTipText("");
        firstLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        secondPointLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        secondPointLabel.setForeground(new java.awt.Color(186, 183, 171));
        secondPointLabel.setText("0");

        thirdPointsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        thirdPointsLabel.setForeground(new java.awt.Color(181, 109, 0));
        thirdPointsLabel.setText("0");

        fourthPointsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        fourthPointsLabel.setText("0");

        firstPointsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        firstPointsLabel.setForeground(new java.awt.Color(232, 186, 19));
        firstPointsLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thirdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourthNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fourthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(fourthPointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thirdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thirdPointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstPointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(secondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(secondPointLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1)
                            .addComponent(pointLabel))
                        .addGap(35, 35, 35)
                        .addComponent(playerLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(nameLabel)
                .addGap(37, 37, 37)
                .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(pointLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerLabel)
                    .addComponent(label1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNumber)
                    .addComponent(firstLabel)
                    .addComponent(firstPointsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondNumber)
                    .addComponent(secondLabel)
                    .addComponent(secondPointLabel))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirdLabel)
                    .addComponent(thirdNumber)
                    .addComponent(thirdPointsLabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourthNumber)
                    .addComponent(fourthLabel)
                    .addComponent(fourthPointsLabel))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel firstNumber;
    private javax.swing.JLabel firstPointsLabel;
    private javax.swing.JLabel fourthLabel;
    private javax.swing.JLabel fourthNumber;
    private javax.swing.JLabel fourthPointsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel playerLabel;
    private javax.swing.JLabel pointLabel;
    private javax.swing.JLabel secondLabel;
    private javax.swing.JLabel secondNumber;
    private javax.swing.JLabel secondPointLabel;
    private javax.swing.JLabel thirdLabel;
    private javax.swing.JLabel thirdNumber;
    private javax.swing.JLabel thirdPointsLabel;
    // End of variables declaration//GEN-END:variables
}
