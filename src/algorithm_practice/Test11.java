package algorithm_practice;
/*
���⣺�书�ؼ�

    С����Xɽ��̽�գ���һ����������书�ؼ���2000��ҳ����Ȼ��α��ģ���
    ��ע�⵽����ĵ�10ҳ�͵�11ҳ��ͬһ��ֽ�ϣ�����11ҳ�͵�12ҳ����ͬһ��ֽ�ϡ�

    С��ֻ����ϰ����ĵ�81ҳ����92ҳ���书���ֲ�����������顣����������Ҫ˺�¶�����ֽ���ߣ�

���Ǹ���������ͨ��������ύ�����֣���Ҫ��д�κζ�������ݡ�


 */
import java.util.Scanner;  
public class Test11 {  
  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        int a=input.nextInt();  
        int b=input.nextInt();  
        int c;  
        if (a%2!=0&b%2==0)  
        {  
            c=(b-a)/2+2;  
        }  
        else  
            c=(b-a)/2+1;  
        System.out.println(c);    
    }  
} 