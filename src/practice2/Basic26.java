package practice2;
import java.util.Scanner;
public class Basic26 {
  
    public static String[] time1={"zero","one","two","three","four","five","six","seven","eight","nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen","twenty"};
    public static String[] time2={"twenty","thirty","forty","fifty"};
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int h=sc.nextInt();
            int m=sc.nextInt();
            if(h<=20){
                System.out.print(time1[h]);
            }else{
                System.out.print("twenty"+" "+time1[h-20]);
            }
            if(m==0){
                System.out.println(" "+"o'clock");
            }else{
                if(m<20){
                    System.out.print(" "+time1[m]);
                }else{
                    int a=m/10;//ʮλ
                    int b=m%10;//��λ
                    System.out.print(" "+time2[a-2]+" "+time1[b]);
                }
            }
            System.out.println();
        }
    }
}