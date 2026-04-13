package TwoDArray;
import java.util.Arrays;
public class ReverseRowEle {

	public static void reverseRowEle(int a[]) {
		// TODO Auto-generated constructor stub
		int start =0,end=a.length-1;
		while(start<end) {
			int t =a[start];
			a[start] =a[end];
			a[end] =t;
			start++;end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(a));
		for(int i=0; i<a.length; i++) {
			reverseRowEle(a[i]);
		}
		System.out.println(Arrays.deepToString(a));
	}

}
