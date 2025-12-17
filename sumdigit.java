import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int product=1,digit;
       for(int i=0;i<=a;i++){
            digit=a%10;
            product*=digit;
            a=a/10;
        }
          System.out.println(product);
    }
    
}