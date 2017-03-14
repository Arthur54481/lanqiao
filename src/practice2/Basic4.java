package practice2;
import java.util.Scanner;
public class Basic4 {
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in); 
	    int n=sc.nextInt(); 
	    int min=Integer.MAX_VALUE; 
	    int max=Integer.MIN_VALUE;
	    int []b=new int[n]; 
	    for(int i=0;i<n;i++){
		    b[i]=sc.nextInt();  
	    }
	    for(int i=0;i<n;i++){ 
		    if(min>b[i]){min=b[i];}  
		    if(max<b[i]){max=b[i];}  
		}
		System.out.println(max); 
	    System.out.println(min);
	    int sum=0;
	    for(int i=0;i<b.length;i++){
		    sum+=b[i]; 
	    }
		 System.out.println(sum);
	}
}