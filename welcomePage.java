import java.util.Scanner;



public class welcomePage {
    

    public static void welcome(){


        // Welcome Message (Intro)
        System.out.println("Welcome to the Stock Floor intern, We've got to get you rolling ASAP!");

        wait2Seconds.wait(3);

        System.out.println("Sorry if im shouting it is awfully loud in here! Money does get folks quite excited after all");

        wait2Seconds.wait(3);

        System.out.println("also... apoligies I didnt quite catch your name?");
        
        wait2Seconds.wait(3);


        // Name Input
        System.out.print("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        wait2Seconds.wait(1);

        System.out.println("Great to have you here " + name + ", lets start making some money shall we?");

        wait2Seconds.wait(3);

        System.out.println("here we are, $50,000 should do for now. I'll be back to check on you, good luck kid.");

        wait2Seconds.wait(3);


        for(int i = 0; i < 30; i++){
            System.out.println("");
        }


       
        
 
    }

}
