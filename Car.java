public class Car{
    String make = "Ford";
    String model ="Mustard";
    int year = 2025;
    double price = 500000.99;
    boolean isRunning = false;
    

    void start(){  
        isRunning = true;
        System.out.println("You started the engine!");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine!");
    }

    void drive(){
        System.out.println("You drive the " + model);

}

    void brake(){
         System.out.println("You brake the "+ model);
}


}