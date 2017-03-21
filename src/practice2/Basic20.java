package practice2;
import java.util.Scanner;

public class Basic20 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String s = scanner.next();
                int n = s.length();
                int m = n;
                int[] a = new int[n];
                StringBuffer buf = new StringBuffer();
                // ↓ 将字符串放在数组里面
                for (int i = 0; i < n; i++) {
                        if (i < n - 1) {
                                a[i] = Integer.parseInt(s.substring(i, i + 1));
                        } else
                                a[i] = Integer.parseInt(s.substring(n - 1));
                }
                // 读数
                for (int i = 0; i < n; i++) {
                        if (m == 10) {
                                if (a[i] == 1) {
                                        buf.append("shi ");
                                } else {
                                        buf.append("er shi ");
                                }
                        }
                        if (m == 9) {
                                if (a[i] > 0) {
                                        buf.append(check(a[i]) + " yi ");
                                } else {
                                        if (a[i] == 0 && a[i + 1] != 0)
                                                buf.append("yi ling ");
                                        else
                                                buf.append("yi ");
                                }
 
                        }
                        if (m == 8) {
                                if (a[i] > 0) {
                                        buf.append(check(a[i]) + " qian ");
                                } else {
                                        if (a[i] == 0 && a[i + 1] != 0) {
                                                buf.append("ling ");
                                        }
                                }
                        }
 
                        if (m == 7) {
                                if (a[i] > 0) {
                                        buf.append(check(a[i]) + " bai ");
                                } else {
                                        if (a[i] == 0 && a[i + 1] != 0) {
                                                buf.append("ling ");
                                        }
                                }
 
                        }
                        if (m == 6) {
                                if (n == 6) {
                                        if (a[i] > 1) {
                                                buf.append(check(a[i]) + " shi ");
                                        }
                                        if (a[i] == 1) {
                                                buf.append("shi ");
                                        }
                                } else {
                                        if (a[i] != 0) {
                                                buf.append(check(a[i]) + " shi ");
                                        } else if (a[i] == 0 && a[i + 1] != 0) {
                                                buf.append("ling ");
                                        }
                                }
                        }
                        if (m == 5) {// wan的
                                if (n == 5) {
                                        if (a[i] > 0) {
                                                buf.append(check(a[i]) + " wan ");
                                        }
                                } else {
                                        if (a[i] != 0) {
                                                buf.append(check(a[i]) + " wan ");
                                        } else {
                                                for (int j = 1; j <= i; j++) {
                                                        if (a[i - j] != 0) {
                                                                buf.append("wan ");
                                                                if (a[i + 1] != 0) {
                                                                        buf.append("ling ");
                                                                }
                                                                break;// 注意别忘记
 
                                                        }
 
                                                }
                                        }
                                }
                        }
                        if (m == 4) {
                                if (a[i] > 0) {
                                        buf.append(check(a[i]) + " qian ");
                                } else {
                                        if (a[i] == 0 && a[i + 1] != 0) {
                                                buf.append("ling ");
                                        }
                                }
                        }
                        if (m == 3) {
                                if (a[i] > 0) {
                                        buf.append(check(a[i]) + " bai ");
                                } else {
                                        if (a[i] == 0 && a[i + 1] != 0) {
                                                buf.append("ling ");
                                        }
                                }
                        }
                        if (m == 2) {
                                // if(n==2)
                                if (a[i] > 0) {
                                        buf.append(check(a[i]) + " shi ");
                                } else {
                                        if (a[i] == 0 && a[i + 1] != 0) {
                                                buf.append("ling ");
                                        }
                                }
 
                        }
                        if (m == 1) {
                                if (a[i] > 0)
                                        buf.append(check(a[i]));
                        }
                        m--;
                }
                System.out.println(buf);
        }
 
        static String s = "";
 
        static String check(int i) {
                switch (i) {
                case 1:
                        s = "yi";
                        break;
                case 2:
                        s = "er";
                        break;
                case 3:
                        s = "san";
                        break;
                case 4:
                        s = "si";
                        break;
                case 5:
                        s = "wu";
                        break;
                case 6:
                        s = "liu";
                        break;
                case 7:
                        s = "qi";
                        break;
                case 8:
                        s = "ba";
                        break;
                case 9:
                        s = "jiu";
                        break;
                }
                return s;
 
        }
}