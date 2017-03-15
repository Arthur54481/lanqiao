package practice2;
import java.util.Scanner;
public class Basic3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
	    int n = input.nextInt(); 
	    int m = input.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i][0] = (char)('A' + i);
        }
        for (int i = 0; i < m; i++) {
            arr[0][i] = (char)('A' + i);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr[i][j] = arr[i - 1][j - 1];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
	}
}