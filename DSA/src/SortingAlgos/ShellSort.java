package SortingAlgos;

public class ShellSort {
	public static void shellSortFunc(int arr[],int n) {
		for(int gap = n/2;gap>=1;gap=gap/2) {
			for(int j=gap;j<n;j++) {
				for(int i=j-gap;i>=0;i=i-gap) {
					if(arr[i]<arr[i+gap]) {
						break;
					}
					else {
						int temp = arr[i];
						arr[i] = arr[i+gap];
						arr[i+gap] = temp;
					}
				}
			}
		}
	}
	public static void main(String args[]) {
		int arr[] = {23,29,15,19,31,7,9,5,2};
		int n = arr.length;
		shellSortFunc(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
