import java.util.Scanner;

public class exercise_12_09{
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a binary string
        System.out.print("Enter a binary: ");
        try {
            System.out.println(Bin2Dec.bin2Dec(input.nextLine()));
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}