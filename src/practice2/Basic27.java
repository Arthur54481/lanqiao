package practice2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic27 {
        static int[] table1 = new int[9];
        static int sum = 0, sum1 = 0;
        static boolean[] bool1 = new boolean[9];
        static boolean[] bool2 = new boolean[9];
        static List<String> list = new ArrayList<String>();
        
        public static void check(int k, int m, int[][] a, int[] table,
                        boolean[] bool, boolean flag) {
                if (k == m + 1) {
                        if (flag) {
                                for (int i = 0; i < list.size(); i++) {
                                        String table3 = list.get(i);
                                        int j = 1;
                                        for (; j < m + 1; j++) {
                                                if (table1[j] == table3.charAt(j) - '0')
                                                        break;
                                        }
                                        if (j == m + 1)
                                                sum++;
 
                                }
                                return;// 如果递归到9层返回
                        } else {
                                String s = "";
                                for (int j = 0; j < m + 1; j++) {
                                        s = s + table[j];
                                }
                                list.add(s);
                                return;
                        }
                }
 
                for (int i = 1; i <= m; i++)// 试探每个位置
                {
                        if (a[i - 1][k - 1] == 0)
                                continue; // 判断可否放皇后
                        int n = 0;
                        // 判断对角线是否存在冲突
                        for (int j = 1; j < k; j++) {
                                if (table[k - j] + j == i || table[k - j] - j == i)
                                        break;
                                n++;
                        }
                        if (n == k - 1) {
                                if (!bool[i])// 判断每一行是否存在冲突
                                {
                                        table[k] = i;
                                        bool[i] = true; // 这行有皇后
                                        check(k + 1, m, a, table, bool, flag);
                                        bool[i] = false;
 
                                }
 
                        }
                }
        }
 
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = Integer.parseInt(sc.nextLine());
                int[][] a = new int[n][n];
                for (int i = 0; i < n; i++) {
                        String str = sc.nextLine();
                        String[] strs = str.split(" ");
                        for (int j = 0; j < n; j++) {
                                a[i][j] = Integer.parseInt(strs[j]);
                        }
                }
                long start = System.currentTimeMillis();
                int[] table2 = new int[n + 1];
                table1[1] = -2;
                table2[1] = -2;
                check(1, n, a, table2, bool2, false);
                check(1, n, a, table1, bool1, true);
                System.out.println(sum);
        }
 
}