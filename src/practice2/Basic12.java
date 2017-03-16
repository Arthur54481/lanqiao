package practice2;
import java.util.*;
public class Basic12 {
    public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
    	int a=s.nextInt();
    	String[] arr=new String[a];
		for(int i=0;i<a;i++){
		    arr[i]=s.next();
		}
    	for(int n=0;n<arr.length;n++){
    		String i=arr[n];
    		long b=Long.parseLong(i, 16);
    		String binary = Long.toOctalString(b);
    		System.out.println(binary);
    	}
    }
}
