package algorithm_practice;
/*
��������

���µ�10������
   +--+--+--+
   |  |  |  |
+--+--+--+--+
|  |  |  |  |
+--+--+--+--+
|  |  |  |
+--+--+--+

�������ʾ�����⣬Ҳ���Բο���ͼ1.jpg����

����0~9�����֡�Ҫ���������������ֲ������ڡ�
�����ҡ����¡��ԽǶ������ڣ�

һ���ж����ֿ��ܵ�����������

����д��ʾ������Ŀ��������
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
 */
public class Test6 {
    static int sum = 0 ;
    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,5,6,7,8,9};
        int b[] = new int[10];
        String s = "";
        f(a,b,0,s);
        System.out.println(sum);
    }
    private static void f(int[] a,int[] b,int k,String s) {
        if(k!=0 && k!=1 && k!=4 && k!=8 ){
            if(Math.abs(b[k-1]-b[k-2])==1) return;
        }
        if(k>=4 && k<=10 && k!=7){
            if(Math.abs(b[k-1]-b[k-4])==1) return;
        }
        if(k>=5 && k<=10){
            if(Math.abs(b[k-1]-b[k-5])==1) return;
        }
        if(k==6 || k==7 || k==9 || k==10){
            if(Math.abs(b[k-1]-b[k-6])==1) return;
        }
        
        if(k==a.length) {
            sum++;
            System.out.println(s);
            return;
        }
        for(int i=0;i<a.length;i++){
            String ss = s;
            if(a[i]==-1) continue;
            b[k] = a[i];
            ss += a[i];
            a[i] = -1;
            f(a,b,k+1,ss);
            a[i] = b[k];
        }     
    }
}