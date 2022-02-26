public class FrequencyOfNumber {
	public static void main(String[] args) {
		int a[]= {2,3,4,2,2,1,6,3,7};
		Arrays.sort(a);
		int count=0;
		int k=a[0];
		for(int i=0;i<a.length;i++) {
			if(k!=a[i]) {
				System.out.println(a[i-1]+" "+count);
				count=0;
				k=a[i];
			}
			count++;
		}
		System.out.println(a[a.length-1]+" "+count);
	}
}
