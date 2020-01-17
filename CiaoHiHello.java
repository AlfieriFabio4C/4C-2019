/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CiaoHiHello;

/**
 *
 * @author fabio.alfieri
 */
public class CiaoHiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        Say a = new Say("Hi");
        Say b = new Say("Ciao");
        Say c = new Say("Hello");
        a.start();
        b.start();
        c.start();
    }

}
