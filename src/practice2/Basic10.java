package practice2;
import java.util.*;
public class Basic10{  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        long number = input.nextLong();  
        String arr = Long.toHexString(number);
        arr = arr.toUpperCase();  
        System.out.println(arr);  
    }  
}
