package homework.design_patterns.fabric.weapon;

public class PistolFactory extends WeaponFactory{
    @Override
    public Weapon createWeapon() {
        return new Pistol();
    }
}
