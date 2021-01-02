/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author matte
 */
public class Card extends javax.swing.JPanel implements ActionListener {

    int status; int id; JLabel backImage; String superPowerDescription; Image frontImage; String name; JLabel front_image; boolean isMorelliVersion = false;
    public Card(int card_id, String description) throws IOException {
        initComponents();
        this.status = 0; //back:0, front:1, taken:2
        this.id = card_id;  // reference to outer array with all details
        this.superPowerDescription = description;
        this.name = GamePanel.namesMatrix[id % 20];
        this.front_image = loadImage();
        //this.Front.image = ...
    }
    
    public void rotateCardUp(){
        cardBackBtn.setVisible(false);
        status = 1;
        setLayout(new BorderLayout());
        add(this.front_image);
    }
    
    private void updateMenuPanelCardInfo(){
            Game.mp.setDescriptionLabel(this.superPowerDescription);
            Game.mp.setNameLabel(this.name);
            JLabel front_image_1 = createImageGivenId("ciao");
            Game.mp.refresh(front_image_1);
    }
    
    public void turnCardUp() {
        //Game.gp.changeToMorelliVersion();
        rotateCardUp(); 
        Game.numeroMosse += 1;
        Game.numeroMosseReali +=1;
        
        
        int numeroMosse = Game.numeroMosse;
        if (numeroMosse % 3 == 1){
            updateMenuPanelCardInfo();
            superPowerSingle();
            Game.gp.changeLastCardUp(this);
        }
        
        if (numeroMosse % 3 == 2){
            Card firstCard = Game.gp.lastCardUp;
            if (firstCard.name.equals(this.name)){
                superPowerRightCouple();
                firstCard.status = 2;
                this.status = 2;
                Game.mp.addPointsToCurrentPlayer(1);
            }else{
                superPowerWrongCouple();
                Game.mp.playerTurn += 1;
            }
            Game.mp.updatePlayerInfo();
            Game.mp.setClassifica();
        }
        if (numeroMosse % 3 == 0){
            Game.numeroMosseReali -=1;
            Game.gp.turnDownAll();
            turnCardUp();
        }
        
    }

    public void turnCardDown() {
        if (status == 1) {
            remove(this.front_image);
            cardBackBtn.setVisible(true);
            status = 0;
            Game.mp.setDescriptionLabel("");
        }

    }
    
    private void superPowerWrongCouple(){
        Card c = Game.gp.lastCardUp;
        Game.mp.alertWrongCouple(c.id);
        //garbesi 2
        if (c.id % 20 == 2){
            Game.gp.PattyUnlt();
        }
        //artioli 3
        if (c.id % 20 == 3){
            Game.gp.artioliFill();
        }
        //longagnani 4
        if (c.id % 20 == 4){
            Game.gp.longaFill();
        }
        //Tancredi 7
        if (c.id % 20 == 7){
            if (Game.mp.tancreCounter<1){
                Game.numeroMosse--;
                Game.mp.playerTurn -= 1;
                Game.mp.tancreCounter++;
            }else{
                Game.mp.tancreCounter = 0;
            }
        }else{
            Game.gp.changeLastCardUp(this);
        }
    }
    
    private void superPowerRightCouple(){
        Game.mp.alertRightCouple(Game.gp.lastCardUp.id);
        Card c = Game.gp.lastCardUp;
        //ferraguri 0
        if (c.id % 20 == 0){
            for (int i=0; i<Game.mp.playersMatrix.length; i++){
                if (Game.mp.playerTurn % Game.mp.playersMatrix.length != i && Game.mp.playersMatrix[i].points>0){  
                   Game.mp.playersMatrix[i].points --;
                }
 
            }
        }
        //garbesi 2
        if (c.id % 20 == 2){
            Game.gp.PattyUnlt();
        }
        //muratori 6
        if (c.id % 20 == 6){
           if (Game.mp.bettiniWasTaken){
               Game.mp.addPointsToPlayer(Game.mp.whoHasBettini, -1);
           }else{
               Game.gp.popBettini();
           }
        }
        
        //della casa 9
        if (c.id % 20 == 9){
            Game.mp.addPointsToCurrentPlayer(1);
        }
        //bettini 10
        if (c.id % 20 == 10){
            Game.mp.takeBettini();
        }
     
    }
    
    private void superPowerSingle(){
        //Garbersi 2
        if (this.id % 20 == 2){
            Game.gp.pattyHlt(this.id);
        }
        //Baraldi 5
        if (this.id % 20 == 5){
            //trova punteggio da togliere
            int ptr = Game.mp.sortedPlayers[Game.mp.sortedPlayers.length-1].points;
            for (Player i : Game.mp.playersMatrix){
                i.points-=ptr;
            }
        }
        //Parlato 12
        //Morelli 17
        
    }
    
    public void changeToMorelliVersion(){
        isMorelliVersion = true;
        ImageIcon icon = createImageIcon("imagesMORELLI/" + 10 + ".jpg", this.id+"");
        //ImageIcon icon = createImageIcon("imagesMORELLI/" + this.id % 20 + ".jpg", this.id+"");
        JLabel label1 = new JLabel("", icon, JLabel.CENTER);
        this.front_image = label1;
    }
    
    public void changeToParlatoVersion(){
        isMorelliVersion = false;
        ImageIcon icon = createImageIcon("images/" + this.id % 20 + ".jpg", this.id+"");
        JLabel label1 = new JLabel("", icon, JLabel.CENTER);
        this.front_image = label1;
    }
    
    public JLabel loadImage() {
        ImageIcon icon = createImageIcon("images/" + this.id % 20 + ".jpg", this.id+"");
        JLabel label1 = new JLabel("", icon, JLabel.CENTER);
        return label1;
    }
    
    public JLabel createImageGivenId(String id) {
        ImageIcon icon;
        if (!isMorelliVersion){
            icon = createImageIcon("images/" + this.id % 20 + ".jpg", id);
        }else{
            icon = createImageIcon("imagesMORELLI/" + 10 + ".jpg", id);
        }
        JLabel label1 = new JLabel("", icon, JLabel.CENTER);
        return label1;
    }

    protected ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardBackBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(90, 119));

        cardBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aa/card_back.png"))); // NOI18N
        cardBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardBackBtnActionPerformed
        turnCardUp();
    }//GEN-LAST:event_cardBackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cardBackBtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
