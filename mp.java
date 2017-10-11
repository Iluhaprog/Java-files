package MP;



public class mp {
	
	public static void main(String[] args) {
		int[] x = {505,22,1050,10,-33,5};
		
		for (int i = 0; i<x.length;i++) {
			//begin
			for(int b=0;b<5;b++) {
				if(x[b]>x[b+1]) {
					int a = x[b+1];
					x[b+1] = x[b];
					x[b] = a;
				}
			}
			//end
		}
		for (int t = 0;t<x.length;t++) {
			System.out.print(x[t]+";\t");
		}
	}
	
}
