public class wait2Seconds {
    

    public static void wait(int a){


        a = a * 1000;


        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
            System.out.println("Got interupted!");
        }


    }
}
