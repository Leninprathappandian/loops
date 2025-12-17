import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int digit,rev=0,i;
        while(a!=0){
            digit=a%10;
            rev=rev*10+digit;
            a/=10;

        }
        System.out.println( rev);
    }
    
}
