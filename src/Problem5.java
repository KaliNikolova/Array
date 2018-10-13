import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		int Max = arr[0];
		int Min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > Max) {
				Max = arr[i];
			}
			if (arr[i] < Min) {
				Min = arr[i];
			}
		}
		int max = arr[0];
		int min = arr[0];
		int a = 0;
		int b = 0;
		int[] array = new int[n];

		for (int i = 0; i < n / 2; i++) {
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] > max) {
					max = arr[k];
					a = k;
				}
			}
			array[i] = max;
			max = Min - 1;
			arr[a] = Min - 1;
			System.out.println(array[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Min - 1) {
				arr[i] = Max + 1;
			}
		}
		for (int i = n / 2; i < arr.length; i++) {
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] < min) {
					min = arr[k];
					b = k;
				}
			}
			array[i] = min;
			min = Max + 1;
			arr[b] = Max + 1;
			System.out.println(array[i]);
		}
	}

}
