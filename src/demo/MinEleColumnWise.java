package demo;
import java.util.Arrays;
public class MinEleColumnWise {

//	public  static int minEleColumnWise(int a[]) {
//		// TODO Auto-generated constructor stub
//		int max =Integer.MIN_VALUE;
//		for(int i=0; i<a.length; i++) {
//			if(a[i]>max)
//				max =a[i];
//		}
//		return max;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,13},{4,-34,6},{7,8,-9}};//1 2 3
		for(int i=0; i<a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
			//System.out.println((i+1)+" row max element "+minEleColumnWise(a[i]));
		}    
		for(int i=0; i<a.length; i++){
			int min=Integer.MAX_VALUE;
			for(int j=0; j<a[i].length; j++) {
				if(a[j][i]<min) {
					min = a[j][i];
				}
			}
			System.out.println((i+1)+" column max element "+min);
		}//4 5 6
			                                    //7 8 9 
	}

}//
