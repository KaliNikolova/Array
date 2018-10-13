import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int ravniChisla = -1;
		int broi = 0;
		for (int i = 0; i < arr.length; i++) {
			broi = 0;
			for (int k = i ; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					broi++;
				}
			}
			if (broi > (n + 1) / 2) {
				ravniChisla += 3;
			}
			if (broi == (n + 1) / 2 && n % 2 == 1 && arr[0] != arr[1] && arr[n - 1] != arr[n - 2]) {
				ravniChisla += 3;
			}
		}
		if (ravniChisla <= 0) {
			System.out.println("trion e");
		} else {
			System.out.println("ne e trion");
		}

	}

}
