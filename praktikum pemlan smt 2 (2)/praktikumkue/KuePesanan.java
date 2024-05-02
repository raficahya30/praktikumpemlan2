package praktikumkue;

class KuePesanan extends Kue {
    double berat;
    
    public KuePesanan(String nama, double harga, double berat) {
        this.nama = nama;
        this.harga = harga;
        this.berat = berat;
    }

    @Override
    double hitungHarga() {
        return harga * berat;
    }
}    

