package MiscellaneousAlgos;
import java.util.*;
public class PascalsTriangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=1;k<n-i;k++) {
				System.out.print(" ");
			}
			int number = 1;
			for(int j=0;j<=i;j++) {
				System.out.print(number+" ");
				number = number * (i-j)/(j+1);
			}
			System.out.println();
		}
		sc.close();
	}

}
