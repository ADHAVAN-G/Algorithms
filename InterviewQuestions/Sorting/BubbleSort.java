public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {23,45,10,98,15,2,55};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i:a)
			System.out.println(i);
	}
}
