import java.util.Scanner;

public class AverageGrades {
    public static void main(String[] args) {

        // Scanner
        Scanner sc = new Scanner(System.in);

        // Variables
        double firstGrade = 0;
        double secondGrade = 0;
        double thirdGrade = 0;
        double fourthGrade = 0;

        // Collecting grades
        System.out.println("====================");
        System.out.println("| Enter your grade |");
        System.out.println("====================");

        // Loop to collect grades
        for (int i = 1; i < 5; i++) {
            System.out.print(i + "° grade: ");
            double grade = sc.nextDouble();
            switch(i) {
                case 1:
                    firstGrade = grade;
                    break;
                case 2:
                    secondGrade = grade;
                    break;
                case 3:
                    thirdGrade = grade;
                    break;
                case 4:
                    fourthGrade = grade;
                    break;
            }
        }

        // Variables to calculate the total of the grade
        double sum = firstGrade + secondGrade + thirdGrade + fourthGrade;
        double average = sum / 4;

        // Print out the grades
        System.out.println();
        System.out.println("=====================");
        System.out.println("|--Your grades are--|");
        System.out.println("=====================");

        System.out.printf("First grade: %.2f", firstGrade);
        System.out.printf("\nSecond grade: %.2f", secondGrade);
        System.out.printf("\nThird grade: %.2f", thirdGrade);
        System.out.printf("\nFourth grade: %.2f", fourthGrade);


        // If statement to check if you passed, are in remediation or failed
        if(average >= 7) {
            System.out.println();
            System.out.printf("\nYour average grade is: %.2f\n", average);
            System.out.println("Congratulations, you passed");
        } else if (average >= 5) {
            System.out.println();
            System.out.printf("\nYour average grade is: %.2f %s", average, "\n");
            System.out.println("Watch out, you are in remediation");
        } else {
            System.out.println();
            System.out.printf("\nYour average grade is: %.2f %s", average, "\n");
            System.out.println("We're sorry, but you failed");
        }
    }
}
