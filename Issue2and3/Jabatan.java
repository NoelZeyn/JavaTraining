package Issue2and3;

public enum Jabatan {
    DOSEN("Dosen"),
    KARYAWAN("Karyawan"),
    TENDIK("Tendik"),
    MAHASISWA("Mahasiswa");

    private final String label;

    Jabatan(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
