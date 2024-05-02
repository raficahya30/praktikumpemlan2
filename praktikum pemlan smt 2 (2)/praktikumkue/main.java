package praktikumkue;

public class main {
    public static void main(String[] args) {
        
        Kue[] kueArray = new Kue[20];

        kueArray[0] = new KuePesanan("srikaya keju", 10000, 0.5);
        kueArray[1] = new KuePesanan("bolu coklat manis", 15000, 0.7);
        kueArray[2] = new KueJadi("lumeran red velvet", 20000, 3);
        kueArray[3] = new KuePesanan("nastar keju manis", 12000, 0.6);
        kueArray[4] = new KueJadi("choco naga", 25000, 2);
        kueArray[5] = new KuePesanan("krim keju choco", 18000, 0.8);
        kueArray[6] = new KueJadi("kue srikaya", 30000, 2);
        kueArray[7] = new KuePesanan("pukis keju", 14000, 0.9);
        kueArray[8] = new KueJadi("pisang coklat", 22000, 1);
        kueArray[9] = new KuePesanan("pisang keju", 16000, 0.7);
        kueArray[10] = new KuePesanan("pukis stroberi", 20000, 1);
        kueArray[11] = new KueJadi("martabak keju", 28000, 2);
        kueArray[12] = new KuePesanan("bolu keju seru", 19000, 0.8);
        kueArray[13] = new KueJadi("choco banana", 35000, 3);
        kueArray[14] = new KuePesanan("hotdog keju", 17000, 0.6);
        kueArray[15] = new KueJadi("pukis milo dini", 32000, 2);
        kueArray[16] = new KuePesanan("wafel coklat keju", 21000, 0.9);
        kueArray[17] = new KueJadi("croissant keju", 38000, 2);
        kueArray[18] = new KuePesanan("cromboloni keju", 23000, 1.2);
        kueArray[19] = new KueJadi("kroisant coklat", 40000, 3);

        for (Kue kue : kueArray) {
            System.out.println(kue.toString() + " (" + kue.getClass().getSimpleName() + ")");
        }


        double totalHarga = 0;
        for (Kue kue : kueArray) {
            totalHarga += kue.hitungHarga();
        }
        System.out.println("\nTotal harga semua jenis kue: " + totalHarga);


        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).berat;
            }
        }
        System.out.println("Total harga KuePesanan: " + totalHargaPesanan);
        System.out.println("Total berat KuePesanan: " + totalBeratPesanan);


        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).jumlah;
            }
        }
        System.out.println("Total harga KueJadi: " + totalHargaJadi);
        System.out.println("Total jumlah KueJadi: " + totalJumlahJadi);


        double maxHarga = Double.MIN_VALUE;
        Kue kueMaxHarga = null;
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > maxHarga) {
                maxHarga = kue.hitungHarga();
                kueMaxHarga = kue;
            }
        }
        System.out.println("Informasi kue dengan harga terbesar: " + "\n" + kueMaxHarga.toString());
    }
}
