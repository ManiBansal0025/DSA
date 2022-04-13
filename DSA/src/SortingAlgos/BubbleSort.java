package SortingAlgos;

public class BubbleSort {
	public static void main(String args[]) {
		int arr[] = {-2,45,0,11,-9};
		int n = arr.length-1;int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
			if(arr[j] > arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			}
		}
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
