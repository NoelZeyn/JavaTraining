package Issue1;

import java.util.Scanner;

public class Main {

    static String car() {
        return "This is a car method";
    }

    static int calculateInt(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                System.out.println("Operator not found");
                return 0;
        }
    }

    static int calculateInt(int a, int b) {
        return a + b;
    }

    // Method 3: tiga int (penjumlahan)
    static int calculateInt(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        car();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.print("Masukkan operator (+ - * /): ");
        char operator = input.next().charAt(0);

        int result = calculateInt(a, b, operator);

        
        // 
        System.out.println("Hasil: " + result);
        System.out.println("Penjumlahan methodOverload1 angka: " + calculateInt(5, 10));
        System.out.println("Penjumlahan methodOverload2 angka: " + calculateInt(5, 10, 15));


        // scope
        int[] number = { 1, 2, 3, 4, 5 };
        System.out.println(number.length);
        for (int i = 0; i < number.length; i++) {
            if (i >= 4) {
                System.out.println("Index lebih dari sama dengan 4: " + i);
                break;
            }
            System.out.println(number[i]);
        }
        input.close();
    }
}
