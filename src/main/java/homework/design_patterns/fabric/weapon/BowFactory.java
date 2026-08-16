package homework.design_patterns.fabric.weapon;

public class BowFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
