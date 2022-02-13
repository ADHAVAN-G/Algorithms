public class Permutation {
	static List<String>str=new ArrayList<String>();
	public static void permutate(String s,String answer) {
		if(s.length()==0)
		{
			str.add(answer);
			return;
		}
		for(int i=0;i<s.length();i++) {
			char temp=s.charAt(i);
			permutate(s.substring(0,i)+s.substring(i+1),answer+temp);
		}
	}
	public static void main(String[] args) {
		String s="easy";
		permutate(s,"");
		System.out.println(str);
	}
}
