package SortingAlgos;

public class MergeSort {
	public static void MergeSortFunc(int arr[],int lb,int ub){
		int mid = 0;
		if(lb<ub) {
			mid = (lb+ub)/2;
			MergeSortFunc(arr,lb,mid);
			MergeSortFunc(arr,mid+1,ub);
			Merge(arr,lb,mid,ub);
		}
	}
	public static void Merge(int arr[],int lb,int mid,int ub) {
		int i=lb,k=lb,j=mid+1;int n = arr.length;
		int b[] = new int[n];
		while(i<=mid && j<=ub) {
			if(arr[i] <= arr[j]) {
				b[k] = arr[i];
				i++;
			}
			else {
				b[k] = arr[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=ub) {
				b[k] = arr[j];
				k++;j++;
			}
		}
		else {
			while(i<=mid) {
				b[k] = arr[i];
				k++;i++;
			}
		}
		for(int p=lb;p<=ub;p++) {
			arr[p] = b[p];
		}
	}
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String args[]) {
		int arr[] = {9,5,1,4,3,2};
		int lb = 0;
		int ub = arr.length-1;
		MergeSortFunc(arr,lb,ub);
		System.out.println("Sorted Array: ");
		printArray(arr);
	}

}
