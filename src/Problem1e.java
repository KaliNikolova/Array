import java.util.Scanner;
public class Problem1e {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		int iMax = 0;
		int max = array[iMax];
		int min = array[iMax];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				iMax = i;
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		array[iMax]=min;
		max=min;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
