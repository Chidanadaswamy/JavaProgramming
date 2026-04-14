package TwoDArray;

//WAP to sort entire 2D array
/* 6 7 5
9 4 3
8 1 2    

1 2 3
4 5 6 
7 8 9  */
import java.util.Arrays;

public class Sort2DArray{
	public static int[] bubbleSort(int a[]){
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a.length-1-i; j++){
				if(a[j]>a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;
	}
	public static int[] insertionSort(int a[]){
		for(int i=0; i<a.length; i++){
			int t =a[i];
			int j=i-1;
			while(j>=0&& a[j]>t){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
		}
		return a;
	}
	public static void main(String[] args){
		int a[][] ={{6,7,5},{9,4,3},{8,1,2}};
		int n =a.length,m=a[0].length;
		int newArr[] = new int[n*m],k=0;
	    for(int i=0; i<n; i++){
			for(int j=0; j<a[i].length; j++){
				newArr[k++] = a[i][j];
			}
		}
		//bubbleSort(newArr);
		insertionSort(newArr);
		/* for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i])
		} */
	    k=0;
	  for(int i=0; i<a.length; i++){
		  for(int j=0; j<m; j++){
			  a[i][j] = newArr[k++];
		  }
	  }
		System.out.println(Arrays.toString(newArr));
		for(int i=0; i<n; i++){
			System.out.println(Arrays.toString(a[i]));
		}
	}

}