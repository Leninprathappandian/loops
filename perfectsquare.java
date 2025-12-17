
import java.util.Scanner;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i;
        boolean isperfectsquare=false;
        for(i=1;i*i<=a;i++){
           if(i*i==a){
                System.out.println("perfect square");
                break;
            }
           
    }
    if(i*i>a){
        System.out.println("not");
    }
}}
