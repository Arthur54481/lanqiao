package practice1;
/*
��������
��1+2+3+...+n��ֵ��
�����ʽ
�������һ������n��
�����ʽ
���һ�У�����һ����������ʾ1+2+3+...+n��ֵ��
��������
4
�������
10
��������
100
�������
5050
���ݹ�ģ��Լ��
1 <= n <= 1,000,000,000��
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