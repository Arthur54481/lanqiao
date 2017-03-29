package algorithm_practice;
/*
凑算式

     B      DEF
A + --- + ------- = 10
     C      GHI
     
（如果显示有问题，可以参见【图1.jpg】）
	 
	 
这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。

比如：
6+8/3+952/714 就是一种解法，
5+3/1+972/486 是另一种解法。

这个算式一共有多少种解法？

注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
 */
public class Test3 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, g, h, i;
        int s=0;
        for(a=1;a<10;a++){
        	for(b=1;b<10;b++){
        		if(b==a) 
        			continue;
        		for(c=1;c<10;c++){
        			if(c==a||c==b) 
        				continue;
        			for(d=1;d<10;d++){
        				if(d==a||d==b||d==c) 
        					continue;
        				for(e=1;e<10;e++) {
        					if(e==a||e==b||e==c||e==d) 
        						continue;
        					for(f=1;f<10;f++){
        						if(f==a||f==b||f==c||f==d||f==e) 
        							continue;
        						for(g=1;g<10;g++){
        							if(g==a||g==b||g==c||g==d||g==e||g==f) 
        								continue;
        							for(h=1;h<10;h++){
        								if(h==a||h==b||h==c||h==d||h==e||h==f||h==g) 
        									continue;
        								for(i=1;i<10;i++){
        									if(i==a||i==b||i==c||i==d||i==e||i==f||i==g||i==h) 
        										continue;
        									double num = a + b/c + (100*d+10*e+f)/(100*g+10*h+i);
        									if(num==10) {
        										s++; 
        									}
        								}
        							}
        						}
        					}
        				}
        			}
        		}
        	}
        }
        System.out.println(s);
    }
}