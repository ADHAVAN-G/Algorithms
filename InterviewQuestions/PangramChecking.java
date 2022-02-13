public class PangramChecking {
	public static void main(String[] args) {
		String s="The quick brown fox jumps over lazy the dog";
		int num[]=new int[26];
		for(int i=0;i<s.length();i++) {
			if((Character.toLowerCase(s.charAt(i))>='a' && Character.toLowerCase(s.charAt(i))<='z')) {
				num[Character.toLowerCase(s.charAt(i))-'a']++;
			}
		}
		boolean flag=true;
		for(int i=0;i<num.length;i++) {
			if(num[i]==0) {
				System.out.println("string is not pangram");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("string is pangram");
	}
}
