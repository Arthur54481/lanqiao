package algorithm_practice;
/*
���⣺����ĸ

    ��abcd...s��19����ĸ��ɵ������ظ�ƴ��106�Σ��õ�����Ϊ2014�Ĵ���

    ������ɾ����1����ĸ������ͷ����ĸa�����Լ���3������5������������λ�õ���ĸ��

    �õ����´��ٽ���ɾ������λ����ĸ�Ķ����������ȥ�����ֻʣ��һ����ĸ����д������ĸ��

����һ��Сд��ĸ����ͨ��������ύ�𰸡���Ҫ��д�κζ�������ݡ�
 */
import java.util.*;
public class Test13 {
	public static void main(String[] args) {  	  
        String str = "";  
        for (int i = 1; i <= 19; i++)  
            str += (char) (96 + i);  
  
        StringBuilder s = new StringBuilder();  
        for (int i = 0; i < 106; i++)  
            s.append(str);  
  
        while (s.length() > 1) {  
            for (int i = 0; i < s.length(); i++)  
                s.delete(i, i + 1);  
        }  
        System.out.println(s);  
    }
}
