package practice;
//
import java.util.Scanner; 
public class Begin2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
	    int a = input.nextInt();
	    long sum=0;
	    for(long i=1;i<=a;i++){
	    sum=sum+i;
	    }
	    System.out.println(sum);
	}    
}
