import java.util.Scanner;
public class EngineeringTest {
 
    public static void main(String[] args) {
        double structralIntegrity = 100.0;
        double failureThreshold =15;
        int cycleCount = 0;
        double fatigueDamage = 5.0;
        
        Scanner sc = new Scanner(System.in);
        while(structralIntegrity >failureThreshold){
           System.out.print("Enter pressure force for Cycle "+ (cycleCount+1) + ":");
           double force = sc.nextDouble();
           if (force >20.0){
            structralIntegrity-=(force+fatigueDamage);

           }
           else{
           structralIntegrity-=force;

           }
           System.out.println("Remaining Integrity: " + structralIntegrity);
          
          cycleCount++;
        }

        System.out.println("Material Failure at Cycle "+ cycleCount);
        System.out.println("Final Integrity level: " + structralIntegrity);
        sc.close();

    }


}
