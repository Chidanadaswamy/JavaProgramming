package TwoDArray;

public class AverageOfPrimeNum {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return true;
		}
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) 
				return false;
		}
		return true;
	}

	public static int averageOfPrimeNum(int a[][]) {
		// TODO Auto-generated constructor stub
		int sum =0,c=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(isPrime(a[i][j])){
					c++;
					sum+=a[i][j];
				}
			}
		}
		return sum/c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int res = averageOfPrimeNum(a);
		System.out.println(res);//1 2 3 5 7 
		//System.out.println(18/5);
	}

}
