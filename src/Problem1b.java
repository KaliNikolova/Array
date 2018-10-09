import java.util.Scanner;

public class Problem1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		int [] array = new int[n];
		for( int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		int sum=0;
		int l=0;
		for(int i=0 ; i<n; i+=2) {
			sum+=array[i];
			l++;
		}
		double average = (double)sum/(double)l;
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
