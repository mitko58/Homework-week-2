import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double perimeter = sumPerimeter(a, b);
        double area = sumArea(a,b);

        System.out.println(perimeter);
        System.out.println(area);
    }
    private static double sumArea(double a, double b){
        return a*b;
    }
    private static double sumPerimeter(double a, double b) {
        return 2*(a+b);
    }
}
