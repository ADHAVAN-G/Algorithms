public class PendulumSort {
	public static void main(String[] args) {
		int a[]= {1,32,67,89,20,18};
		Arrays.sort(a);
		int b[]=new int[a.length];
		int mid=(a.length-1)/2;
		b[mid]=a[0];
		for(int i=1;i<a.length;i++) {
			if(i%2==0) {
				mid=mid-i;
				b[mid]=a[i];
			}
			else {
				mid+=i;
				b[mid]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
