package algorithm_practice;
/*
��Ŀ������ʽ

��һ�����ǵ�Сѧѧϰ���ĳ˷�������̣����磺

   273
x   15
------
  1365
  273
------
  4095
  
����۲����µĳ˷���ʽ

    ***
x   ***
--------
    ***
   ***
  ***
--------
  *****
  
�ǺŴ���ĳλ���֣�ע����Щ�Ǻ��У�
0~9�е�ÿ�����ֶ�ǡ������2�Ρ�
(��������������������⣬��ο�ͼp1.jpg)

��д�����ʽ�����ռ���Ľ���������Ǹ�5λ���Ƕ��٣�

ע�⣺ֻ��Ҫ��дһ����������Ҫ��д�κζ�������ݡ�����˵�����֡�
 */
public class Test9 {  
	  
    public static boolean check(int num, int[] s) {  
        while (num != 0) {  
            if (s[num % 10] == 2) { // �����������Ѿ����ֹ����Σ��򷵻�false�������  
                return false;  
            }  
            s[num % 10]++;  
            num /= 10;  
        }  
        return true;  
    }  
  
    public static void main(String[] args) {  
        for (int i = 100; i <= 999; i++) {  
            for (int j = 100; j <= 999; j++) {  
                int[] s = new int[10];  
                int a = i * (j % 10);// i*j�ĸ�λ  
                int b = i * (j / 10 % 10);// i*j��ʮλ  
                int c = i * (j / 100);// i*j�İ�λ  
                int sum = i * j;  
                if (a > 999 || b > 999 || c > 999 || sum > 99999 || a < 100 || b < 100 || c < 100 || sum < 10000)  
                    continue;  
                if (check(i, s) && check(j, s) && check(a, s) && check(b, s) && check(c, s) && check(sum, s)) 
                    System.out.println(sum);   
            }  
        }  
    }  
}  
