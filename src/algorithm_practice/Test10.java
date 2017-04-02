package algorithm_practice;
/*
标题：积分之迷

小明开了个网上商店，卖风铃。共有3个品牌：A，B，C。
为了促销，每件商品都会返固定的积分。

小明开业第一天收到了三笔订单：
第一笔：3个A + 7个B + 1个C，共返积分：315
第二笔：4个A + 10个B + 1个C，共返积分：420
第三笔：A + B + C，共返积分....

你能算出第三笔订单需要返积分多少吗？

请提交该整数，不要填写任何多余的内容。
 */
public class Test10 {
	public static void main(String[] args){
		for(int a=0;a<200;a++){
			for(int b=0;b<200;b++){
				for(int c=0;c<200;c++){
					if(3*a+7*b+c==315){
						if(4*a+10*b+c==420){
							System.out.println(a+b+c);
						}
					}
				}
			}
		}
	}
}
