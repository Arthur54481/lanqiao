package practice2;
import java.util.Scanner;
public class Basic6 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();;
        int[][] y=new int[n][];
        for (int i=0;i<n;i++){
            y[i]=new int[i+1];
        }
        for(int i=0;i<y.length;i++){
            y[i][0]=1;
            y[i][y[i].length-1]=1;
            for(int j=0;j<y[i].length;j++){
                if ((j>0) && (j<y[i].length-1)){
                    y[i][j]=y[i-1][j-1]+y[i-1][j];
                }
                System.out.print(y[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}