package demo;
import java.util.Arrays;
import java.util.Scanner;
public class SwapTwoRows {

	public static void swapTwoRows(int a[][],int r1,int r2) {
		if(r1>=0 && r1<a.length && r2>=0 && r2<a.length) {
			for(int i=0; i<a[0].length; i++) {
				int t = a[r1][i];
				a[r1][i]=a[r2][i];
				a[r2][i]=t;
			}
		}
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter r1");
		int r1 = s.nextInt();
		System.out.println("Enter r2");
		int r2 = s.nextInt();
		System.out.println(Arrays.deepToString(a));
		swapTwoRows(a,r1,r2);
		System.out.println(Arrays.deepToString(a));
	}

}
