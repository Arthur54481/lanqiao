package practice2;
/*
��������
������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�
�����ʽ
����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε�������������
�����ʽ
���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ�
��������
5 7
�������
ABCDEFG
BABCDEF
CBABCDE
DCBABCD
EDCBABC
���ݹ�ģ��Լ��
1 <= n, m <= 26��
 */
import java.util.Scanner;
public class Basic3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
	    int n = input.nextInt(); 
	    int m = input.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i][0] = (char)('A' + i);
        }
        for (int i = 0; i < m; i++) {
            arr[0][i] = (char)('A' + i);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr[i][j] = arr[i - 1][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
	}
}