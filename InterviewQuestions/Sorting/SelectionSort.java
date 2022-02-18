public class SelectionSort {
	public static void main(String[] args) {
		int a[]= {23,45,10,98,15,2,55};
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i;j<a.length;j++) {
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int i:a)
			System.out.println(i);
	}
}
