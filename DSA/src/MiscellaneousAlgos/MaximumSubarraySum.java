package MiscellaneousAlgos;
//Kadane's Algorithm
public class MaximumSubarraySum {
	public static void main(String args[]) {
		int arr[] = {-2,-3,4,-1,-1,5,-3};
		int cursum=0,maxsum=0;
		for(int i=0;i<arr.length;i++) {
			cursum = cursum + arr[i];
			if(cursum>maxsum) {
				maxsum = cursum;
			}
			if(cursum < 0) {
				cursum = 0;
			}
		}
		System.out.println(maxsum);
	}

}
