package test;
/*
输出指定位数的Fibonacci数列
 */
import java.util.*;
public class Fibonacci{
	static int fibonacci(int n){
		if(n==1||n==2){
			return 1;
		}
		else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(fibonacci(a));
	}
}