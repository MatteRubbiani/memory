/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa;

import javax.swing.JPanel;

/**
 *
 * @author giova
 */
public class SuperPower {
    private int ID;
    public SuperPower(int ID){
        this.ID = ID;
    }
    public void SuperPowerEffect(SuperPower sp){
        switch(ID){
            case 0:
                //FERRAGUTI
                //TODO : suddivisione in turni, applicazione dell'effetto agli avversari
                Game.mp.setPointLabel(-1);
            case 2:
                //GARBESI
                //TODO : inserire azione Garbesi ( Consiglio 3 carte )
            case 3:
                //ARTIOLI
                //TODO : verificare se NON si è trovata la coppia esatta
                Game.gp.shuffleCards();
            case 4:
                //LONGAGNANI
                Game.gp.createLONGAPhMatrix();
            case 5:
                //BARALDI
                //TODO : suddivisione in turni, individuazione del giocatore con meno punti, applicazione dell'effetto a tutti i giocatori
                Game.mp.setPointLabel(-1*Game.mp.getPointLabel());
            case 6:
                int pointsBettini = 0;
                //TODO: individuazionedei punti fatti con Bettini, applicazione dell'effetto a tutti i giocatori
                Game.mp.setPointLabel(-1*pointsBettini);
            case 7:
                //TANCREDI
                Game.numeroMosse += -1;
                //NON SO SE FUNZIONA SOLTANTO CON QUESTO
            case 8:
                //DI GABRIELE
                //TODO : metodo searchByName che ritorni una carta o le sue coordinate
            case 9:
                //DELLA CASA
                Game.mp.setPointLabel(2);
            default:
                break;
        }
    }
}
