package algorithm_practice;
/*
标题：算年龄

英国数学家德摩根出生于19世纪初叶（即18xx年）。
他年少时便很有才华。一次有人问他的年龄，他回答说：
“到了x的平方那年，我刚好是x岁”。

请你计算一下，德摩根到底出生在哪一年。
题中的年龄指的是周岁。

请填写表示他出生年份的四位数字，不要填写任何多余内容
 */
public class Test8 {
	public static void main(String[] args){
		for(int i=0;i<100;i++){
			if((i*i-i)/100==18)
				if(i*i-i<1850)
					System.out.println(i*i-i);
		}
	}
}
