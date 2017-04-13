package practice1;
/*
问题描述
求1+2+3+...+n的值。
输入格式
输入包括一个整数n。
输出格式
输出一行，包括一个整数，表示1+2+3+...+n的值。
样例输入
4
样例输出
10
样例输入
100
样例输出
5050
数据规模与约定
1 <= n <= 1,000,000,000。
 */
import java.util.Scanner; 
public class Begin3{ 
  public static void main(String[] args) { 
    Scanner input=new Scanner(System.in); 
    int r=input.nextInt(); 
    double s; 
    s=Math.PI*r*r; 
    System.out.printf("%.7f\n",s); 
  } 
}