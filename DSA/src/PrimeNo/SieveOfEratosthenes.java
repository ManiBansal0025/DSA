package PrimeNo;
import java.util.*;
public class SieveOfEratosthenes {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		boolean bool[] = new boolean[n+1];
		for(int i=2;i<=n;i++) {
			bool[i] = true;
		}
		for(int i=2;i<=n/2;i++) {
			if(bool[i] == true) {
				for(int j=2*i;j<=n;j=j+i) {
					bool[j] = false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(bool[i] == true) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
