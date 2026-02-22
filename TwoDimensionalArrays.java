public class TwoDimensionalArrays {
    public static void main(String [] args){
      int [] ratings = {2,3,4,3,5,3,4,5,2,2,3,3,4,5,1,2,4,1,2,5};
      int [] count = new int [5];
      int[] freq = {1,2,3,4,5};
      
      for (int i=1;i<6;i++){
    int num=0;
       for (int j=0;j<ratings.length;j++){
        if (i==ratings[j]){
           
           num++;
            
        }
        //
      }

        count[i-1]=num;
    }

int i,j,temp,swap;
for(i = 4;i>=0;i--){
    for(j=0;j<i;j++){
        if(count[j]>count[j+1]){
            temp=count[j];
            swap=freq[j];
            count[j] = count[j+1];
            count[j+1] = temp;
            freq[j]=freq[j+1];
            freq[j+1]=swap;}
        }

}
    for (int k = 0; k < count.length; k++) {
        System.out.println(freq[k] + " appears " + count[k] + " times");
    }
    }
    }
