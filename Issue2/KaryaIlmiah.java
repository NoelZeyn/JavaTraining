package Issue2;

public abstract class KaryaIlmiah {
    private String judul;
    private int tahun;

    protected KaryaIlmiah(String judul, int tahun) {
        this.judul = judul;
        this.tahun = tahun;
    }

    public String getJudul() {
        return judul;
    }
    
    public int getTahun() {
        return tahun;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void displayInfo() {
        System.out.printf("Judul Skripsi:%s,\nSkripsi Tahun: %d\n", judul, tahun);
    }
    public abstract void validate();
}
