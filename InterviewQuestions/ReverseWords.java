public class ReverseWords {
	public static void main(String[] args) {
		String s1="good movie release";
		String[] arr=s1.split("\\s");
		for(String i:arr) {
			StringBuffer temp=new StringBuffer();
			temp.append(i);
			temp.reverse();
			System.out.println(temp);
		}
	}
}
