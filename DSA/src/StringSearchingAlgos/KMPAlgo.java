package StringSearchingAlgos;

public class KMPAlgo {
	public static void LPS(String pat,int m,int lps[]) {
		lps[0] = 0;int i=1;int len=0;
		while(i<m) {
			if(pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else {
				if(len != 0) {
					len = lps[len-1];
				}
				else {
					lps[i] = len;
					i++;
				}
			}
		}
		
	}
	public static void KMPAlgorithm(String str,String pat) {
		int n = str.length();
		int m = pat.length();int j=0;
		int lps[] = new int[m];
		LPS(pat,m,lps);int i=0;
		while(i<n) {
			if(str.charAt(i) == pat.charAt(j)) {
				i++;j++;
			}
			if(j == m) {
				System.out.println("Pattern at index "+ (i-j));
				j = lps[j-1];
			}
			if(i<n && str.charAt(i) != pat.charAt(j)) {
				if(j != 0) {
					j=lps[j-1];
				}
				else {
					i=i+1;
				}
			}
		}
	}
	public static void main(String args[]) {
		String str = "abcdabcabcabcdabcabcdabc";
		String pat = "abcdabc";
		KMPAlgorithm(str,pat);
		System.out.println();
	}

}
