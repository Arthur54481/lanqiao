package practice2;
import java.util.*;

public class Basic30 {
        static int max = 1000;
        public static void main(String[] args) {
                int A[] = new int[max];
                Scanner kuye = new Scanner(System.in);
                int n = kuye.nextInt();
                A[0] = 1;
                int count = 0;
                for (int i = 1; i <= n; i++) {
                        int ge = 0, sum;
                        q: for (int j = 0; j <= count; j++) {
                                if ((i * A[j] + ge) / 10 != 0) {
                                        sum = A[j] * i + ge;
                                        A[j] = sum % 10;
                                        ge = sum / 10;
                                        if (j == count) {
                                                count++;
                                                continue q;
                                        }
                                } else {
                                        A[j] = i * A[j] + ge;
                                        ge = 0;
                                }
                        }
                }
                for (int i = count; i >= 0; i--) {
                        System.out.print(A[i]);
                }
        }
}