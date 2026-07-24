import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {
        int mynumber=(int)(Math.random()*100);
        System.out.println("guess a number b/w 1-100");
        Scanner sc = new Scanner(System.in);
        int usernumber=0;

        //using do while loop
        do{
            usernumber=sc.nextInt();

            if(usernumber==mynumber){
                System.out.println("woohoo you guessed correct number");
                break;
            }
            else if(usernumber>mynumber){
                System.out.println("guess a more smaller no.");
            }
            else{
                System.out.println("guess a more larger no.");
            }

        }while(usernumber>=0);

        //using while loop
        // usernumber=sc.nextInt();
        // while(usernumber>=0){
        //     if (usernumber==mynumber) {
        //         System.out.println("woohoo you guessed correct number");
        //         break; 
        //     }
        //     else if (usernumber>mynumber) {
        //         System.out.println("guess a smaller no.");   
        //     }
        //     else{
        //         System.out.println("guess a larger number");   
        //     }
        //     usernumber=sc.nextInt();

        // }


        System.out.println(mynumber + " is my number");
    }
    
}
