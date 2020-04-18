import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        if (month.equalsIgnoreCase("Януари")) {
            System.out.println("31 дни");
        } else if(month.equalsIgnoreCase("Февруари")) {
            System.out.println("28 или 29 дни");
        } else if (month.equalsIgnoreCase("Март")) {
            System.out.println("31 дни");
        } else if (month.equalsIgnoreCase("Април")) {
            System.out.println("30 дни");
        } else if (month.equalsIgnoreCase("Май")) {
            System.out.println("31 дни");
        } else if (month.equalsIgnoreCase("Юни")) {
            System.out.println("30 дни");
        } else if (month.equalsIgnoreCase("Юли")) {
            System.out.println("31 дни");
        } else if (month.equalsIgnoreCase("Август")) {
            System.out.println("31 дни");
        } else if (month.equalsIgnoreCase("Септември")) {
            System.out.println("30 дни");
        } else if (month.equalsIgnoreCase("Октомври")) {
            System.out.println("31 дни");
        } else if (month.equalsIgnoreCase("Ноември")) {
            System.out.println("30 дни");
        } else if (month.equalsIgnoreCase("Декември")) {
            System.out.println("31 дни");
        } else {
            System.out.println("Няма такъв месец");
        }
    }
}
