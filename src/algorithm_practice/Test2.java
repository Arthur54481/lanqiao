package algorithm_practice;
/*
��������

ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������

��������������һ����Ϩ��236������

���ʣ����Ӷ����꿪ʼ������party�ģ�

����д����ʼ������party����������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
 */
public class Test2 {
	public static void main(String[] args){
		for(int i=1;i<100;i++){
             boolean is=false; 
             int s=i,n=i;
             while(true){
                 if(s==236){
                     System.out.println(i+"-"+n);
                     is = true;
                     break;
                 }
                 if(s>236)
                     break;
                 n++; 
                 s +=n;
             }
             if(is)
                 break;
        }
	}
}
