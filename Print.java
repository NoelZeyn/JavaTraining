import java.util.Scanner;

public class Print {

    final int[] age = {10, 20, 30, 40, 50};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = input.next();
        System.out.println("Hello " + nama);
        Print p = new Print();

        System.out.println(p.age.length);

        for (int i = 0; i < p.age.length; i++) {
            System.out.println(p.age[i]);
        }
        input.close();
    }
}
