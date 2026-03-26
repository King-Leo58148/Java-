import java.util.Scanner;
public class QualityControlTesting {
    public static void main(String[] args) {
        double boardHealth =  100.0;
        int spikeCount = 0;
        int userChoice = 1;
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("Enter the damage for this spike: ");
            double damage = sc.nextDouble();
            boardHealth = boardHealth-damage;
            System.out.println("Board Health: "+boardHealth);
            if (boardHealth>0){
                System.out.println("Continue testing? (1 for yes,0 for No): " );
                userChoice = sc.nextInt();

            }
            else{
                System.out.println("FRIED");
                break;
            }

            spikeCount++;
        } while (userChoice == 1);
     
        System.out.println("Number of spikes board survived: "+spikeCount);
     if(boardHealth<1){
        System.out.println("TEST TERMINATED: Component Destroyed");
        
    }
    }
   
}
