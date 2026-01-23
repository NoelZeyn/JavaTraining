package Issue2and3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Skripsi extends KaryaIlmiah implements Documentable, Archivable {
    
    private File storedDocument;
    public Skripsi(String judul, int tahun, Jabatan jabatan) {
        super(judul, tahun, jabatan);
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
    public void setDocument(File pdfFile) {
        try {
            // 1. Tentukan folder tujuan
            Path folderPath = Path.of("documents/skripsi");

            // 2. Jika folder belum ada, buat
            if (!Files.exists(folderPath)) {
                Files.createDirectories(folderPath);
            }

            // 3. Tentukan path file tujuan
            Path targetPath = folderPath.resolve(pdfFile.getName());

            // 4. Salin file ke folder tujuan
            Files.copy(
                pdfFile.toPath(),
                targetPath,
                StandardCopyOption.REPLACE_EXISTING
            );

            this.storedDocument = targetPath.toFile();

            System.out.println("PDF berhasil disimpan di: " + targetPath);

        } catch (IOException e) {
            System.out.println("Gagal menyimpan dokumen: " + e.getMessage());
        }
    }

    @Override
    public void archive() {
        System.out.println("Skripsi diarsipkan: "+storedDocument);
    }

}
