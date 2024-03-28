package tugas3hero;

import java.util.Scanner;

public class mainhero {
    
    public static void main(String[] args) {

        int round = 0;
        int pemenang = 0;

        Scanner scn = new Scanner(System.in);

        System.out.print("\nPermainan adu hero" + "\nPlayer 1 : Silakan masukkan hero anda!" 
        + "\nUntuk bagian angka, mohon masukkan angka antara 0 hingga 500!" + "\n===============================================" + "\n");

        heronya hero1 = new heronya();
        System.out.print("Nama hero: ");
        hero1.setNama(scn.nextLine());
        System.out.print("Health Point: ");
        hero1.setHp(scn.nextDouble());
        System.out.print("Attack: ");
        hero1.setAttack(scn.nextDouble());
        System.out.print("Defense: ");  
        hero1.setDefence(scn.nextDouble());
        
        System.out.print("\nperainan adu hero" + "\nPlayer 2 : Silakan masukkan hero anda!"
        + "\nUntuk bagian angka, mohon masukkan angka antara 0 hingga 500!" + "\n===============================================" + "\n");

        scn.nextLine(); // Menangkap newline
        heronya hero2 = new heronya();
        System.out.print("Nama hero: " );
        hero2.setNama(scn.nextLine());
        System.out.print("Health Point: ");
        hero2.setHp(scn.nextDouble());
        System.out.print("Attack: ");
        hero2.setAttack(scn.nextDouble());
        System.out.print("Defense: ");
        hero2.setDefence(scn.nextDouble());

        System.out.println("===============================================");
        System.out.println("===============================================");

        do {
            round++;
            System.out.println("\nRonde " + round);
            System.out.println(hero1.getNama() + " \nmenyerang " + hero2.getNama());
            System.out.println();

            hero1.attackPower(hero2);
            System.out.println(hero1.getNama() + " \nmenyerang sebesar " + hero1.getAttack());
            System.out.println(hero2.getNama() + " \nmemiliki pertahanan sebesar " + hero2.getDefense());
            System.out.println("\nHealth " + hero2.getNama() + " \nsaat ini " + hero2.getDarah());
            System.out.println();

            pemenang = checkpemenang(hero1, hero2);
            switch (pemenang) {
                case 1:
                    System.out.println("Pertarungan telah usai!");
                    System.out.println(hero1.getNama() + " telah kalah!");
                    System.out.println(hero2.getNama() + " adalah pemenangnya!");
                    scn.close();
                    return;
                case 2:
                    System.out.println("Pertarungan telah usai!");
                    System.out.println(hero2.getNama() + " telah kalah!");
                    System.out.println(hero1.getNama() + " adalah pemenangnya!");
                    scn.close();
                    return;
            }
            
            System.out.print(hero2.getNama() + " \nmenyerang " + hero1.getNama());
            System.out.println();

            hero2.attackPower(hero1);
            System.out.println(hero2.getNama() + " menyerang sebesar " + hero2.getAttack());
            System.out.println(hero1.getNama() + " memiliki pertahanan sebesar " + hero1.getDefense());
            System.out.println("\nHealth " + hero1.getNama() + " \nsaat ini " + hero1.getDarah());
            System.out.println();

            pemenang = checkpemenang(hero1, hero2);
            switch (pemenang) {
                case 1:
                    System.out.println("Pertarungan telah usai!");
                    System.out.println(hero1.getNama() + " telah kalah!");
                    System.out.println(hero2.getNama() + " adalah pemenangnya!");
                    scn.close();
                    return;
                case 2:
                    System.out.println("Pertarungan telah usai!");
                    System.out.println(hero2.getNama() + " telah kalah!");
                    System.out.println(hero1.getNama() + " adalah pemenangnya!");
                    scn.close();
                    return;
            }

        } while (pemenang == 0);

        scn.close();
    }

    public static int checkpemenang(heronya hero1, heronya hero2) {
        if (hero1.getDarah() <= 0) {
            return 2; 
        } else if (hero2.getDarah() <= 0) {
            return 1; 
        }
        return 0; 
    }
}

