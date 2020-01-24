/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziothread;

/**
 *
 * @author fabio.alfieri
 */
public class EsercizioThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Say a = new Say("Ciao");
        Say b = new Say("Hello");
        Say c = new Say("Hi");
        a.start();
        b.start();
        c.start();
    }

}
