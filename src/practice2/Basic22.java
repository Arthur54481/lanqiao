package practice2;
import java.util.*;
public class Basic22 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println(string(a));
	}
	public static String string(int x){
        if(x==1) 
        	return "A";
        else 
        	return string(x-1)+(char)('A'+x-1)+string(x-1);
    }
}
