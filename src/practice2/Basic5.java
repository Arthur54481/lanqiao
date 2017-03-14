package practice2;
import java.util.*;
public class Basic5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=input.nextInt();
		}
		int x=input.nextInt();
		for(int j=0;j<n;j++){
		    if(x==a[j]){
		        System.out.println(j+1);
		        break;
		    }
			if(j==(n-1) && x!=a[j]){
			    System.out.println(-1);
			    break;
			}
		}
	}
}	