package Issue2;

public class Main {

    public static void main(String[] args) {

        // Polymorphism KaryaIlmiah Induk, Skripsi anak
        KaryaIlmiah skripsi = new Skripsi(
            "PERBANDINGAN KINERJA ALGORITMA YOLOV11 ATTENTION DAN FASTER R-CNN " +
            "DALAM MENDETEKSI DAN MENGKLASIFIKASI WARNA JEEP DI KAWASAN WISATA GUNUNG BROMO",
            2025
        );

        skripsi.displayInfo();
        skripsi.validate();

        Documentable doc = (Documentable) skripsi;
        // doc.generateDocument();
        // it looks like i cannot input file directly here, so i will skip this part (this is just my imagination)

        Archivable arc = (Archivable) skripsi;
        arc.archive();
    }
}
