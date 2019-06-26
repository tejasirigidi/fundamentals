package Fundamentals;
import java.util.*;

public class Digits {
	private static Scanner s;

	public static void main(String args[])
	{
		s = new Scanner(System.in);
		int i,n,sum=0,r;
		n=s.nextInt();
		for(i=n;i>0;i--)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
					
			
		}
		System.out.println(sum);
		
	}

}
