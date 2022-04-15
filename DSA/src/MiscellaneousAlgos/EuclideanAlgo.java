package MiscellaneousAlgos;

public class EuclideanAlgo {
	public static int eucliAlgo(int a,int b) {
		if(a == 0) {
			return b;
		}
		return eucliAlgo(b%a,a);
	}
	public static void main(String args[]) {
		int a = 60;
		int b = 36;
		int res = eucliAlgo(a,b);
		System.out.println(res);
		
	}

}
