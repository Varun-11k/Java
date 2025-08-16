import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] seats = new boolean[10][10];
        int choice;


    
    
    do{
        System.out.println("WELCOME TO VARUNZZ THEATRE SYSTEM!");
        System.out.println("HOW CAN WE HELP YOU TODAY");
        System.out.println("1 : SHOW SEATS");
        System.out.println("2 : TICKET BOOKING");
        System.out.println("3 : EXIT !!");

        choice = sc.nextInt();

        switch(choice){
            case 1 :
            showSeats(seats);
            break;
            
            case 2 :
            System.out.println("enter row from (0-9)");
            int row = sc.nextInt();
            System.out.println("enter your seat number (0-9)");
            int seat = sc.nextInt();
             
            if(row < 0 || row >= seats.length || seat < 0 || seat>=seats[0].length){
                System.out.println("INVALID SEAT CHOICE");

            }
            else if (seats[row][seat]){
                System.out.println("SORRY SEAT HAS BEEN ALREADY BOOKED");
            }
            else{
                seats[row][seat] = true;
                System.out.println("CONGRATUlATIONS YOUR SEAT HAS BEEN BOOKED ENJOY YOUR MOVE!");
                break;
            }
            case 3 :
                System.out.println("THANKS FOR VISITING OUR SITE HAVE A NCE DAY AND VISIT AGAIN");
            break;

            default :
                System.out.println("INVALID CHOICE ! TRY AGAIN");
        }
    }
    while(choice!=3);
}

    public static void showSeats(boolean[][] seats){
        System.out.println("seats layout ( X : available , 0 : Not available)");
        for(int i=0 ; i< seats.length ; i++){
            System.out.print("row" + i);
            for(int j=0;j<seats[0].length;j++){
                System.out.print(seats[i][j] ? "X" : "0");
            }
            System.out.println();
        }

        
    }
}
