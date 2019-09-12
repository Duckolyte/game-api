package rpg.decorator.enchantments.weapon;

import rpg.item.BaseWeapon;
import rpg.model.Damage;

public class FireDamageWeaponEnchantmentDecorator extends WeaponEnchantmentDecorator {

    private Damage additionalFireDamage;

    public FireDamageWeaponEnchantmentDecorator(BaseWeapon decoratedWeapon) {
        super(decoratedWeapon);
    }

    @Override
    public Damage attack() {
        Damage damage = super.attack();
        damage.appendDamageSource(additionalFireDamage);
        return damage;
    }


}
