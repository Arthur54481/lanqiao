package practice2;
/*
问题描述
对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
00000
00001
00010
00011
00100
请按从小到大的顺序输出这32种01串。
输入格式
本试题没有输入。
输出格式
输出32行，按从小到大的顺序每行一个长度为5的01串。
样例输出
00000
00001
00010
00011
<以下部分省略>
 */
public class Basic2 {
	public static void main(String[] args){
	    int a,b,c,d,e;  	      
	    for(e=0;e<=1;e++)  
	    for(d=0;d<=1;d++)  
	    for(c=0;c<=1;c++)  
	    for(b=0;b<=1;b++)  
	    for(a=0;a<=1;a++)  
	    System.out.println(e+""+d+""+c+""+b+""+a); 
	}
}