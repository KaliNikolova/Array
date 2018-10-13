import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": ");
			arr[i] = input.nextInt();
		}
		input.close();

		boolean isTrion = true;
		int broi = 0;
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			broi = 1;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					broi++;
				}
			}
			if (broi > (n + 1) / 2 || (broi == (n + 1) / 2 && n % 2 == 1 && min != arr[i] && max != arr[i])) {
				isTrion = false;
				break;
			}
		}
		System.out.println((isTrion ? "" : "ne ") + "e trion");
	}

}
