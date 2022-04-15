package MiscellaneousAlgos;

public class MatrixMultiplicationNaiveMethod {
	public static void MatrixMul(int a[][],int b[][],int c[][]) {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				c[i][j] = 0;
				for(int k=0;k<2;k++) {
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int a[][] = {{2,4},{3,5}};
		int b[][] = {{4,5},{3,6}};
		int c[][] = new int[2][2];
		MatrixMul(a,b,c);
		
	}

}
