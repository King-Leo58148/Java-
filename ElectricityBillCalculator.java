import java.util.Scanner;
        
public class ElectricityBillCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double Cost_Per_KWH = 0.20;   
        System.out.println("Enter the number of appliances: ");
        int number = input.nextInt();
        double[] consumption = new double[number];
        double[] cost = new double [number];
        double totalCost = 0;
        double totalConsumption = 0;

        for (int i = 0; i < number; i++){
            System.out.println("Enter consumption of appliance" + (i + 1) + ":");
            consumption[i] = input.nextDouble();
            if(consumption[i] > 100){
              cost [i]= ( (consumption[i] * 0.15) + (consumption[i] * Cost_Per_KWH) );
                
                
            }
            else{
                cost[i] = consumption[i] * Cost_Per_KWH;
            }
            totalCost += cost[i];
            totalConsumption += consumption[i];
        }
        for (int i = 0; i < number; i++){
                    System.out.println("Appliance number: "+ (i+1) + " Consumption: " +consumption[i]
                            + " Cost: $" + cost[i]);
                }
            System.out.printf("Total consumption: %.2f%n", totalConsumption);
            System.out.printf("Total cost: $%.2f%n", totalCost);
        }
            }
        