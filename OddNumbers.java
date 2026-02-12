
import java.util.Arrays;
import java.util.ArrayList;

public class OddNumbers {
    public static void main (String [] args){
        int count=0;

        for(int i=0;i<100;i++){
            if(i%2!=0){
                if (i==1 || i==3) continue;
                if (i>=80) break;
                else
                  
                count++;
            
                
            
            }   
        }
        int array []= new int[count];
        int num=0;
        for(int i=0;i<100;i++){
            if(i%2!=0){
                if (i==1 || i==3) continue;
                if (i>=80) break;
                else
                    array[num]=i;
                     num++;
                
            
            }   
        }
      System.out.println("The odd numbers between 0 and 100 are: "+Arrays.toString(array));
      
}
}
