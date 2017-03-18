package practice2;
import java.util.*;  
public class Basic17 {  
    public static int N, M;  
    public static int[][] array, result, tmp;  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        N = sc.nextInt();  
        M = sc.nextInt();  
        array = new int[N][N];  
        tmp = new int[N][N];  
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < N; j++) {  
                array[i][j] = sc.nextInt();  
                tmp[i][j] = array[i][j];  
            }  
        }  
        if (M == 0) {  
            for (int i = 0; i < N; i++) {  
                for (int j = 0; j < N; j++) {  
                    if (i == j) {  
                        System.out.print(1 + " ");  
                    } else  
                        System.out.print(0 + " ");  
                }  
                System.out.println();  
            }  
            return;  
        } 
        if (M == 1) {  
            for (int i = 0; i < N; i++) {  
                for (int j = 0; j < N; j++) {  
                    System.out.print(tmp[i][j] + " ");  
                }  
                System.out.println();  
            }  
            return;  
        }   
        for (int m = 0; m < M - 1; m++) {  
            result = new int[N][N];  
            for (int i = 0; i < N; i++) {  
                for (int j = 0; j < N; j++) {  
                    for (int n = 0; n < N; n++) {  
                        result[i][j] += tmp[i][n] * array[n][j];  
                    }  
                }  
            }  
            for (int i = 0; i < N; i++) {  
                for (int j = 0; j < N; j++) {  
                    tmp[i][j] = result[i][j];  
                }  
            }  
        }  
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < N; j++) {  
                System.out.print(result[i][j] + " ");  
            }  
            System.out.println();  
        }  
    }  
}  