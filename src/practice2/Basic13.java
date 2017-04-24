package practice2;
import java.util.*;
public class Basic13 {
    public static void main(String[] args){
    	Scanner s=new Scanner(System.in);
    	int a=s.nextInt();
    	int arr[]=new int[a];
    	for(int i=0;i<a;i++){
    		arr[i]=s.nextInt();
    	}
    	for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[x]>arr[y]){
					int temp=arr[x];
				    arr[x]=arr[y];
				    arr[y]=temp;
				}
			}
		}
    	for(int j=0;j<arr.length;j++){
    		System.out.print(arr[j]+" ");
    	
	}
    }
}
