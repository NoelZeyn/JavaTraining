package Issue4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[2];

        System.out.println("Hello, Issue 4!");
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            a[0] = scanner.nextInt();

            System.out.print("Enter b number: ");
            a[1] = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka (integer).");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index array tidak valid.");
            return;
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
            return;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("Angka ke-%d = %d%n", i + 1, a[i]);
        }
    }
}
