package SearchingAlgos;
import java.util.*;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. you want to search");
		int ele = sc.nextInt();int found = 0;
		int arr[] = {1,5,4,3,6,9};
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i] == ele) {
				System.out.println(ele + " is found in array at index "+ i);
				found = 1;
				break;
			}
		}
		if(found == 0) {
			System.out.println("Element Not Found");
		}
		sc.close();
	}

}
