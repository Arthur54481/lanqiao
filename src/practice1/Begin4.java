package practice1;
/*
��������
����A��B�����A+B��
�����ʽ
����ĵ�һ�а��������������ɿո�ָ����ֱ��ʾA��B��
�����ʽ
���һ�У�����һ����������ʾA+B��ֵ��
��������
12 45
�������
57
���ݹ�ģ��Լ��
-10000 <= A, B <= 10000��
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