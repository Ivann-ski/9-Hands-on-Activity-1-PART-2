//========== PART 2 ===========//

import java.util.Scanner;

public class RunQuad {
    // Constants for shape choices
    private static final String RECTANGLE = "R";
    private static final String SQUARE = "S";
    private static final String PARALLELOGRAM = "P";
    private static final String RHOMBUS = "H";
    private static final String TRAPEZOID = "T";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select from the following:\n" +
                         "R - Rectangle\n" +
                         "S - Square\n" +
                         "P - Parallelogram\n" +
                         "H - Rhombus\n" +
                         "T - Trapezoid\n" +
                         "Choice: ");
        
        String choice = scanner.nextLine().toUpperCase().trim();

        switch (choice) {
            case RECTANGLE:
                System.out.println("A rectangle:");
                new Rectangle().showDescription();
                break;
            case SQUARE:
                System.out.println("A square:");
                new Square().showDescription();
                break;
            case PARALLELOGRAM:
                System.out.println("A parallelogram:");
                new Parallelogram().showDescription();
                break;
            case RHOMBUS:
                System.out.println("A rhombus:");
                new Rhombus().showDescription();
                break;
            case TRAPEZOID:
                System.out.println("A trapezoid:");
                new Trapezoid().showDescription();
                break;
            default:
                System.out.println("Invalid choice. Select a valid option (R, S, P, H, or T).");
                break;
        }

        scanner.close();
    }
}