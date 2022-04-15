package MiscellaneousAlgos;

public class ExtendedEuclideanAlgo {
	public static int eucliAlgo(int a,int b,int x,int y) {
		if(a == 0) {
			x = 0;
		    y = 1;
		    return b;
		}
		int x1=1,y1=1;
		int d = eucliAlgo(b%a,a,x1,y1);
		x = y1 - (b/a)*x1;
		y = x1;
		System.out.println(x+" "+y);
		return d;
		
		
	}
	public static void main(String args[]) {
		int a = 35;
		int b = 15;
		int x=1;int y=1;
		int res = eucliAlgo(a,b,x,y);
		System.out.println(res);
		
	}

}
