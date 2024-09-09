import java.util.*;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    // Push elements onto the stack
    public void push(int element) {
        stack.push(element);
    }

    // Pop elements from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return a default value or throw an exception
        }
        return stack.pop();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Check if empty");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int pushElement = scanner.nextInt();
                    stack.push(pushElement);
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}

