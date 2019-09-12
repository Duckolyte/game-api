package rpg.item;

import rpg.model.Damage;

public abstract class BaseWeapon implements Weapon {

    public static final int minStability = 0;
    private int maxStability;
    private int currentStability;
    private int damageMin;
    private int dmgMax;

    public int getCurrentStability() {
        return currentStability;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDmgMax() {
        return dmgMax;
    }

    @Override
    public Damage attack() {
        return null;
    }
}
