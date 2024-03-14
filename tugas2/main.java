package tugas2;

import java.util.Scanner;

    public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kategori;
        data perpus = new data();
        do {
            System.out.println( "=====[Selamat Datang di Perpustakaan]=====");
                    for (int i = 0; i < perpus.getOptionsLength(); i++) {
                        System.out.println(i + 1 + ".   " + perpus.getOptions(i));
                    }
                    // "\nMasukkan pilihan kategori yang ingin anda cari :", 
                    // "\n1.\t", "\n2. Sejarah", "\n3. Filsafat", "\n4. Teknologi", "\n5. fiksi", "\n6. Psikologi", "\n7. Politik",
                    // "\n8. Tampilkan jumlah buku" };

            // for (int i = 0; i < list.length; i++) {
            //     System.out.print(list[i]);
            // }
            System.out.println();
            System.out.print("Masukkan pilihan anda = ");
            kategori = input.nextInt();
            System.out.println();

            switch (kategori) {
                case 1:
                    System.out.println("Berikut daftar Buku dalam kategori Agama:");
                    data.tampilan(perpus.forAgama());
                    break;
                case 2:
                    System.out.println("Berikut daftar Buku dalam kategori Sejarah:");
                    data.tampilan(perpus.forSejarah());
                    break;
                case 3:
                    System.out.println("Berikut daftar Buku dalam kategori Filsafat");
                    data.tampilan(perpus.forFilsafat());
                    break;
                case 4:
                    System.out.println("Berikut daftar Buku dalam kategori Teknologi");
                    data.tampilan(perpus.forAgama());
                    break;
                case 5:
                    System.out.println("Berikut daftar Buku dalam kategori Fiksi : ");
                    data.tampilan(perpus.forFiksi());
                    break;
                case 6:
                    System.out.println("Berikut daftar Buku dalam kategori Psikolog : ");
                    data.tampilan(perpus.forPsikologi());
                    break;
                case 7:
                    System.out.println("Berikut daftar Buku dalam kategori Politik : ");
                    data.tampilan(perpus.forPolitik());
                    break;
                case 8:
                    System.out.println("Jumlah total buku: 35");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka 1 hingga 9.");
            }
        } while (kategori < 1 || kategori > 7);

        System.out.println("Terimakasih sudah menggunakan sistem ini");
        input.close();
    }
}

