public class FuelConsumptionAnalysis {
    public static void main(String[] args) {

        double[] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};

        int index = 0;

        double total = 0;
        double peak = fuelConsumption[0];
        int peakDay = 1;

        int highCount = 0;
        int normalCount = 0;
        int lowCount = 0;

        System.out.println("Daily Fuel Consumption Report:\n");

        while (index < fuelConsumption.length) {
            double current = fuelConsumption[index];
            total += current;

            String category;

            if (current > 20) {
                category = "High";
                highCount++;
            } else if (current >= 10) {
                category = "Normal";
                normalCount++;
            } else {
                category = "Low";
                lowCount++;
            }

            if (current > peak) {
                peak = current;
                peakDay = index + 1;
            }

            System.out.printf("Day %d: %.2f liters (%s)%n", index + 1, current, category);

            index++;
        }

        double average = total / fuelConsumption.length;

        System.out.println("\nSummary:");
        System.out.printf("Total fuel consumption: %.2f liters%n", total);
        System.out.printf("Average daily consumption: %.2f liters%n", average);
        System.out.println("High usage days: " + highCount);
        System.out.println("Normal usage days: " + normalCount);
        System.out.println("Low usage days: " + lowCount);
        System.out.printf("Peak consumption: Day %d with %.2f liters%n", peakDay, peak);
    }
}
