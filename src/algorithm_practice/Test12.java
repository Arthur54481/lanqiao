package algorithm_practice;
/*

���⣺������

    һ���߽����棬�м���һ�������Եõ�2��������

    ����ȶ���1�Σ��м���һ�������Եõ�3��������

    �����������2�Σ��м���һ�������Եõ�5��������

    ��ô����������10�Σ��м���һ������õ����������أ�

���Ǹ���������ͨ��������ύ�𰸡���Ҫ��д�κζ�������ݡ�
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
