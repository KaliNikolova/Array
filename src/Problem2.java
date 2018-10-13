import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int sum=arr[0]+arr[1];
		for(int i=0; i<arr.length;i++) {
			for(int k=0; k<arr.length;k++) {
				if(k!=i) {
					if(arr[k]+arr[i]<sum) {
						sum=arr[i]+arr[k];
					}
				}
			}
		}
		System.out.println(sum);
	}

}
