 public class ListingElements {
    public static void main(String [] args){
        int x[][]={{2,3},{4,5}};
        int y[][]={{2,3},{4,5}};
        for(int i =0; i<x.length;i++){ 
            for(int j=0;j<x[i].length;j++){ 
               System.out.println(x[i][j]+y[i][j]);
            }
        }
    }

 }//
 //commit