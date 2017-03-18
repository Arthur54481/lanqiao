package practice2;
import java.util.*;
public class Basic15 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		if(a.length()!=b.length())
			System.out.println("1");
		else if(a.length()==b.length()&&a.equals(b)==true)
			System.out.println("2");
		else if(a.length()==b.length()&&a.equalsIgnoreCase(b)==true)
			System.out.println("3");
		if(a.length()==b.length()&&a.equalsIgnoreCase(b)==false)
			System.out.println("4");
	}
}
