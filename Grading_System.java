import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter assessment score: ");
        int assessment = sc.nextInt();

        System.out.print("Enter exam score: ");
        int exam = sc.nextInt();

        System.out.print("Enter fees paid: ");
        int fees = sc.nextInt();

        int total = exam + assessment;

        boolean examPass = exam >= 25;
        boolean assessmentPass = assessment >= 15;

        boolean normalPass = examPass && assessmentPass;
        boolean condoned = (total == 39) && !(exam == 39 && assessment == 0);

        System.out.println("\n--- COMPONENT RESULTS ---");

        if (examPass)
            System.out.println("Exam: PASSED");
        else
            System.out.println("Exam: FAILED");

        if (assessmentPass)
            System.out.println("Assessment: PASSED");
        else
            System.out.println("Assessment: FAILED");

        System.out.println("\n--- FINAL DECISION ---");

        if (normalPass || condoned) {
            if (fees >= 100) {
                System.out.println("STATUS: CERTIFICATE ISSUED ");
            } else {
                System.out.println("STATUS: PASSED BUT FEES NOT FULLY PAID");
            }
        } else {
            if (!examPass && !assessmentPass) {
                System.out.println("STATUS: FAILED BOTH — REPEAT");
            } else {
                System.out.println("STATUS: FAILED ");
            }
        }
  
        sc.close();

    }
}
