public class WordFrequency {
	public static void main(String[] args) {
		String s="perfect picture";
		HashMap<Character,Integer>h=new HashMap();
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
			if(h.containsKey(s.charAt(i)))
				h.put(s.charAt(i),h.get(s.charAt(i))+1);
			else
				h.put(s.charAt(i),1);
			}
		}
		System.out.println(h);
	}
}
