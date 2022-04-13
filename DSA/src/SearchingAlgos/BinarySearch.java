package SearchingAlgos;
import java.util.*;
public class BinarySearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. you want to search");
		int ele = sc.nextInt();int found = 0;
		int arr[] = {3,4,5,6,7,8,9};
		int n = arr.length;
		int low = 0;
		int high = n-1;
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == ele) {
				System.out.println(mid);
				found++;
			}
			if(arr[mid]<ele) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		if(found == 0) {
			System.out.println("Element not found");
		}
		sc.close();
	}
}