package rpg.decorator.fraction;

import rpg.core.fraction.Fraction;
import rpg.character.Character;

public abstract class FractionDecorator implements Character {

    private Character decoratedCharacter;

    public FractionDecorator(Character decoratedCharacter) {
        this.decoratedCharacter = decoratedCharacter;
    }

    public abstract Fraction belongsFraction();

}
