package practice2;
/*
问题描述
　　给定n个十六进制正整数，输出它们对应的八进制数。
输入格式
　　输入的第一行为一个正整数n （1<=n<=10）。
　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
输出格式
　　输出n行，每行为输入对应的八进制正整数。
　　【注意】
　　输入的十六进制数不会有前导0，比如012A。
　　输出的八进制数也不能有前导0。
样例输入
　　2
　　39
　　123ABC
样例输出
　　71
　　4435274
　　【提示】
　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
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
