import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();

        for(int i=0; i<=n;i++){
            if(n%2!=0){
                System.out.println("given number is not even");
                break;

            }
            else{
                System.out.println("#");
            }
        }

    }
}