package MP;

import java.util.Scanner;


@SuppressWarnings("unused")
public class mp {
	
	public static void main(String[] args) {
		int[] x = {1,7,4,8,3,2};
			
		
		for (int i = 1; i<x.length;i++) {
			//begin
			for(int b=i;(b>=1)&&(x[b]<x[b-1]);b--) {
					int a = x[b];
					x[b] = x[b-1];
					x[b-1] = a;
			}
			//end
		}
		for (int t = 0;t<x.length;t++) {
			System.out.print(x[t]+";\t");
		}
		
		
	}
	
}
