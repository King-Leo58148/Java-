import java.util.Scanner;

public class brocode {
    //mad labs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String noun;
        String verb;
        String adjective3;
        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (animal or person): ");
        noun = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb ending with -ing (action): ");
        verb = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " +adjective1 + " zoo.");
         System.out.println("In an exhibit I saw a "+ noun + ".");
         System.out.println(noun + " was " + adjective2 + " and "+ verb + "!");
        System.out.println(" I was "+ adjective3 + "!");
        
    
    }
    }
