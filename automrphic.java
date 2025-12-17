import java.util.Scanner;
public class automrphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int square=a*a;
        for(int i=0;i<=a;i++){
            if(square%10==a||square%100==a){
                System.out.println("automorphic");
                break;
            }else{
                System.out.println("not automorphic");
                break;
            }
            }
        }
    }
