package Issue2and3;

public abstract class KaryaIlmiah {
    private String judul;
    private int tahun;
    private final Jabatan jabatan;

    protected KaryaIlmiah(String judul, int tahun, Jabatan jabatan) {
        this.judul = judul;
        this.tahun = tahun;
        this.jabatan = jabatan;
    }

    public String getJudul() {
        return judul;
    }
    
    public int getTahun() {
        return tahun;
    }

    public Jabatan getJabatan() {
        return jabatan;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void displayInfo() {
        System.out.printf("Judul Skripsi:%s,\nSkripsi Tahun: %d\nSkripsi Jabatan: %s\n", judul, tahun, jabatan.getLabel());
    }
    public abstract void validate();
}
