package Tugas4;

public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (menikah && jenisKelamin) {
            return 25.0;
        } else if (menikah && !jenisKelamin) {
            return 20.0;
        } else if (!menikah) {
            return 15.0;
        } else {
            return 0.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "\nNama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
                "\nPendapatan: $" + getPendapatan();
    }
}

