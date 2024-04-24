package Tugas4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Manusia:");
        Manusia manusia1 = new Manusia("Joko", "1234567890", true, true);
        Manusia manusia2 = new Manusia("Ciki", "0987654321", false, true);
        Manusia manusia3 = new Manusia("dono", "5432167890", false, false);
        System.out.println("a. " + manusia1);
        System.out.println("b. " + manusia2);
        System.out.println("c. " + manusia3);

        System.out.println("\nMahasiswa FILKOM:");
        MahasiswaFilkom mahasiswa1 = new MahasiswaFilkom("Sutris", true, "1234567890", false, "1751502000", 2.8);
        MahasiswaFilkom mahasiswa2 = new MahasiswaFilkom("ines", false, "0987654321", false, "1751503000", 3.2);
        MahasiswaFilkom mahasiswa3 = new MahasiswaFilkom("Feby", true, "5432167890", true, "1851504000", 3.8);
        System.out.println("a. " + mahasiswa1);
        System.out.println("b. " + mahasiswa2);
        System.out.println("c. " + mahasiswa3);

        System.out.println("\nPekerja:");
        Pekerja pekerja1 = new Pekerja("erza", true, "1234567890", true, 5000, LocalDate.of(2019, 1, 1), 2);
        Pekerja pekerja2 = new Pekerja("arzi", false, "0987654321", false, 6000, LocalDate.of(2015, 1, 1), 0);
        Pekerja pekerja3 = new Pekerja("azer", true, "5432167890", true, 7000, LocalDate.of(2004, 1, 1), 10);
        System.out.println("a. " + pekerja1);
        System.out.println("b. " + pekerja2);
        System.out.println("c. " + pekerja3);

        System.out.println("\nManager:");
        Manager manager = new Manager("Jaka", false, "0987654321", true, 7500, LocalDate.of(2009, 1, 1), 1, "HR");
        System.out.println("a. " + manager);
    }
}

