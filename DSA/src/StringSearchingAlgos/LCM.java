package StringSearchingAlgos;

public class LCM {
	public static String LCMAlgo(String str1,String str2) {
		String x = str1,y=str2;
		while(x.length() != y.length()) {
			if(x.length()<y.length()) {
				x = x + str1;
			}
			else {
				y = y+str2;
			}
		}
		if(x.equals(y))
			return x;
	return "NO LCM";
			
	}
	public static void main(String args[]) {
		String str1 = "aba";
		String str2 = "ab";
		String res = LCMAlgo(str1,str2);
		System.out.print(res);
	}
}
