import java.util.Scanner;

public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n of elements you wannt to print");
        int n = sc.nextInt();

        int[] number = new int[n];
        for(int i=0;i<n;i++){
            number[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                even++;

            }
            else{
                odd++;
            }
        }
        System.out.println("even count is " + even);
        System.out.println("odd count is " + odd);
        
    }
}
