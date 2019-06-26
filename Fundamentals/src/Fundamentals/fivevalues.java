package Fundamentals;

public class fivevalues {
	public static void main(String args[]){
        int c=0,i=0;
        while(c!=5){
            i++;
        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
            System.out.println(i);
            c++;
        }
        
    }
}
}