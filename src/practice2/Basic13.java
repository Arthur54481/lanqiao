package practice2;
/*
问题描述
　　给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
输入格式
　　第一行为一个整数n。
　　第二行包含n个整数，为待排序的数，每个整数的绝对值小于10000。
输出格式
　　输出一行，按从小到大的顺序输出排序后的数列。
样例输入
5
8 3 6 4 9
样例输出
3 4 6 8 9
*/
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
