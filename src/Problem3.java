import java.util.Scanner;

public class Problem3 {

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
		for (int i = 0; i < N.length; i++) {
			for (int k = 0; k < M.length; k++) {
				if (N[i] == M[k]) {
					System.out.println(N[i]);
				}
			}
		}
	}

}
