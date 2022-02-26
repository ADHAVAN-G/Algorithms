public class PostfixToInfix {
	public static void main(String[] args) {
		String s="ab+cf/*";
		Stack<String>a=new Stack();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				a.push(String.valueOf(s.charAt(i)));
			else {
				String temp1=a.pop();
				String temp2=a.pop();
				a.push("("+temp2+s.charAt(i)+temp1+")");
			}
		}
		System.out.println(a.pop());
	}
}
