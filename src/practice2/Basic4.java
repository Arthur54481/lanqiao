package practice2;
/*
��������
����n�������ҳ���n���������ֵ����Сֵ���͡�
�����ʽ
��һ��Ϊ����n����ʾ���ĸ�����
�ڶ�����n������Ϊ������n������ÿ�����ľ���ֵ��С��10000��
�����ʽ
������У�ÿ��һ����������һ�б�ʾ��Щ���е����ֵ���ڶ��б�ʾ��Щ���е���Сֵ�������б�ʾ��Щ���ĺ͡�
��������
5
1 3 -2 4 5
�������
5
-2
11
���ݹ�ģ��Լ��
1 <= n <= 10000��
 */
import java.util.Scanner;
public class Basic4 {
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in); 
	    int n=sc.nextInt(); 
	    int min=Integer.MAX_VALUE; 
	    int max=Integer.MIN_VALUE;
	    int []b=new int[n]; 
	    for(int i=0;i<n;i++){
		    b[i]=sc.nextInt();  
	    }
	    for(int i=0;i<n;i++){ 
		    if(min>b[i]){min=b[i];}  
		    if(max<b[i]){max=b[i];}  
		}
		System.out.println(max); 
	    System.out.println(min);
	    int sum=0;
	    for(int i=0;i<b.length;i++){
		    sum+=b[i]; 
	    }
		 System.out.println(sum);
	}
}