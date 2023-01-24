/* A program to check if a number is pallindrome or not. 
 * So first let us know what pallindrome number is.
 * A pallindrome number is a number which stays same if we reverse that number from back or going index-wise.
 * For example - 202 is pallindrome number.
 *               102 is not pallindrome number.
 */
import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is pallindrome or not::");
        int a = 202;
        int temp = a;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + rem * 10;
            sum = sum / 10;
        }
        if (sum == a) {
            System.out.println("The number is pallindrome");
        } else
            System.out.println("The number is not pallindrome");

        sc.close();
    }
}
