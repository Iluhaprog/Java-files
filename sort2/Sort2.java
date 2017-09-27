/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort2;

/**
 *
 * @author Илья
 */
public class Sort2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Нужно исправить!!!!
        int[] i = {5,4,6,7,10,8,9,3,1,2};
        
        for (int r=0; r<i.length;r++){
            for(int g = r;(r >= 1) && (i[r] < i[r-1]);g--){
                int s = i[r-1];
                i[r-1] = i[r];
                i[r] = s;
            }
        }
        for (int l = 0;l<i.length;l++ ){
           System.out.println(i[l]+";");
        }
        
    }
    
}
