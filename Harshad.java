import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);   
       int a=sc.nextInt();
       int sum=0;
       int original=a;
       int digit;
       while(a>0){
           digit=a%10;
            sum+=digit;
           a/=10;
       }
      
       if(original%sum==0){
           System.out.println("Harshad number");
       }
       else{
           System.out.println("not Harshad number");
       } 
    }
}
