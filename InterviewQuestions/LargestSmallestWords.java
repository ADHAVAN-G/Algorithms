public class LargestSmallestWords {
	public static void main(String[] args) {
		String s="Hardships often prepare ordinary people for an extraordinary destiny";
		String a[]=s.split("\\s");
		String sm=a[0];
		String la=a[0];
		for(int i=1;i<a.length;i++) {
			if(sm.length()>a[i].length())
				sm=a[i];
			if(la.length()<a[i].length())
				la=a[i];
		}
		System.out.println(sm+" "+la);
	}
}
