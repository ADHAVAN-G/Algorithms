import java.util.*;
public class Exercise {
	public static void main(String[] args) {
		int a[]= {9,8,5,0,2,19,21,6};
		int n=0;
		Arrays.sort(a);
		boolean flag=false;
		int i=0;
		int j=a.length-1;
		while(i<=j) {
			int mid=(i+j)/2;
			if(a[mid]==n)
			{
				flag=true;
				break;
			}
			if(a[mid]>n)
				j=mid-1;
			if(a[mid]<n)
				i=mid+1;
		}
		if(flag)
			System.out.println("number found");
		else
			System.out.println("not found");
	}
}
