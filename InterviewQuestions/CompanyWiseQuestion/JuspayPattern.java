public class JuspayPattern {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int k=n-i-1;k>0;k--)
				System.out.print(" ");
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print(" ");
			for(int l=0;l<=i;l++)
				System.out.print(l+i+1);
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=n-i;k>0;k--)
				System.out.print(k);
			System.out.print(" ");
			for(int l=i*2+1;l<n*2;l+=2)
				System.out.print(l);
			System.out.println();
		}
	}
}
