package practice2;
/*
��������
����һ����ݣ��ж���һ���ǲ������ꡣ
���������֮һ����ʱ����һ�������꣺
1. �����4�ı���������100�ı�����
2. �����400�ı�����
��������ݶ��������ꡣ
�����ʽ
�������һ������y����ʾ��ǰ����ݡ�
�����ʽ
���һ�У������������������꣬�����yes���������no��

��������
2013
�������
no
��������
2016
�������
yes
���ݹ�ģ��Լ��
1990 <= y <= 2050��
 */
import java.util.Scanner;
public class Basic1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
	    int a = input.nextInt(); 
	    if(a%4==0 && a%100!=0)
	    	System.out.println("yes");
	    else if(a%400==0)
	    	System.out.println("yes");
	    else
	    	System.out.println("no");
	}
}