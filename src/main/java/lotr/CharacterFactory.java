package lotr;

import java.util.Random;

public class CharacterFactory {
    public static Character createCharacter() {
        Random random = new Random();
        int characterType = random.nextInt(4);
        switch (characterType) {
            case 0:
                return new King();
            case 1:
                return new Knight();
            case 2:
                return new Hobbit();
            case 3:
                return new Elf();
            default:
                return null;
        }
    }
}
