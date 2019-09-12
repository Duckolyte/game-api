package rpg.decorator.fraction;

import rpg.core.fraction.Fraction;
import rpg.character.Character;

public class HordeFractionDecorator extends FractionDecorator {

    private Fraction fraction = new Fraction();

    public HordeFractionDecorator(Character decoratedCharacter) {
        super(decoratedCharacter);
    }

    @Override
    public Fraction belongsFraction() {
        return fraction;
    }

    @Override
    public Character getCharacter() {
        FractionCharacter fractionCharacter = super.getCharacter();
        characterToDecorate.setFraction(fraction);
        return fractionCharacter;
    }
}
