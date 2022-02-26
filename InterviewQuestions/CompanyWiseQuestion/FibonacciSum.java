public class FibonacciSum {
	public static void main(String[] args) {
		int n=64;
		while(n>0) {
			int f1=0,f2=1,f3=1;
			while(f3<=n) {
				f1=f2;
				f2=f3;
				f3=f1+f2;
			}
			System.out.println(f2+" ");
			n=n-f2;
		}
	}
}
