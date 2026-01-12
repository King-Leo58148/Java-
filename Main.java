import java.util.Scanner;

public class Main {
//This is my first java program
   public static void main(String[] args){
     System.out.println("I love pizza!");
     System.out.println("It's really good!");
     System.out.println("Buy me pizza!");
     
//Variable in Java
// primitive = simple value stored directly in memory (stack)
// Reference = memory address (stack) that point to the (heap)

int age = 21;
int year =2025;

double price = 19.99;
double gpa = 3.5;
double temperature =-12.5;

char grade = 'A';
char symbol = '!';
char currency = '$';

boolean isStudent = true;
boolean forSale = false;


String name = "Louis";
String email = "lsanyenni@gmail.com";

System.out.println(age);
System.out.println("The year is "+ year);
System.out.println("$" +" price");
System.out.println (currency + " " + price);

System.out.println(forSale);


//simple if statement
if(isStudent){
    System.out.println("You are a student");
}

else {
    System.out.println("You are not a student");
}



System.out.println("My name is "+ name);
System.out.println("Your email is "+ email);


Scanner scanner  = new Scanner(System.in);  
System.out.print("Enter your name: ");
String name1 = scanner.nextLine();
System.out.println("Hello "+ name1);
System.out.println("Enter you age: ");
int age1 = scanner.nextInt();
System.out.println("You are "+ age1 + " years old");


scanner.close();

}
}