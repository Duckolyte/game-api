package rpg.decorator.enchantments.weapon;

import rpg.item.BaseWeapon;
import rpg.item.Weapon;
import rpg.model.Damage;

public abstract class WeaponEnchantmentDecorator implements Weapon {

    protected BaseWeapon decoratedWeapon;

    public WeaponEnchantmentDecorator(BaseWeapon decoratedWeapon) {
        this.decoratedWeapon = decoratedWeapon;
    }

    @Override
    public Damage attack() {
        return decoratedWeapon.attack();
    }
}
