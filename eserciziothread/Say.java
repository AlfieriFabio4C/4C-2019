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
public class Say extends Thread{
    private String a;
    public Say(String a) {
        this.a = a;
    }
    
    
    @Override
    public void run(){
            System.out.println(a);
        
    }
    
}
