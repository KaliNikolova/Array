import java.util.Scanner;

public class Problem1d {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		int a = 0;
		int b = 0;
		int min = array[a];
		int max = array[b];
		for (int i = 0; i < n; i++) {
			if (array[i] < min) {
				min = array[i];
				a = i;
			}
			if (array[i] > max) {
				max = array[i];
				b = i;
			}
		}

		System.out.println(max - min);
	}

}
