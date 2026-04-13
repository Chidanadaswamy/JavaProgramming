package TwoDArray;

import java.util.Arrays;

public class ZigZagTraversal {
	public static int[] zigZagTraversal(int a[][]){
		int newArray[] = new int[a.length*a[0].length];
		int k=0;
		for(int i=0; i<a.length; i++){
			if(i%2==0){
				for(int j=0; j<a[0].length; j++)
			  newArray[k++] = a[i][j];	
			}
			else{
			for(int j=a[0].length-1; j>=0; j--)
			  newArray[k++] = a[i][j];		
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(Arrays.toString(zigZagTraversal(a)));
		
	}
}


