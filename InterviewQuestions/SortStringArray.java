public class SortStringArray {
	public static void main(String[] args) {
		String []s={"Sou", "Siu", "Harsh", "Alok", "Tanuj"};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>s[j].compareTo(s[i])) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(Arrays.asList(s).toString());
	}
}
