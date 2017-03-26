package practice2;
import java.util.Arrays;
import java.util.Scanner;
 
public class Basic28 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                while (scanner.hasNext()) {
                        int num = scanner.nextInt();
                        int[] pi = new int[num];
 
                        for (int i = 0; i < num; i++)
                                pi[i] = scanner.nextInt();
 
                        int sum = 0;
                        int k = 0;
 
                        while (num > 1) {
                                Arrays.sort(pi);
                                k = pi[0] + pi[1];
                                sum = sum + k;
                                pi[0] = k;
                                pi[1] = Integer.MAX_VALUE;
                                num--;
                        }
 
                        System.out.println(sum);
 
                }
        }
}