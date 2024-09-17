import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sum of the first n integers: ");
        int sum = scanner.nextInt();
        int n = (int) Math.sqrt(2 * sum);

    
        if (n * (n + 1) / 2 == sum) {

            System.out.println("The value of n is: " + n);
        } else {
            System.out.println("No such n exists for the given sum.");
        }
    }
}

