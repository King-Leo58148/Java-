public class WarehouseAnalysis {
    public static void main(String[] args) {

        // Box weights in the shipment
        double[] boxWeights = {12.5, 55.0, 45.0, 18.0, 22.5, 60.0, 30.0, 15.0, 50.0, 10.0};

        double totalWeight = 0;
        double heaviestBox = boxWeights[0];
        int heaviestBoxPosition = 1;

        int heavyBoxes = 0;
        int mediumBoxes = 0;
        int lightBoxes = 0;

        System.out.println("Box Classification:\n");

        for (int i = 0; i < boxWeights.length; i++) {
            double currentWeight = boxWeights[i];
            totalWeight += currentWeight;

            String category;

            // Classify the box based on weight
            if (currentWeight > 50) {
                category = "Heavy";
                heavyBoxes++;
            } else if (currentWeight >= 20) {
                category = "Medium";
                mediumBoxes++;
            } else {
                category = "Light";
                lightBoxes++;
            }

            // Track the heaviest box
            if (currentWeight > heaviestBox) {
                heaviestBox = currentWeight;
                heaviestBoxPosition = i + 1;
            }

            System.out.println("Box " + (i + 1) + ": " + category);
        }

        double averageWeight = totalWeight / boxWeights.length;

        System.out.println("\nSummary: \nTotal weight: " + totalWeight + " kg");
        System.out.println("Total weight: " + totalWeight + " kg");
        System.out.println("Average weight: " + averageWeight + " kg");
        System.out.println("Heavy boxes: " + heavyBoxes);
        System.out.println("Medium boxes: " + mediumBoxes);
        System.out.println("Light boxes: " + lightBoxes);
        System.out.println("Heaviest box: Box " + heaviestBoxPosition + " (" + heaviestBox + " kg)");
    }
}
