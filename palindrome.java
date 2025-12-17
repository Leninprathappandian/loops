import java.util.Scanner;
public class palindrome {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int digit,rev=0,original=a;
        while(a!=0){
            digit=a%10;
            rev=rev*10+digit;
            a/=10;

        }
        System.out.println( rev);
        if(rev==original){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
