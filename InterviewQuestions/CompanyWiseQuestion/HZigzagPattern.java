public class HZigzagPattern {
	public static void main(String[] args) {
		int n=3;
		int x=11;
		int t=x/n;
		t+=x%n==0?0:1;
		boolean flag=true;
		for(int i=0;i<t;i++) {
			for(int j=1;j<=n;j++) {
				if(i*n+j<=x && flag) {
					System.out.print(i*n+j+" ");
				}
				else if(i*n+n-j+1<=x && flag==false)
					System.out.print(i*n+n-j+1+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
			flag=!flag;
		}
	}
}
