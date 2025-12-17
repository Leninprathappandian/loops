import java.util.Scanner;
public class buzz{
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();

     if (a % 7 == 0 || a % 10 == 7){
       System.out.println("buzz");
    } else{
        System.out.println("not buzz");
    }}
    
}