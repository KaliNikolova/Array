import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] N = new int[n];
		for (int i = 0; i < N.length; i++) {
			N[i] = input.nextInt();
		}
		System.out.print("Vtori masiv: ");
		int k = input.nextInt();
		int[] K = new int[k];
		for (int i = 0; i < K.length; i++) {
			K[i] = input.nextInt();
		}
		int minK = K[0];
		for (int i = 0; i < K.length; i++) {
			if (K[0] < minK) {
				minK = K[0];
			}
		}
		int broi = 0;
		for (int i = 0; i < K.length; i++) {
			for (int t = 0; t < N.length; t++) {
				if (K[i] == N[t]) {
					broi++;
					N[t] = minK - 1;
					break;
				}
			}
		}
		if (broi == k) {
			System.out.print("da");
		} else {
			System.out.print("ne");
		}
	}
}