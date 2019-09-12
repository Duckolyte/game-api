package rpg.item;

import rpg.model.Damage;

public class Sword extends BaseWeapon implements Wearable, Weapon {

    public Sword() {
        super();
    }

    @Override
    public Damage attack() {
        // TODO
        // pick random between min and max
        return new Damage();
    }
}
