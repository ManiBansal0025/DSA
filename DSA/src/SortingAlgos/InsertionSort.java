package SortingAlgos;

public class InsertionSort {
	public static void main(String args[]) {
	int arr[] = {9,5,1,4,3,2};
	int n = arr.length -1;
	int key = 0;
	for(int i=1;i<=n;i++) {
		key = arr[i]; int j=i-1;
		while(j>=0 && arr[j]>key) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
	}
	for(int i=0;i<=n;i++) {
		System.out.print(arr[i]+" ");
	}
	
	}
}
