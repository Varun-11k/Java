import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER");
        int n = sc.nextInt();

        if (n%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("NUMBER is odd");
        }
        sc.close();

    }
}