
/**
 * part2
 */

import java.util.Scanner;

public class part2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Student's Grade on Test: ");
        int grade = input.nextInt();
        switch (grade) {
            case grade >= 90:
                System.out.println("A");
                break;
            case grade >= 80:
                System.out.println("B");
                break;
            case grade >= 70:
                System.out.println("C");
                break;
            case grade >= 60:
                System.out.println("D");
                break;
            case grade >= 0:
                System.out.println("F");
                break;

            default:
                System.out.println("Grade Not available");
        }
    }

}