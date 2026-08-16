package homework.design_patterns.fabric.weapon;

public class SwordFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
