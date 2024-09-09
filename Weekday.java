import java.util.Scanner;

public class Weekday {
     public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day position (0-6): ");
        int position = scanner.nextInt();

        try {
            System.out.println("Day name: " + weekdays[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day position. Please enter a value between 0 and 6.");
        }
    }
}


