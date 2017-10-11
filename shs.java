package ShS;

public class shs {
	public static void main(String[] args) {
		int[] arr = {2,7,3,9,5,10,8};
		int left = 1;
		int right = arr.length;
		
		while(left<right){
			for (int i = left;i<right;i++) {
				if(arr[i-1]>arr[i]) {
					int b = arr[i];
					arr[i] = arr[i - 1];
					arr[i-1] = b;
				}
			}
			right--;
			
			for(int i = right;i>left;i--) {
				if(arr[i]<arr[i-1]) {
					int b = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = b;
				}
			}
			left++;
		}
		
		for (int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+";\t");
		}
	}
}
