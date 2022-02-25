public class PerfectCube {
	public static boolean isPerfectCube(int n) {
		int i=1;
		int j=n;
		while(i<=j) {
			int temp=(i+j)/2;
			if(temp*temp*temp==n)
				return true;
			else if(temp*temp*temp>n)
				j=temp-1;
			else
				i=temp+1;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPerfectCube(16));
	}
}
