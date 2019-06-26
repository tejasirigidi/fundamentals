package Fundamentals;
import java.util.*;

public class palindrome {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;
            
        }
        if(n1==sum)
        System.out.println(n1+" is palindrome");
        else
        	System.out.println(n1+" is not palindrome");
    }

    
}



