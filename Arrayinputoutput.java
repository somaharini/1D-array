import java.util.Scanner;
public class Arrayinputoutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
             scanner.close();
    }
}
