package algorithm_practice;
/*

标题：切面条

    一根高筋拉面，中间切一刀，可以得到2根面条。

    如果先对折1次，中间切一刀，可以得到3根面条。

    如果连续对折2次，中间切一刀，可以得到5根面条。

    那么，连续对折10次，中间切一刀，会得到多少面条呢？

答案是个整数，请通过浏览器提交答案。不要填写任何多余的内容。
 */
public class Test12 {
	public static void main(String[] args){
		int num = 2;
		int i = 1;
		while(i++<11)
		{
			num = 2*num -1;
		}
		System.out.println(num);
	}
}
