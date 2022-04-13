//Wrong Answer
package PrimeNo;
import java.util.*;
public class FermatPrimalityTest {
	public static boolean fermatPrimality(int n,int k) {
		if(n == 1 || n==0) {
			return false;
		}
		if(n == 2)
			return true;
		if(n%2 == 0)
			return false;
		for(int i=0;i<k;i++) {
			int r = Math.abs((int)Math.random());
			int a = r % (n-1) + 1;
			if(Math.pow(a, n-1) != 1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		int k=3;
		boolean bool = fermatPrimality(n,k);
		if(bool == true) {
			System.out.println("No. is Prime");
		}
		else {
			System.out.println("No. is not Prime");
		}
		sc.close();
		
	}
}
