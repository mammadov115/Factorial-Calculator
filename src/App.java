import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        long number, factorial=1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
            
        }   

        System.out.println(factorial);
    }
}
