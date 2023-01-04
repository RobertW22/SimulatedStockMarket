import java.util.Scanner;


import Stocks.*;



public class MainStockFloor {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables //
        int day = 1;
        int money = 50000;
        int stock[] = new int[2];

        // Stock option variables
        float stock0;
        float stock1;



        // Welcome Page with name & details input //
        welcomePage.welcome();
        

        // Pre Company Selection //
        System.out.println("You're about to be shown a list of companies, please select 2 to invest in");
        wait2Seconds.wait(4);
        System.out.println("Remeber you're a 3 day intern. You have 3 days to make as much money as possible and really impress your boss for that grad offer!");
        wait2Seconds.wait(5);

        for(int i = 0; i < 30; i++){
            System.out.println("");
        }
        

        // Company Selection //
        Companies.Facebook();
        Companies.Jimmy();
        Companies.Apple();
        Companies.Margret();
        Companies.Amazon();

        for(int i = 0; i < 5; i++){
            System.out.println("");
        }

        System.out.println("Take your time to look and scroll through your options, I know stock picking can be hard...");
        wait2Seconds.wait(4);
        System.out.println("because you never know whats going to happen. But you're a smart kid right? You'll figure it out!");
        wait2Seconds.wait(4);

        for(int i = 0; i < 5; i++){
            System.out.println("");
        }


        System.out.println("Please enter your 2 stocks of choice below:");


        // First Stock Selection
        System.out.println("First Stock: ");
        
        stock[0] = sc.nextInt();


       // Error Handling

        if(stock[0] > 5){
            while(stock[0] > 5){
           
                System.out.println("You have selected an invalid stock!! Enter again");
                stock[0] = sc.nextInt();
                
            }
        }
       


        wait2Seconds.wait(2);
        System.out.println("Good choice. Iv heard good things so far about that one.");
        wait2Seconds.wait(2);

        // Second Stock Selection
        System.out.println("Second Stock: ");
        stock[1] = sc.nextInt();

         // Error Handling

         if(stock[1] > 5){
            while(stock[1] > 5){
                System.out.println("You have selected an invalid stock!! Enter again");
                stock[1] = sc.nextInt();
            }
         }
        

        for(int i = 0; i < stock.length; i++){

            if(stock[i] == 1){
                System.out.println("You have selected Facebook");
            } else if(stock[i] == 2){
                System.out.println("You have selected Jimmy");
            } else if(stock[i] == 3){
                System.out.println("You have selected Apple");
            } else if(stock[i] == 4){
                System.out.println("You have selected Margret");
            } else if(stock[i] == 5){
                System.out.println("You have selected Amazon");
            }





        }

       
        




        
        



    }



}


