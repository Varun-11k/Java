import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n the table you want to print");
        int n = sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(i + "x" + n + "=" + (i*n));
        }
    }
}