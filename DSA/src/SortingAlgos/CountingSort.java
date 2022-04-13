package SortingAlgos;

public class CountingSort {
	public static void main(String args[]) {
		int arr[] = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
		int n = arr.length-1;
		int key = arr[0];
		for(int i=1;i<=n;i++) {
			if(arr[i]>key) {
				key = arr[i];
			}
		}
		//System.out.println(key);
		int count[] = new int[key+1];
		for(int i=0;i<=n;i++) {
			++count[arr[i]];
		}
		for(int i=1;i<=key;i++) {
			count[i] = count[i]+count[i-1];
		}
		for(int i=0;i<=key;i++) {
			System.out.print(count[i]+" ");
		}
		System.out.println();
		int b[] = new int[n+1];
		for(int i=n;i>=0;i--) {
			int p = count[arr[i]]-1;
			b[p] = arr[i];
			count[arr[i]]--;
		}
		for(int i=0;i<=n;i++) {
			arr[i] = b[i];
		}
		for(int i=0;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
