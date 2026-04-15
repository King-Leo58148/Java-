
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        
    //   Car car1 = new Car();
    //   Car car2 = new Car();
    //   car1.start();
    //   System.out.println(car1.model);
    //   System.out.println(car2.model);
    //   System.out.println(car1.year);
    //   System.out.println(car1.make);
    //   System.out.println(car1.isRunning);
    //   car1.drive();
    //   car1.brake();
    
    // Student student1 = new Student("Spongebob",30,3.2);
    // Student student2 = new Student("Patrick",35,2.8);
    // System.out.println(student1.name);
    // System.out.println( student1.age);
    // System.out.println( student1.gpa);
    //  System.out.println( student1.isEnrolled);
    //  System.out.println(student2.name);
    // System.out.println( student2.age);
    // System.out.println( student2.isEnrolled);
 
    // User user1 = new User("Louis");
    // User user2 = new User("Sandy","sandy@gmail.com");
    // User user3 = new User("Patrick","patrickstar@gmail.com",21);
    
    // System.out.println(user1.name);
    //  System.out.println(user1.email);
    //   System.out.println(user1.age);

    //   System.out.println(user2.name);
    //   System.out.println(user2.email);
    //   System.out.println(user2.age);

    //   System.out.println(user3.name);
    //   System.out.println(user3.email);
    //   System.out.println(user3.age);

    //   User[] users = {user1,user2,user3};

    //   for(int i =0;i<users.length;i++){
    //     System.out.println(users[i].age);
// Dog dog = new Dog();
// Cat cat = new Cat();
// Fish fish = new Fish();
// dog.move();
// cat.move();
// fish.move();
// Plant plant = new Plant();

// plant.photosynthesise();


// System.out.println(dog.isAlive);
// System.out.println(cat.isAlive);
// dog.eat(); 
// System.out.println(dog.lives);
// dog.speak();
// System.out.println(cat.lives);
// cat.speak();
// Person person1 = new Person("louis","s");
// Person person2=new Person("Jude","f");
// person1.showName();
// person2.showName();
// System.out.println(person1.first);
// System.out.println(person2.first);
// Student student1 = new Student("louis", "s", 4.0);
// student1.showName();
// student1.showGpa();

// Employee employee1 = new Employee("louis","Sanyenni",2000);
// Employee employee2 = new Employee("h","S",2000);
// Employee employee3 = new Employee("third","employee",2000);
// employee1.showSalary();
// System.out.println(Employee.numOfEmployee);
// System.out.println(Employee.numOfEmployee);
// System.out.println(Employee.numOfEmployee);
// Employee.showNumOfEmployee();

Rabbit rabbit = new Rabbit();
rabbit.flee();

Hawk hawk = new Hawk();
hawk.hunt();

Fish fish = new Fish();
fish.flee();
fish.hunt();

// Predator[] predators = {fish,hawk};

// for (Predator predator:predators){
//     predator.hunt();
// }
Scanner scanner = new Scanner(System.in);
Predator predator1;

System.out.println("What would you like a fish or Hawk? (1 =fish,2 = hawk): ");
int choice = scanner.nextInt();

if (choice==1){
predator1 = new Fish();
predator1.hunt();
}

else if (choice == 2) {
   predator1 = new Hawk();
    predator1.hunt();
    
}








}
}


