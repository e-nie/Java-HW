package homework.design_patterns.fabric.weapon;

public class Main {
    static void main(String[] args) {
        WeaponFactory swordFactory = new SwordFactory();
        Weapon sword = swordFactory.createWeapon();

        WeaponFactory bowFactory = new BowFactory();
        Weapon bow = bowFactory.createWeapon();

        WeaponFactory pistolFactory = new PistolFactory();
        Weapon pistol = pistolFactory.createWeapon();

        sword.attack();
        bow.attack();
        pistol.attack();
    }
}
