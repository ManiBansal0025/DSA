package SortingAlgos;

public class RadixSort {
	public static void CountSort(int arr[],int n,int pass,int max){
		int count[] = new int[10];
		for(int i=0;i<n;i++) {
			++count[(arr[i]/pass)%10];
		}
		for(int i=1;i<10;i++) {
			count[i] = count[i]+count[i-1];
		}
		int outputArr[] = new int[n];
		for(int i=n-1;i>=0;i--) {
			int d = count[(arr[i]/pass)%10]-1;
			outputArr[d] = arr[i];
			count[(arr[i]/pass)%10]--;
		}
		for(int i=0;i<n;i++) {
			arr[i] = outputArr[i];
		}
	}

	public static void radixSort(int arr[],int n) {
		int max=arr[0];
		int pass=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(pass=1;max/pass > 0;pass = pass*10) {
			  CountSort(arr,n,pass,max);
		}
		
	}
	public static void main(String args[]) {
		int arr[] = {432,8,530,90,88,231,11,45,677,199,400};
		int n = arr.length;
		radixSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
