package practice2;
/*
��������
����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����
�����ʽ
��һ�а���һ������n��
�ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��
�����а���һ������a��Ϊ�����ҵ�����
�����ʽ
���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1��
��������
6
1 9 4 8 3 9
9
�������
2
���ݹ�ģ��Լ��
1 <= n <= 1000��
 */
import java.util.*;
public class Basic5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=input.nextInt();
		}
		int x=input.nextInt();
		for(int j=0;j<n;j++){
		    if(x==a[j]){
		        System.out.println(j+1);
		        break;
		    }
			if(j==(n-1) && x!=a[j]){
			    System.out.println(-1);
			    break;
			}
		}
	}
}	