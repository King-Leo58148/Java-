public class ShopSales{
    public static void main(String[] args) {

        // High Street Branch
        int[][] highStreet = {
            {42000, 48000, 50000},
            {52000, 58000, 60000},
            {46000, 49000, 58000},
            {50000, 51000, 61000}
        };

        // Mall Branch
        int[][] mallBranch = {
            {57000, 63000, 60000},
            {70000, 67000, 73000},
            {67000, 65000, 62000},
            {72000, 69000, 75000}
        };

        // ==COMBINED MONTHLY SALES ==
        System.out.println("COMBINED MONTHLY SALES");

        for (int i = 0; i < highStreet.length ; i++) {
            System.out.println("Quarter " + (i + 1));

            for (int j = 0; j < highStreet[i].length ; j++) {
                int sum = highStreet[i][j] + mallBranch[i][j];
                System.out.println("Month " + (j + 1) + ": " + sum);
            }
        }

        // == EACH SHOP QUARTERLY SALES ==
        int highAnnual = 0;
        int mallAnnual = 0;

        System.out.println("==HIGH STREET QUARTERLY SALES==");
        for (int i = 0; i < highStreet.length; i++) {
            int total = 0;

            for (int  j = 0; j< highStreet[i].length;  j++) {
                total = total + highStreet[i][j];
            }

            System.out.println("Quarter " + (i + 1) + ": " + total);
            highAnnual = highAnnual + total;
        }

        System.out.println("==MALL QUARTERLY SALES==");
        for (int i = 0; i < highStreet.length; i++) {
            int total = 0;

            for (int j = 0; j < highStreet[i].length; j++) {
                total = total + mallBranch[i][j];
            }

            System.out.println("Quarter " + (i + 1) + ": " + total);
            mallAnnual = mallAnnual + total;
        }

        // == COMBINED QUARTERLY SALES ==
        System.out.println("==COMBINED QUARTERLY SALES==");

        for (int i = 0; i < highStreet.length; i++) {
            int total = 0;

            for (int j = 0; j < highStreet[i].length;  j++) {
                total = total + highStreet[i][j] + mallBranch[i][j];
            }

            System.out.println("Quarter " + (i + 1) + ": " + total);
        }

        // == ANNUAL SALES ==
        System.out.println("==ANNUAL SALES==");
        System.out.println("High Street: " + highAnnual);
        System.out.println("Mall: " + mallAnnual);

        // ==GRAND TOTAL ==
        int grandTotal = highAnnual + mallAnnual;
        System.out.println("Grand Total: " + grandTotal);


//  ==SORT MONTHLY COMBINED SALES (HIGHEST TO  LOWEST) ==

        int[] monthlyTotals = new int[12];
        int index = 0;

        // store combined monthly totals
        for (int i = 0; i < highStreet.length; i++) {
            for (int j = 0; j < highStreet[i].length ; j++) {
                monthlyTotals[index] = highStreet[i][j] + mallBranch[i][j];
                index++;
            }
        }

        // bubble sort descending
        for (int k= 0; k < monthlyTotals.length - 1; k++) {
            for (int m = 0; m < monthlyTotals.length - 1; m++) {
                if (monthlyTotals[m] < monthlyTotals[m + 1]) {
                    int temp = monthlyTotals[m];
                    monthlyTotals[m] = monthlyTotals[m + 1];
                    monthlyTotals[m + 1] = temp;
                }}}
                System.out.println("==SORTED MONTHLY SALES (HIGHEST TO LOWEST)==");
            for (int k= 0; k < monthlyTotals.length; k++) {
            System.out.println(monthlyTotals[k]);
        }
    
 
        
        
    }

}


