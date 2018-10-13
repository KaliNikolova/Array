import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Vyvedete goleminata na pyrviq masiv: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] N = new int[n];
		for (int i = 0; i < N.length; i++) {
			N[i] = input.nextInt();
		}
		System.out.print("Vyvedete goleminata na vtoriq masiv: ");
		int m = input.nextInt();
		int[] M = new int[m];
		for (int i = 0; i < M.length; i++) {
			M[i] = input.nextInt();
		}
		int[] arr = new int[m+n];
		if(m>=n) {
			for(int i=0;i<n;i++) {
				arr[i*2]=N[i];
				arr[i*2+1]=M[i];
			}
			for(int k =2*n; k<arr.length;k++) {
				arr[k]=M[k-n];
			}
		}else {
			for(int i=0;i<m;i++) {
				arr[i*2]=N[i];
				arr[i*2+1]=M[i];
			}
			for(int k =2*m; k<arr.length;k++) {
				arr[k]=N[k-m];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
