public class StringNumberOperator {
	public static void main(String[] args) {
		String s="374291--*+-";
		int i=0,j=s.length()-1;
		int mid=0;
		while(i<=j) {
			mid=(i+j)/2;
			if(s.charAt(mid)<'0' && s.charAt(mid)>'9')
				break;
			else if(s.charAt(mid)>='0' && s.charAt(mid)<='9')
				i++;
			else
				j--;
		}
		int result=s.charAt(0)-'0';
		for(int k=1;k<mid;k++) {
			if(s.charAt(mid+k-1)=='+') {
				result+=s.charAt(k)-'0';
			}
			else if(s.charAt(mid+k-1)=='-') {
				result-=s.charAt(k)-'0';
			}
			else if(s.charAt(mid+k-1)=='*') {
				result*=s.charAt(k)-'0';
			}
			else {
				result/=s.charAt(k)-'0';
			}
		}
		System.out.println(result);
	}
}
