import java.util.Scanner;

public class Print {

    
    public static void main(String[] args) {
        int[] age = { 10, 20, 30, 40, 50 };
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = input.next();
        System.out.println("Hello " + nama);
        // Print p = new Print();
        int ab = 15;
        // System.out.println(p.getAgeLength());

        for (int i = 0; i < age.length; i++) {
            // System.out.println(age[i]);
            ab += age[i];
            System.out.println("Jumlah sementara: " + ab);
            if (ab > 150) {
                System.out.println("Jumlah melebihi 150, harap diperhatikan");
                break;
            } else {
                System.out.println("Jumlah tidak melebihi 150, lanjutkan");
                continue;
            }
            
        }
        input.close();
    }
}


