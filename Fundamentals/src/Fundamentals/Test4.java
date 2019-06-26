package Fundamentals;

public class Test4 {
	public static void main(String[] args) {
		char ch='a';
		int n;
		if(ch>='a'||ch<='z'||ch>='A'||ch<='Z')
		{
			System.out.println("alphabet");
		}
		else if(ch>=0||ch<=1000)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special character");
		}
		
		
			
	}

}
