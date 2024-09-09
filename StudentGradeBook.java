 import java.util.*;

public class StudentGradeBook {
    private Map<String, Integer> gradeBook;

    public StudentGradeBook() {
        gradeBook = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        gradeBook.put(name, grade);
    }

    public void removeStudent(String name) {
        gradeBook.remove(name);
    }

    public void displayGrade(String name) {
        if (gradeBook.containsKey(name)) {
            System.out.println(name + "'s grade: " + gradeBook.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        StudentGradeBook gradeBook = new StudentGradeBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    gradeBook.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.nextLine();
                    gradeBook.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.nextLine();
                    gradeBook.displayGrade(displayName);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}


