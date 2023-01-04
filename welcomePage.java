import java.util.Scanner;



public class welcomePage {
    

    public static void welcome(){
        System.out.println("Welcome to the Stock Floor!!");
        System.out.println("Appoligies I didnt quite catch your name? ");

        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Got interupted!");
        }


        System.out.print("Please enter your name below: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();


        System.out.println("Great to have you here " + name + "!");

        

        



        
        
 
    }

}
