import java.util.Scanner;

public class Problem1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		int [] array = new int[n];
		for( int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		int sum=0;
		for(int e:array) {
			sum+=e;
		}
		double average = (double)sum/(double)n;
		int nearest=0;
		double minD=Math.abs(array[nearest]-average);
		for(int k=1; k<array.length; k++) {
			if(Math.abs(array[k]-average)<minD) {
				minD=Math.abs(array[k]-average);
				nearest=k;
			}
		}
		System.out.println(array[nearest]);
	}

}
