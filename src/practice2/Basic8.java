package practice2;
/*
问题描述
　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的四位十进制数。
 */
public class Basic8 {
    public static void main(String[] args){
    	for(int a=1000;a<10000;a++){
    		int i=a/1000;
    		int j=a/100%10;
    		int k=a/10%100%10;
    		int l=a%1000%100%10;
    		if(i==l&&j==k)
    			System.out.println(a);
    	}
    }
}