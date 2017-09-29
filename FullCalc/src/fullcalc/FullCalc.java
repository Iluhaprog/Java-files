
package fullcalc;

import java.util.Scanner;
import java.util.UnknownFormatConversionException;

public class FullCalc {

    
    public static void main(String[] args) {
        while(1>0){
            Scanner x = new Scanner(System.in);
            float b = x.nextInt();
            String z = x.next();
            float a = x.nextInt();
            switch(z){
                case "+":
                    System.out.println(a+b);
                case "-":
                    System.out.println(b-a);
                case "*":
                    System.out.println(a*b);
                case "/":
                    float c = b/a;
                    System.out.printf("%.3f%n",c);
                case "^":
                    float i = 1;
                    float k = 0;
                    while (k != a){
                        i = i*b;
                        k++;
                    }
                    System.out.println(i);
            }
        }
        //end programm!
        
    }
    
}
