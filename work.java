import java.util.*;
public class work {
 public static void main(String[] args){
    double[] numbers = {1,2,3,4,5,6,7,8,9,10};
    double sum = 0;
    for(int i=0;i<10;i++){
        sum+=numbers[i];
    }

    double average = sum/10;
    
    double deviation_sum = 0;
    for (int i = 0; i < 10; i++) {
        deviation_sum += Math.pow(numbers[i] - average,2);
       
    }
    double standard_deviation=Math.sqrt(deviation_sum/9);
    
    int num = (int) Math.round(standard_deviation);
    int factorial;
    for(int i = 0 ; i<num ;i++){
     factorial= (num)
    }


    System.out.println("Average : " + average);
    System.out.println("Standard deviation : " + standard_deviation);


 }

}