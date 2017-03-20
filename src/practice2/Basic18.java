package practice2;
import java.util.*;
public class Basic18 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double[] a=new double[4];
		for(int i=0;i<4;i++){
			double x=input.nextDouble();
			a[i]=x;
		}
		double[] b=new double[4];
		for(int i=0;i<4;i++){
			double x=input.nextDouble();
			b[i]=x;
		}
		double xMaxA=Math.max(a[0], a[2]);
		double xMinA=Math.min(a[0], a[2]);
		double yMaxA=Math.max(a[1], a[3]);
		double yMinA=Math.min(a[1], a[3]);
		double xMaxB=Math.max(b[0], b[2]);
		double xMinB=Math.min(b[0], b[2]);
		double yMaxB=Math.max(b[1], b[3]);
		double yMinB=Math.min(b[1], b[3]);
		if(xMinB >= xMaxA || xMinA >= xMaxB || yMinB >= yMaxA || yMinA >= yMaxB)
			System.out.println("0.00");
		else{
			double xx = Math.max(xMinA, xMinB), yy = Math.max(yMinA, yMinB);  
            double x = Math.min(xMaxA, xMaxB), y = Math.min(yMaxA, yMaxB);  
            System.out.println(String.format("%.2f", (Math.abs(x - xx) * Math.abs(y - yy))));
		}
	}
}
