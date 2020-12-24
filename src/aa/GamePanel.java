package aa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matte
 */
public class GamePanel extends javax.swing.JPanel {

    /**
     * Creates new form GamePanel
     */
    JPanel[] phMatrix[]; Card[] cardsMatrix; String[] descriptionsMatrix; static String[] namesMatrix  = {"Ferraguti", "Stefani", "Garbesi", "Artioli", "Longagnani", "Baraldi", "Muratori", "Tancredi", "Di Gabriele", "Della Casa", "Bettini", "Silvestro", "Parlato", "Bertani", "Monica", "Chiarello", "Rossana", "Morelli", "Zanardi", "Bianchi"};
    public GamePanel() {
        initComponents();
        
        this.descriptionsMatrix = createDescriptionMatrix();
        this.phMatrix = createPhMatrix();
        this.cardsMatrix = createCardsMatrix();

        
        
        setBackground(Costants.mainColor);
        fillPh();
        
        

        
    }

    public JPanel[][] createPhMatrix(){
        JPanel[] x[] = new JPanel[5][8];
        x[0][0] = ph00;
        x[0][1] = ph01;
        x[0][2] = ph02;
        x[0][3] = ph03;
        x[0][4] = ph04;
        x[0][5] = ph05;
        x[0][6] = ph06;
        x[0][7] = ph07;
        x[1][0] = ph10;
        x[1][1] = ph11;
        x[1][2] = ph12;
        x[1][3] = ph13;
        x[1][4] = ph14;
        x[1][5] = ph15;
        x[1][6] = ph16;
        x[1][7] = ph17;
        x[2][0] = ph20;
        x[2][1] = ph21;
        x[2][2] = ph22;
        x[2][3] = ph23;
        x[2][4] = ph24;
        x[2][5] = ph25;
        x[2][6] = ph26;
        x[2][7] = ph27;
        x[3][0] = ph30;
        x[3][1] = ph31;
        x[3][2] = ph32;
        x[3][3] = ph33;
        x[3][4] = ph34;
        x[3][5] = ph35;
        x[3][6] = ph36;
        x[3][7] = ph37;
        x[4][0] = ph40;
        x[4][1] = ph41;
        x[4][2] = ph42;
        x[4][3] = ph43;
        x[4][4] = ph44;
        x[4][5] = ph45;
        x[4][6] = ph46;
        x[4][7] = ph47;
        return x;
    }
    
    public Card[] createCardsMatrix(){
        //creo le 20 * 2 carte
        try{
        Card card0 = new Card(0, descriptionsMatrix[0]);
        Card card1 = new Card(1, descriptionsMatrix[1]);
        Card card2 = new Card(2, descriptionsMatrix[2]);
        Card card3 = new Card(3, descriptionsMatrix[3]);
        Card card4 = new Card(4, descriptionsMatrix[4]);
        Card card5 = new Card(5, descriptionsMatrix[5]);
        Card card6 = new Card(6, descriptionsMatrix[6]);
        Card card7 = new Card(7, descriptionsMatrix[7]);
        Card card8 = new Card(8, descriptionsMatrix[8]);
        Card card9 = new Card(9, descriptionsMatrix[9]);
        Card card10 = new Card(10, descriptionsMatrix[10]);
        Card card11 = new Card(11, descriptionsMatrix[11]);
        Card card12 = new Card(12, descriptionsMatrix[12]);
        Card card13 = new Card(13, descriptionsMatrix[13]);
        Card card14 = new Card(14, descriptionsMatrix[14]);
        Card card15 = new Card(15, descriptionsMatrix[15]);
        Card card16 = new Card(16, descriptionsMatrix[16]);
        Card card17 = new Card(17, descriptionsMatrix[17]);
        Card card18 = new Card(18, descriptionsMatrix[18]);
        Card card19 = new Card(19, descriptionsMatrix[19]);
        Card card20 = new Card(20, descriptionsMatrix[0]);
        Card card21 = new Card(21, descriptionsMatrix[1]);
        Card card22 = new Card(22, descriptionsMatrix[2]);
        Card card23 = new Card(23, descriptionsMatrix[3]);
        Card card24 = new Card(24, descriptionsMatrix[4]);
        Card card25 = new Card(25, descriptionsMatrix[5]);
        Card card26 = new Card(26, descriptionsMatrix[6]);
        Card card27 = new Card(27, descriptionsMatrix[7]);
        Card card28 = new Card(28, descriptionsMatrix[8]);
        Card card29 = new Card(29, descriptionsMatrix[9]);
        Card card30 = new Card(30, descriptionsMatrix[10]);
        Card card31 = new Card(31, descriptionsMatrix[11]);
        Card card32 = new Card(32, descriptionsMatrix[12]);
        Card card33 = new Card(33, descriptionsMatrix[13]);
        Card card34 = new Card(34, descriptionsMatrix[14]);
        Card card35 = new Card(35, descriptionsMatrix[15]);
        Card card36 = new Card(36, descriptionsMatrix[16]);
        Card card37 = new Card(37, descriptionsMatrix[17]);
        Card card38 = new Card(38, descriptionsMatrix[18]);
        Card card39 = new Card(39, descriptionsMatrix[19]);
        Card[] x = {card0,card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15,card16,card17,card18,card19,card20,card21,card22,card23,card24,card25,card26,card27,card28,card29,card30,card31,card32,card33,card34,card35,card36,card37,card38,card39};
        return x;
        } catch (IOException ex){    }
        return null;
        
    }
        
