package practice2;
import java.util.Scanner;
public class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            getFive(n);
            getSix(n);
    }
    static void getFive(int n){
        for(int i=10000;i<100000;i++){
            int a = i/10000;
            int b = i%10000/1000;
            int c = i%1000/100;
            int d = i%100/10;
            int e = i%10;
            if(a==e&&b==d){
                if(a+b+c+d+e == n){
                    System.out.println(i);
                }
            }
        }
    }
    static void getSix(int n){
    	for(int i=100000;i<1000000;i++){
        int a = i/100000;
        int b = i%100000/10000;
        int c = i%10000/1000;
        int d = i%1000/100;
        int e = i%100/10;
        int f = i%10;
            if(a==f&&b==e&&c==d){
                if(a+b+c+d+e+f == n){
                    System.out.println(i);
                }
            }
        } 
    }
}