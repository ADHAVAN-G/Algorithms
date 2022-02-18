public class InsertionSort {
	public static void main(String[] args) {
		int a[]= {23,45,10,98,15,2,55};
		for(int i=0;i<a.length;i++) {
			int t=a[i];
			int j=i-1;
			while(j>=0 && t<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
		}
		for(int i:a)
			System.out.println(i);
	}
}
