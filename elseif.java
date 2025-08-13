import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your Marks");
        int marks = sc.nextInt();

        if (marks >=90){
            System.out.println("YOURE SMART BOYYY!! BRAVO YOU SCORED A GRADE");
        }
         else if (marks >=80 ){
             System.out.println("YOU GOT GOOD MARKS SCORED B GRADE");
        } else if (marks >=40) {
             System.out.println("WORK MORE HARDER!!");

        }
         else {
             System.out.println("BETTER LUCK NEXT TIME YOURE FAILED");
        }
    }
}