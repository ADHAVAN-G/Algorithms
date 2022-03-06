public class FormGreatestNumber {
	public static void main(String[] args) {
		String[] a={"1","3","50","23","9"};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				String one=a[i]+a[j];
				String two=a[j]+a[i];
				if(one.compareTo(two)<two.compareTo(one)) {
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
