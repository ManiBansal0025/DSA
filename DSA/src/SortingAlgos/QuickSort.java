package SortingAlgos;

public class QuickSort {
	public static void QuickSortFunc(int arr[],int lb,int ub) {
		if(lb<ub) {
			int pivotindx = partition(arr,lb,ub);
			QuickSortFunc(arr,lb,pivotindx-1);
			QuickSortFunc(arr,pivotindx+1,ub);
		}
	}
	public static int partition(int arr[],int lb,int ub) {
		int i = lb-1;int pivot = arr[ub];
		for(int j=lb;j<ub;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[ub] = temp;
		return i;
	}
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String args[]) {
		int arr[] = {6,3,9,5,2,8};
		int lb = 0;
		int ub = arr.length-1;
		QuickSortFunc(arr,lb,ub);
		System.out.println("Sorted Array: ");
		printArray(arr);
	}

}
