package SortingAlgos;

public class SelectionSort {
	public static void main(String args[]) {
		int arr[] = {20,78,12,19,15,2};
		int n = arr.length -1;
		int temp=0;int min = 0;
		for(int i=0;i<n;i++) {
			min = i;
			for(int j=i+1;j<=n;j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
