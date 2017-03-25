package practice2;
import java.util.*;
public class Basic29 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int rr = 0;
                String a, b;
                a = sc.next();
                b = sc.next();
 
                int shua[] = new int[100];
                int shub[] = new int[100];
                int shuc[] = new int[100];
                for (int i = a.length(); i > 0; i--) {
                        String get1 = a.substring(i - 1, i);
                        shua[a.length() - i] = Integer.parseInt(get1);
                }
                for (int i = b.length(); i > 0; i--) {
                        String get2 = b.substring(i - 1, i);
                        shub[b.length() - i] = Integer.parseInt(get2);
                }
                for (int i = 0; i < shuc.length; i++) {
                        int kuye = shua[i] + shub[i] + rr;
                        shuc[i] = kuye % 10;
                        rr = kuye / 10;
                }
                for (int i = shuc.length - 1; i >= 0; i--) {
                        if (shuc[i] == 0 && rr == 0) { // 用来舍去前面的零
                                continue;
                        }
                        rr++;
                        System.out.print(shuc[i]);
                }
        }
}