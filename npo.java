package npone;

import java.util.Scanner;
import java.util.Arrays;


@SuppressWarnings("unused")

public class npo {
	
	
	
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		String pass = sc.nextLine();		
		String[] mat = {pass,"fuck","bich","shitass","asshole"};
		int g = pass.length();
		String[] zw = new String[g];
		boolean tf;
		
		for(int i = 1;i<mat.length;i++) {
			tf = mat[0].equals(mat[i]);
			
			if(tf == true) {
				for(int l = 0;(l<g);l++)  {
					zw[l] = "*";
					System.out.print(zw[l]);
				}	
				break;
			}
			if(tf != true && i == mat.length - 1) {
				System.out.println(pass);
				break;
			}
			
		}
		
		
		
		
	}
	
}
