package Fundamentals;

import java.util.Scanner;

public class color {
	private static Scanner sc;

	public static void main(String args[])
	{
		sc = new Scanner(System.in);
	    char ch;
	    ch=sc.next().charAt(0);
	    switch(ch)
	    {
	    case 'R':
	    	System.out.println("Red");
	    	break;
	    case 'Y':
	    	System.out.println("Yellow");
	    	break;
	    case 'O':
	    	System.out.println("Orange");
	    	break;
	    case 'B':
	    	System.out.println("Blue");
	    	break;
	    default:
	    	System.out.println("in valid");
	    }
	    	
	    
	    }
}
