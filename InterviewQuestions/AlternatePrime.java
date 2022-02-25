import java.util.*;
public class AlternatePrime {
	public static boolean isPrime(int n) {
		for(int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int n=16;
		List<Integer>l=new ArrayList();
		for(int i=2;i<n/2;i++) {
			if(isPrime(i) && isPrime(n-i))
				System.out.println(n-i+" "+i);
		}
	}
}
