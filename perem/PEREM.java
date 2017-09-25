/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perem;

/**
 *
 * @author Илья
 */
import java.util.Scanner;

public class PEREM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        System.out.println("Выеди число");
        int i = x.nextInt();
        System.out.println("Выеди степень числа");
        int s = x.nextInt();
        int t = 0;
        int a = 1;
        while (t != s){
            a = a*i;
            t++;
        }
        System.out.println(a);
        
    }
    
}
