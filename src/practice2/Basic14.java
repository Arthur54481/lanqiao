package practice2;
import java.util.*;
public class Basic14 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int h = 0,m = 0,s = 0;
		if(a<60){
			s=a%60;
		}
		else if(a<3600){
			s=a%60;
			m=a/60%60;
		}
		else{
			s=a%60;
			m=a/60%60;
		    h=a/3600%60;
		}
		System.out.println(h+":"+m+":"+s);
	
	}
}
