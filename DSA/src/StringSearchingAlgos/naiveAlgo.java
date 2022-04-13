package StringSearchingAlgos;

public class naiveAlgo {
public static void naiveAlgorithm(String txt,String pat) {
		int txtlen = txt.length();
		int patlen = pat.length();
		for(int i=0;i<txtlen-patlen;i++) {
			int j=0;
			for(j=0;j<patlen;j++) {
				if(txt.charAt(i+j) != pat.charAt(j)) {
					break;
				}
			}
			if(j==patlen) {
				System.out.println("Pattern found at index "+i);
			}
			
		}
	}
	public static void main(String args[]) {
		String txt = "ABABAABAABABABAB";
		String pat = "ABAB";
		naiveAlgorithm(txt,pat);
		
	}

}
