public class Minimumjump {
	public static void main(String[] args) {
		int a[]= {1,0,5,8,9,2,6,7,6,8,9};
		int limit=a[0];
		int step=1;
		int distance=a[0];
		for(int i=1;i<a.length;i++) {
			distance=Math.max(distance,i+a[i]);
			limit--;
			if(limit==0) {
				if(i>=distance)System.out.println(-1);
				limit=distance-i;
				step++;
			}
			
		}
		System.out.println(step);
	}
}
