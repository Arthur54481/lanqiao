package practice2;
/*
��������
��������n��ʮ��������������������Ƕ�Ӧ�İ˽�������
�����ʽ
��������ĵ�һ��Ϊһ��������n ��1<=n<=10����
����������n�У�ÿ��һ����0~9����д��ĸA~F��ɵ��ַ�������ʾҪת����ʮ��������������ÿ��ʮ�����������Ȳ�����100000��
�����ʽ
�������n�У�ÿ��Ϊ�����Ӧ�İ˽�����������
������ע�⡿
���������ʮ��������������ǰ��0������012A��
��������İ˽�����Ҳ������ǰ��0��
��������
����2
����39
����123ABC
�������
����71
����4435274
��������ʾ��
�����Ƚ�ʮ��������ת����ĳ������������ĳ������ת���ɰ˽��ơ�
 */
import java.io.*; 
class Basic12
{
    public static void main(String[] args)throws NumberFormatException,
            IOException  
    {
        BufferedReader buf = new BufferedReader(
                new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
        int l = 0,j=0,k=0,p=0;
        String m1="";
        String m2="";
        char arr[];
        String ss[] = new String[n];
        while ((n--)!=0)
        {
            m1=buf.readLine();
            l=m1.length();
            m2=hexToBinary(m1);
            l=m2.length();
            switch(l%3){
                case 1:m2="00"+m2;break;
                case 2:m2="0"+m2;break;
                default:break;
            }
            arr=new char [m2.length()/3];
            for ( k=0,j=0;k<m2.length()-2;k+=3)
            {
                char c=(char)((m2.charAt(k)-'0')*4+(m2.charAt(k+1)-'0')*2+(m2.charAt(k+2)-'0')+'0');
                if (k==0&&c=='0')
                {
                    continue;
                }
                arr[j]=c;j++;
            }
            ss[p]=new String(arr);
            p++;
        }
        for (int i=0;i<p ;i++ )
        {
            System.out.println(ss[i]);
        }
    }
    public static String hexToBinary(String hexNum){
        char[] chs = {'0','1'};
        String str = new String("0123456789ABCDEF");
        char[] charArray = hexNum.toCharArray();
        int pos = charArray.length*4;
        char[] binaryArray = new char[pos];
        for (int i = charArray.length - 1; i >=0; i--) {
            int temp = str.indexOf(charArray[i]);
            for(int j=0;j<4;j++){
                binaryArray[--pos] = chs[temp & 1];
                temp = temp >>> 1;
            }
        }
        return new String(binaryArray);
    }
}
