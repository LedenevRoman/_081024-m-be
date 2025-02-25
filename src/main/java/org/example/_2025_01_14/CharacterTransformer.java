package org.example._2025_01_14;

public class CharacterTransformer implements Transformer<Character> {
    @Override
    public Character transform(Character character) {
        return Character.toUpperCase(character);
    }
}