    public String[] createDescriptionMatrix(){
        String[] x = {"Se trovi la mia copia rimuoverò un punto a tutti avversari senza aggiurgentene", "Sebbene vi odi, non posso fare molto", "La mia seconda copia si trova in uno dei posti che ti consiglio", "Attento, se non trovi la mia copia  mescolerò tutto il tabellone", 
            "Attento, se non trovi la mia copia Vovescievò tutto il tabellone", "Mi piace tenere i punteggi bassi, dite addio ai vostri punti extra", "Se trovi la mia copia potete dire addio ai vostri punti fatti con Bettini", "Anche se ti sbagli, non preoccuparti, hai una seconda chance", 
            "Se trovi la mia copiati svelo dove si trova una carta a tuo piacimento", "Grazi al potere conferitomi dal Supremo, se trovi la mia copia otterrai il doppio del punteggio", "Questa partita è un po' frivolotta", "Anche questo è in verifica", "C'è caldo, apriamo le finstre",
            "DAI RAGAZZIIIIII", "Questa partita semra eccitante, non credo durerà molto","Siete stanchi ragazzi? Non mollate, la vittoria è vicina", "Spero Rubbiani non stia giocando senno me ne vado", "Voglio corenza e coesione durante tutta la partita", 
            "Sbrigati a vincere suonato", "La madre dei perdenti è sempre incinta!"};
        return x;
    }
    
    public String[] createNamesMatrix(){
        String[] x = {"Ferraguti", "Stefani", "Garbesi", "Artioli", "Longagnani", "Baraldi", "Muratori", "Tancredi", "Di Gabriele", "Della Casa", "Bettini", "Silvestro", "Parlato", "Bertani", "Monica Ferrari", "Chiarello", "Rossana Ferrari", "Morelli", "Zanardi", "Bianchi"};
        return x;
    }
    
    public void fillPh(){
        int counter = 0;
        shuffleCards();
        for (int i=0; i<5; i++){
            for (int j=0; j<8; j++){
                JPanel p = phMatrix[i][j]; 
                Card c =  cardsMatrix[counter];
                c.setPreferredSize(new Dimension(90, 119));
                c.setBounds(0, 0, 90, 119);
                p.add(c);
                counter++;
            }      
        }
    }
    
    public void shuffleCards(){
        shuffleArray(this.cardsMatrix);
    }
    
    public void turnDownAll(){
        for (int i=0; i<40; i++){
            Card c = cardsMatrix[i];
            c.turnCardDown();
        }
    }
    
