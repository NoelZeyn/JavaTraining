package Issue2;

public class Skripsi extends KaryaIlmiah implements Documentable, Archivable {
    public Skripsi(String judul, int tahun) {
        super(judul, tahun);
    }

    @Override
    public void validate() {
        if (getTahun() < 2000) {
            System.out.println("Tahun skripsi tidak valid");
        } else {
            System.out.println("Skripsi valid");
        }
    }

    @Override
    public void generateDocument() {
        System.out.println("Generate dokumen skripsi (PDF)");
    }

    @Override
    public void archive() {
        System.out.println("Skripsi diarsipkan");
    }

}
