package SortingAlgos;

public class OptimizedBubbleSort {
	public static void main(String args[]) {
		int arr[] = {-2,0,11,89};
		int n = arr.length -1;
		int temp=0;
		for(int i=0;i<n;i++) {
			boolean swap = false;
			for(int j=0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) {
				//System.out.println(i);
				break;
			}
		}
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
