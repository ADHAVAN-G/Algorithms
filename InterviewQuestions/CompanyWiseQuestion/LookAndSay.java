public class LookAndSay {
	static List<String>a=new ArrayList();
	public static void look_and_say(int n) {
		if(n==1) {
			a.add("1");
			return ;
		}
		look_and_say(n-1);
		String temp=a.get(a.size()-1);
		String ans="";
		char t=temp.charAt(0);
		int count=0;
		for(int i=0;i<temp.length();i++) {
			if(temp.charAt(i)==t)
				count++;
			else {
				ans+=count+""+t;
				count=0;
				t=temp.charAt(i);
				i--;
			}
		}
		ans+=count+""+t;
		a.add(ans);
	}
	public static void main(String[] args) {
		int n=5;
		look_and_say(n);
		System.out.println(a.toString());
	}
}
