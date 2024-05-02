package praktikumkue;

class KueJadi extends Kue {
    
    double jumlah;
    
    public KueJadi(String nama, double harga, double jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    @Override
    double hitungHarga() {
        return harga * jumlah * 2;
    }
}   

