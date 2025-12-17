
import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);   
       int a=sc.nextInt();
       int sq=a*a;
       int sum=0;
       while(sq>0){
           sum+=sq%10;
           sq/=10;
       }
       if(sum==a){
           System.out.println("neon number");
       }
       else{
           System.out.println("not neon number");
       } 
    }
}
