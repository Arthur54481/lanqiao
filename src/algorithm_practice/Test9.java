package algorithm_practice;
/*
题目：猜算式

你一定还记得小学学习过的乘法计算过程，比如：

   273
x   15
------
  1365
  273
------
  4095
  
请你观察如下的乘法算式

    ***
x   ***
--------
    ***
   ***
  ***
--------
  *****
  
星号代表某位数字，注意这些星号中，
0~9中的每个数字都恰好用了2次。
(如因字体而产生对齐问题，请参看图p1.jpg)

请写出这个式子最终计算的结果，就是那个5位数是多少？

注意：只需要填写一个整数，不要填写任何多余的内容。比如说明文字。
 */
public class Test9 {  
	  
    public static boolean check(int num, int[] s) {  
        while (num != 0) {  
            if (s[num % 10] == 2) { // 如果这个数字已经出现过两次，则返回false，不输出  
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
                int a = i * (j % 10);// i*j的个位  
                int b = i * (j / 10 % 10);// i*j的十位  
                int c = i * (j / 100);// i*j的百位  
                int sum = i * j;  
                if (a > 999 || b > 999 || c > 999 || sum > 99999 || a < 100 || b < 100 || c < 100 || sum < 10000)  
                    continue;  
                if (check(i, s) && check(j, s) && check(a, s) && check(b, s) && check(c, s) && check(sum, s)) 
                    System.out.println(sum);   
            }  
        }  
    }  
}  
