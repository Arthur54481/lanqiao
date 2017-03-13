package practice2;
import java.util.Scanner;
public class Basic1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
	    int a = input.nextInt(); 
	    if(a%4==0 && a%100!=0)
	    	System.out.println("yes");
	    else if(a%400==0)
	    	System.out.println("yes");
	    else
	    	System.out.println("no");
	}
}
