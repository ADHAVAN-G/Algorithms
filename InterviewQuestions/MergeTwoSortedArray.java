public class MergeTwoSoretdArray {
	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		int b[]= {3,6,7};
		int c[]=new int[a.length+b.length];
		int i=0;
		int j=0;
		while((i+j)<c.length) {
			if(i<a.length && a[i]<=b[j]) {
				c[i+j]=a[i];
				i++;
			}
			else {
				c[i+j]=b[j];
				j++;
			}
		}
	}
}
