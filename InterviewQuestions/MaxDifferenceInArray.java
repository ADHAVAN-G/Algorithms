public class MaxDifferenceInArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,9,-1,10};
		TreeSet<Integer>t=new TreeSet<Integer>();
		t.add(a[0]);
		int max=0;
		for(int i=1;i<a.length;i++) {
			t.add(a[i]);
			max=Math.max(max,a[i]-t.first());
		}
		System.out.println(max);
	}
}
