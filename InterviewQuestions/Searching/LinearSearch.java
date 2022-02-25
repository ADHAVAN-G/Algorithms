import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		int a[]= {9,8,5,0,2,19,21,6};
		int n=1;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("number found");
		else
			System.out.println("not found");
	}
}
