package practice;
import java.util.Scanner; 
public class Begin3{ 
  public static void main(String[] args) { 
    Scanner input=new Scanner(System.in); 
    int r=input.nextInt(); 
    double s; 
    s=Math.PI*r*r; 
    System.out.printf("%.7f\n",s); 
  } 
}