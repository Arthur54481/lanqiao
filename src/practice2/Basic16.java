package practice2;
import java.util.*;
public class Basic16 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		for(int i=a;i<=b;i++){
			getPrint(i);
	        System.out.println();
		}
	}
	public static boolean getPrime(int n){
        double i=Math.sqrt(n);  
        for(int j=2;j<=i;j++){
            if(n%j==0)
            	return true;           
        }
        return false;           
    }                   
	public static void getPrint(int n){
        System.out.print(n+"=");
        if(getPrime(n)){     
            for(int i=2;i<=n;i++){
                if(n%i==0){
                   while(true){
                   System.out.print(i);
                   n=n/i;
                   if(n!=1)System.out.print("*");
                   if(n%i!=0)
                	   break;
                   }     
                }     
            }   
        }
        else{
            System.out.print(n);
        }
    }
}
