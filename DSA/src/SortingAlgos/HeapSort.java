package SortingAlgos;

public class HeapSort {
	public static void heapSort(int arr[],int n) {
		for(int i=n/2-1;i>=0;i--) {
			maxHeapify(arr,n,i);
		}
		for(int i=n-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			maxHeapify(arr,i,0);
		}
	}
	public static void maxHeapify(int arr[],int n,int i) {
		int largest = i;
		int left = (2*i)+1;
		int right = (2*i)+2;
		while(left<n && arr[left]>arr[largest]) {
			largest = left;
		}
		while(right<n && arr[right]>arr[largest]) {
			largest = right;
		}
		if(largest != i ) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			maxHeapify(arr,n,largest);
		}
		
	}
	public static void main(String args[]) {
		int arr[] = {15,5,20,1,17,10,30};
		int n = arr.length;
		
		heapSort(arr,n);
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
