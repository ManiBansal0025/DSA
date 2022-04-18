package MiscellaneousAlgos;

public class MajorityVotingAlgo {
	public static void main(String args[]) {
		int arr[] = {2,3,1,2,2,4};
		int count = 0,ele=0;
		for(int i=0;i<arr.length;i++) {
			if(count == 0) {
				ele = arr[i];
			}
			if(ele == arr[i])
				count++;
			else
				count--;
		}
		System.out.println(ele);
	}
	
	
}
