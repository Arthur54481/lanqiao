package practice2;
import java.util.Scanner;
public class Basic21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String string = Sn(n, 1, 1);
        System.out.println(string);
    }
    private static String An(int n, int i, int j) {
        if (i == n) 
        	return "sin("+j+")";
        if (i % 2 ==0) 
        	return "sin("+i+"+"+An(n, i+1,j+1)+")";
        else 
        	return "sin("+i+"-"+An(n, i+1,j+1)+")";
    }
    private static String Sn(int n, int i, int j) {
        if (i == n) 
        	return An(n, i, j)+"+"+i;
        return "("+Sn(n, i+1, j)+")"+An(n, i, j)+"+"+i;
    }
}

