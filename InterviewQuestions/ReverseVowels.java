public class ReverseVowels {
	public static void main(String[] args) {
		String s="geographic";
		char[]t=s.toCharArray();
		int i=0,j=s.length()-1;
	   
		while(i<j) {
			boolean b1=t[i]=='a'||t[i]=='e'||t[i]=='i'||t[i]=='o'||t[i]=='u'||t[i]=='A'||t[i]=='E'||t[i]=='I'||t[i]=='O'||t[i]=='U';
			boolean b2=t[j]=='a'||t[j]=='e'||t[j]=='i'||t[j]=='o'||t[j]=='u'||t[j]=='A'||t[j]=='E'||t[j]=='I'||t[j]=='O'||t[j]=='U';
			if(b1 && b2) {
				char temp=s.charAt(i);
				t[i]=s.charAt(j);
				t[j]=temp;
				i++;
				j--;
			}
			if(!b1)
				i++;
			if(!b2)
				j--;
			//System.out.println(b1+""+b2);
		}
		System.out.println(t);
	}
}