   static void shuffleArray(Card[] ar)
  {
    // If running on Java 6 or older, use `new Random()` on RHS here
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      Card a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
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

        jPanel6 = new javax.swing.JPanel();
        ph00 = new javax.swing.JPanel();
        ph10 = new javax.swing.JPanel();
        ph20 = new javax.swing.JPanel();
        ph40 = new javax.swing.JPanel();
        ph30 = new javax.swing.JPanel();
        ph11 = new javax.swing.JPanel();
        ph21 = new javax.swing.JPanel();
        ph41 = new javax.swing.JPanel();
        ph31 = new javax.swing.JPanel();
        ph01 = new javax.swing.JPanel();
        ph12 = new javax.swing.JPanel();
        ph22 = new javax.swing.JPanel();
        ph42 = new javax.swing.JPanel();
        ph32 = new javax.swing.JPanel();
        ph02 = new javax.swing.JPanel();
        ph13 = new javax.swing.JPanel();
        ph23 = new javax.swing.JPanel();
        ph43 = new javax.swing.JPanel();
        ph33 = new javax.swing.JPanel();
        ph03 = new javax.swing.JPanel();
        ph14 = new javax.swing.JPanel();
        ph24 = new javax.swing.JPanel();
        ph44 = new javax.swing.JPanel();
        ph34 = new javax.swing.JPanel();
        ph04 = new javax.swing.JPanel();
        ph15 = new javax.swing.JPanel();
        ph25 = new javax.swing.JPanel();
        ph45 = new javax.swing.JPanel();
        ph35 = new javax.swing.JPanel();
        ph05 = new javax.swing.JPanel();
        ph16 = new javax.swing.JPanel();
        ph26 = new javax.swing.JPanel();
        ph46 = new javax.swing.JPanel();
        ph36 = new javax.swing.JPanel();
        ph06 = new javax.swing.JPanel();
        ph17 = new javax.swing.JPanel();
        ph27 = new javax.swing.JPanel();
        ph47 = new javax.swing.JPanel();
        ph37 = new javax.swing.JPanel();
        ph07 = new javax.swing.JPanel();

        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        ph00.setBorder(new javax.swing.border.MatteBorder(null));
        ph00.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph00Layout = new javax.swing.GroupLayout(ph00);
        ph00.setLayout(ph00Layout);
        ph00Layout.setHorizontalGroup(
            ph00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph00Layout.setVerticalGroup(
            ph00Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph10.setBorder(new javax.swing.border.MatteBorder(null));
        ph10.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph10Layout = new javax.swing.GroupLayout(ph10);
        ph10.setLayout(ph10Layout);
        ph10Layout.setHorizontalGroup(
            ph10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph10Layout.setVerticalGroup(
            ph10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph20.setBorder(new javax.swing.border.MatteBorder(null));
        ph20.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph20Layout = new javax.swing.GroupLayout(ph20);
        ph20.setLayout(ph20Layout);
        ph20Layout.setHorizontalGroup(
            ph20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph20Layout.setVerticalGroup(
            ph20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph40.setBorder(new javax.swing.border.MatteBorder(null));
        ph40.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph40Layout = new javax.swing.GroupLayout(ph40);
        ph40.setLayout(ph40Layout);
        ph40Layout.setHorizontalGroup(
            ph40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph40Layout.setVerticalGroup(
            ph40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph30.setBorder(new javax.swing.border.MatteBorder(null));
        ph30.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph30Layout = new javax.swing.GroupLayout(ph30);
        ph30.setLayout(ph30Layout);
        ph30Layout.setHorizontalGroup(
            ph30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph30Layout.setVerticalGroup(
            ph30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph11.setBorder(new javax.swing.border.MatteBorder(null));
        ph11.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph11Layout = new javax.swing.GroupLayout(ph11);
        ph11.setLayout(ph11Layout);
        ph11Layout.setHorizontalGroup(
            ph11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph11Layout.setVerticalGroup(
            ph11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph21.setBorder(new javax.swing.border.MatteBorder(null));
        ph21.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph21Layout = new javax.swing.GroupLayout(ph21);
        ph21.setLayout(ph21Layout);
        ph21Layout.setHorizontalGroup(
            ph21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph21Layout.setVerticalGroup(
            ph21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph41.setBorder(new javax.swing.border.MatteBorder(null));
        ph41.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph41Layout = new javax.swing.GroupLayout(ph41);
        ph41.setLayout(ph41Layout);
        ph41Layout.setHorizontalGroup(
            ph41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph41Layout.setVerticalGroup(
            ph41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph31.setBorder(new javax.swing.border.MatteBorder(null));
        ph31.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph31Layout = new javax.swing.GroupLayout(ph31);
        ph31.setLayout(ph31Layout);
        ph31Layout.setHorizontalGroup(
            ph31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph31Layout.setVerticalGroup(
            ph31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph01.setBorder(new javax.swing.border.MatteBorder(null));
        ph01.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph01Layout = new javax.swing.GroupLayout(ph01);
        ph01.setLayout(ph01Layout);
        ph01Layout.setHorizontalGroup(
            ph01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph01Layout.setVerticalGroup(
            ph01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph12.setBorder(new javax.swing.border.MatteBorder(null));
        ph12.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph12Layout = new javax.swing.GroupLayout(ph12);
        ph12.setLayout(ph12Layout);
        ph12Layout.setHorizontalGroup(
            ph12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph12Layout.setVerticalGroup(
            ph12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph22.setBorder(new javax.swing.border.MatteBorder(null));
        ph22.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph22Layout = new javax.swing.GroupLayout(ph22);
        ph22.setLayout(ph22Layout);
        ph22Layout.setHorizontalGroup(
            ph22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph22Layout.setVerticalGroup(
            ph22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph42.setBorder(new javax.swing.border.MatteBorder(null));
        ph42.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph42Layout = new javax.swing.GroupLayout(ph42);
        ph42.setLayout(ph42Layout);
        ph42Layout.setHorizontalGroup(
            ph42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph42Layout.setVerticalGroup(
            ph42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph32.setBorder(new javax.swing.border.MatteBorder(null));
        ph32.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph32Layout = new javax.swing.GroupLayout(ph32);
        ph32.setLayout(ph32Layout);
        ph32Layout.setHorizontalGroup(
            ph32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph32Layout.setVerticalGroup(
            ph32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph02.setBorder(new javax.swing.border.MatteBorder(null));
        ph02.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph02Layout = new javax.swing.GroupLayout(ph02);
        ph02.setLayout(ph02Layout);
        ph02Layout.setHorizontalGroup(
            ph02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph02Layout.setVerticalGroup(
            ph02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph13.setBorder(new javax.swing.border.MatteBorder(null));
        ph13.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph13Layout = new javax.swing.GroupLayout(ph13);
        ph13.setLayout(ph13Layout);
        ph13Layout.setHorizontalGroup(
            ph13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph13Layout.setVerticalGroup(
            ph13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph23.setBorder(new javax.swing.border.MatteBorder(null));
        ph23.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph23Layout = new javax.swing.GroupLayout(ph23);
        ph23.setLayout(ph23Layout);
        ph23Layout.setHorizontalGroup(
            ph23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph23Layout.setVerticalGroup(
            ph23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph43.setBorder(new javax.swing.border.MatteBorder(null));
        ph43.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph43Layout = new javax.swing.GroupLayout(ph43);
        ph43.setLayout(ph43Layout);
        ph43Layout.setHorizontalGroup(
            ph43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph43Layout.setVerticalGroup(
            ph43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph33.setBorder(new javax.swing.border.MatteBorder(null));
        ph33.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph33Layout = new javax.swing.GroupLayout(ph33);
        ph33.setLayout(ph33Layout);
        ph33Layout.setHorizontalGroup(
            ph33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph33Layout.setVerticalGroup(
            ph33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph03.setBorder(new javax.swing.border.MatteBorder(null));
        ph03.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph03Layout = new javax.swing.GroupLayout(ph03);
        ph03.setLayout(ph03Layout);
        ph03Layout.setHorizontalGroup(
            ph03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph03Layout.setVerticalGroup(
            ph03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph14.setBorder(new javax.swing.border.MatteBorder(null));
        ph14.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph14Layout = new javax.swing.GroupLayout(ph14);
        ph14.setLayout(ph14Layout);
        ph14Layout.setHorizontalGroup(
            ph14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph14Layout.setVerticalGroup(
            ph14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph24.setBorder(new javax.swing.border.MatteBorder(null));
        ph24.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph24Layout = new javax.swing.GroupLayout(ph24);
        ph24.setLayout(ph24Layout);
        ph24Layout.setHorizontalGroup(
            ph24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph24Layout.setVerticalGroup(
            ph24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph44.setBorder(new javax.swing.border.MatteBorder(null));
        ph44.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph44Layout = new javax.swing.GroupLayout(ph44);
        ph44.setLayout(ph44Layout);
        ph44Layout.setHorizontalGroup(
            ph44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph44Layout.setVerticalGroup(
            ph44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph34.setBorder(new javax.swing.border.MatteBorder(null));
        ph34.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph34Layout = new javax.swing.GroupLayout(ph34);
        ph34.setLayout(ph34Layout);
        ph34Layout.setHorizontalGroup(
            ph34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph34Layout.setVerticalGroup(
            ph34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph04.setBorder(new javax.swing.border.MatteBorder(null));
        ph04.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph04Layout = new javax.swing.GroupLayout(ph04);
        ph04.setLayout(ph04Layout);
        ph04Layout.setHorizontalGroup(
            ph04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph04Layout.setVerticalGroup(
            ph04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph15.setBorder(new javax.swing.border.MatteBorder(null));
        ph15.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph15Layout = new javax.swing.GroupLayout(ph15);
        ph15.setLayout(ph15Layout);
        ph15Layout.setHorizontalGroup(
            ph15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph15Layout.setVerticalGroup(
            ph15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph25.setBorder(new javax.swing.border.MatteBorder(null));
        ph25.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph25Layout = new javax.swing.GroupLayout(ph25);
        ph25.setLayout(ph25Layout);
        ph25Layout.setHorizontalGroup(
            ph25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph25Layout.setVerticalGroup(
            ph25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph45.setBorder(new javax.swing.border.MatteBorder(null));
        ph45.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph45Layout = new javax.swing.GroupLayout(ph45);
        ph45.setLayout(ph45Layout);
        ph45Layout.setHorizontalGroup(
            ph45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph45Layout.setVerticalGroup(
            ph45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph35.setBorder(new javax.swing.border.MatteBorder(null));
        ph35.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph35Layout = new javax.swing.GroupLayout(ph35);
        ph35.setLayout(ph35Layout);
        ph35Layout.setHorizontalGroup(
            ph35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph35Layout.setVerticalGroup(
            ph35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph05.setBorder(new javax.swing.border.MatteBorder(null));
        ph05.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph05Layout = new javax.swing.GroupLayout(ph05);
        ph05.setLayout(ph05Layout);
        ph05Layout.setHorizontalGroup(
            ph05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph05Layout.setVerticalGroup(
            ph05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph16.setBorder(new javax.swing.border.MatteBorder(null));
        ph16.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph16Layout = new javax.swing.GroupLayout(ph16);
        ph16.setLayout(ph16Layout);
        ph16Layout.setHorizontalGroup(
            ph16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph16Layout.setVerticalGroup(
            ph16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph26.setBorder(new javax.swing.border.MatteBorder(null));
        ph26.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph26Layout = new javax.swing.GroupLayout(ph26);
        ph26.setLayout(ph26Layout);
        ph26Layout.setHorizontalGroup(
            ph26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph26Layout.setVerticalGroup(
            ph26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph46.setBorder(new javax.swing.border.MatteBorder(null));
        ph46.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph46Layout = new javax.swing.GroupLayout(ph46);
        ph46.setLayout(ph46Layout);
        ph46Layout.setHorizontalGroup(
            ph46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph46Layout.setVerticalGroup(
            ph46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph36.setBorder(new javax.swing.border.MatteBorder(null));
        ph36.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph36Layout = new javax.swing.GroupLayout(ph36);
        ph36.setLayout(ph36Layout);
        ph36Layout.setHorizontalGroup(
            ph36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph36Layout.setVerticalGroup(
            ph36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph06.setBorder(new javax.swing.border.MatteBorder(null));
        ph06.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph06Layout = new javax.swing.GroupLayout(ph06);
        ph06.setLayout(ph06Layout);
        ph06Layout.setHorizontalGroup(
            ph06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph06Layout.setVerticalGroup(
            ph06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph17.setBorder(new javax.swing.border.MatteBorder(null));
        ph17.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph17Layout = new javax.swing.GroupLayout(ph17);
        ph17.setLayout(ph17Layout);
        ph17Layout.setHorizontalGroup(
            ph17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph17Layout.setVerticalGroup(
            ph17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph27.setBorder(new javax.swing.border.MatteBorder(null));
        ph27.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph27Layout = new javax.swing.GroupLayout(ph27);
        ph27.setLayout(ph27Layout);
        ph27Layout.setHorizontalGroup(
            ph27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph27Layout.setVerticalGroup(
            ph27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph47.setBorder(new javax.swing.border.MatteBorder(null));
        ph47.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph47Layout = new javax.swing.GroupLayout(ph47);
        ph47.setLayout(ph47Layout);
        ph47Layout.setHorizontalGroup(
            ph47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph47Layout.setVerticalGroup(
            ph47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph37.setBorder(new javax.swing.border.MatteBorder(null));
        ph37.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph37Layout = new javax.swing.GroupLayout(ph37);
        ph37.setLayout(ph37Layout);
        ph37Layout.setHorizontalGroup(
            ph37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph37Layout.setVerticalGroup(
            ph37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        ph07.setBorder(new javax.swing.border.MatteBorder(null));
        ph07.setPreferredSize(new java.awt.Dimension(90, 119));

        javax.swing.GroupLayout ph07Layout = new javax.swing.GroupLayout(ph07);
        ph07.setLayout(ph07Layout);
        ph07Layout.setHorizontalGroup(
            ph07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );
        ph07Layout.setVerticalGroup(
            ph07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ph17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ph37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ph07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ph06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ph05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ph45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ph04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ph03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ph02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ph42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ph01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ph11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ph21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ph31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ph41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ph00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ph10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ph20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ph30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ph40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel ph00;
    private javax.swing.JPanel ph01;
    private javax.swing.JPanel ph02;
    private javax.swing.JPanel ph03;
    private javax.swing.JPanel ph04;
    private javax.swing.JPanel ph05;
    private javax.swing.JPanel ph06;
    private javax.swing.JPanel ph07;
    private javax.swing.JPanel ph10;
    private javax.swing.JPanel ph11;
    private javax.swing.JPanel ph12;
    private javax.swing.JPanel ph13;
    private javax.swing.JPanel ph14;
    private javax.swing.JPanel ph15;
    private javax.swing.JPanel ph16;
    private javax.swing.JPanel ph17;
    private javax.swing.JPanel ph20;
    private javax.swing.JPanel ph21;
    private javax.swing.JPanel ph22;
    private javax.swing.JPanel ph23;
    private javax.swing.JPanel ph24;
    private javax.swing.JPanel ph25;
    private javax.swing.JPanel ph26;
    private javax.swing.JPanel ph27;
    private javax.swing.JPanel ph30;
    private javax.swing.JPanel ph31;
    private javax.swing.JPanel ph32;
    private javax.swing.JPanel ph33;
    private javax.swing.JPanel ph34;
    private javax.swing.JPanel ph35;
    private javax.swing.JPanel ph36;
    private javax.swing.JPanel ph37;
    private javax.swing.JPanel ph40;
    private javax.swing.JPanel ph41;
    private javax.swing.JPanel ph42;
    private javax.swing.JPanel ph43;
    private javax.swing.JPanel ph44;
    private javax.swing.JPanel ph45;
    private javax.swing.JPanel ph46;
    private javax.swing.JPanel ph47;
    // End of variables declaration//GEN-END:variables
}
