import java.util.Scanner;
public class strongnumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int original=a;
       
        int sum=0;
        while(a!=0){
            int digit=a%10;
            int fact=1;
        for(int i=1;i<=digit;i++){
            fact*=i;}
            sum+=fact; 
             a/=10;  
        }
       if(sum==original){
        System.out.println("strong number");
       }
       else{
        System.out.println("not strong number");
       }
    }
}
