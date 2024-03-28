package tugas3hero;

public class heronya {
    
    private String nama;
    private double darah;
    private double defense;
    private double attack;

    public heronya(){
    
    }
    public heronya(String nama, double darah, double defense, double attack){
        this.nama = nama;
        this.darah = darah;
        this.defense = defense;
        this.attack = attack;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHp(double darah) {
        this.darah = darah;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setDefence(double defense) {
        this.defense = defense;
    }
    
    public String getNama() {
        return nama;
    }

    public double getDarah() {
        return darah;
    }

    public double getAttack() {
        return attack;
    }
    public double getDefense() {
        return defense;
    }
    public void attackPower(heronya hero) {
        double damage = attack - hero.getDefense();
        if (damage > 0) {
            hero.setHp(hero.getDarah() - damage);
        }
    }
}
