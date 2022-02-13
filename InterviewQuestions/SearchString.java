public class SearchString {
	public static void main(String[] args) {
		String s1="goodmovierelease";
		String s2="movie";
    boolean flag=false;
		for(int i=0;i<=s1.length()-s2.length();i++) {
			if(s2.equals(s1.substring(i,s2.length()+i))){
				System.out.println("yes");
        flag=true;
      }
		}
    if(flag==false)
      System.out.println("no");
	}
}
