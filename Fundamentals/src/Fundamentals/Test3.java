package Fundamentals;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		char value1=a.next().charAt(0);
		char value2=a.next().charAt(0);
		if(value1>value2)
		{
			System.out.println("output" +value2+"," +value1);
		}
		else
		{
			System.out.println("output="+value1+","+value2);
		}
	}

}
