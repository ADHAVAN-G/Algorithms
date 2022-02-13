public class SortString {
	public static void main(String[] args) {
		String s="headset";
		int num[]=new int[26];
		int i=0;
		while(i<s.length()) {
			num[s.charAt(i)-'a']++;
			i++;
		}
		int j=0;
		i=0;
		while(i<num.length) {
			if(j<=0) {
				j=num[i];
			}
			if(num[i]>0)
			System.out.print((char)(i+'a'));
			j--;
			if(j<=0)
			i++;
		}
	}
}
