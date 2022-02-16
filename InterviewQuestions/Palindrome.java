public class Palindrome {
	static boolean isPalindrome(String s) {
		if(s.length()==0)
			return true;
		s=s.toLowerCase();
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==' ')
				i++;
			if(s.charAt(j)==' ')
				j--;
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String a="Malaya lam";
		System.out.println(isPalindrome(a));
	}
}
