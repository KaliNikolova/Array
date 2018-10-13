import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("Prez ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				if (i < 4) {
					System.out.print(i + 9 + " ");
				} else {
					System.out.print(i - 3 + " ");
				}
			}
		}
		System.out.println(" mesec ste se predstavili nai slabo");
		System.out.print("Prez ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				if (i < 4) {
					System.out.print(i + 9 + " ");
				} else {
					System.out.print(i - 3 + " ");
				}
			}
		}
		System.out.println(" mesec ste se predstavili nai silno");
	}

}
