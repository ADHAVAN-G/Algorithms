public class AlternateSorting {
	public static int[] reverse(int[]a,int i) {
		int k=1;
		for(int j=i;j<(a.length+i)/2;j++,k++) {
			int temp=a[a.length-k];
			a[a.length-k]=a[j];
			a[j]=temp;
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]= {5,7,3,1,4,6,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=1;i<a.length;i++) {
			a=reverse(a,i);
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]);
	}
}
