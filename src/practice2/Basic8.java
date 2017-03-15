package practice2;

public class Basic8 {
    public static void main(String[] args){
    	for(int a=1000;a<10000;a++){
    		int i=a/1000;
    		int j=a/100%10;
    		int k=a/10%100%10;
    		int l=a%1000%100%10;
    		if(i==l&&j==k)
    			System.out.println(a);
    	}
    }
}