package practice2;
/*
��������
����������ֳ�Pascal�����Σ����ĵ�i+1����(a+b)i��չ��ʽ��ϵ����
����һ����Ҫ�����ǣ��������е�ÿ�����ֵ����������ϵ�������ӡ�����
�����������������ε�ǰ4�У�����
   1����
  1 1����
 1 2 1����
1 3 3 1����
����n���������ǰn�С�
�����ʽ
�������һ����n��
�����ʽ
�����������ε�ǰn�С�ÿһ�д���һ�еĵ�һ������ʼ����������м�ʹ��һ���ո�ָ����벻Ҫ��ǰ���������Ŀո�
��������
4
�������
1
1 1
1 2 1
1 3 3 1
���ݹ�ģ��Լ��
1 <= n <= 34��
 */
import java.util.Scanner;
public class Basic6 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();;
        int[][] y=new int[n][];
        for (int i=0;i<n;i++){
            y[i]=new int[i+1];
        }
        for(int i=0;i<y.length;i++){
            y[i][0]=1;
            y[i][y[i].length-1]=1;
            for(int j=0;j<y[i].length;j++){
                if ((j>0) && (j<y[i].length-1)){
                    y[i][j]=y[i-1][j-1]+y[i-1][j];
                }
                System.out.print(y[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}