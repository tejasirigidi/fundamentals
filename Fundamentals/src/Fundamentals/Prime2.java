package Fundamentals;

public class Prime2 {
	 public static void main(String args[])
	    {
	        
	        int c=0;
	        for(int i=10;i<=99;i++){
	        	c=0;
	        	for(int j=2;j<=i;j++)
	        	{
	            if(i%j==0)
	            	c++;
	            
	        }
	        
	        	if(c==1)
	        	{
	        		System.out.println(i);
	        	}
	        }
	        
	        
	}


}
