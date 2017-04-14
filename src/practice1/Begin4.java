package practice1;
/*
问题描述
输入A、B，输出A+B。
输入格式
输入的第一行包括两个整数，由空格分隔，分别表示A、B。
输出格式
输出一行，包括一个整数，表示A+B的值。
样例输入
12 45
样例输出
57
数据规模与约定
-10000 <= A, B <= 10000。
 */
import java.util.Scanner; 
public class Begin4{ 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    int n = input.nextInt(); 
    int a=1,b=1,num = 0; 
    if(n==1 || n==2) 
      System.out.printf("1\n"); 
      else{ 
        for(int i=3;i<=n;i++){ 
          num=(a+b)%10007; 
          a=b; 
          b=num; 
      } 
     System.out.println(num); 
    } 
  } 
}