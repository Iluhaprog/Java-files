/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funct;

/**
 *
 * @author Илья
 */
public class Funct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hello(5 ,2);
        
    }
    
    static void hello(int ch, int s){
        int  l = 1;
        int t = 0;
        while (t != s){
            l=l*ch;
            t++;
        }
        System.out.println(l);
    }
    
}
