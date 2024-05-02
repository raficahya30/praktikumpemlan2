package praktikumkue;

abstract class Kue {
    
    String nama;
    double harga;

    
    abstract double hitungHarga();

    
    public String toString() {
        return "Nama\t: " + nama + "\nHarga\t: " + harga;
        
    }
}
