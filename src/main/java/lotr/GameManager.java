package lotr;

public class GameManager {
    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();
        fight(character1, character2);
    }

    public static void fight(Character character1, Character character2) {
        String character1Name = character1.getClass().getSimpleName();
        String character2Name = character2.getClass().getSimpleName();
        System.out.println(character1Name + " vs " + character2Name);
        if (character1Name.equals("Hobbit")
                && character2Name.equals("Hobbit")) {
            System.out.println("They just started crying lol");
            System.out.println("It's a draw!");
            return;
        } else if (character1Name.equals("Elf") && character2Name.equals("Elf")) {
            System.out.println("They can't hurt each other");
            System.out.println("It's a draw!");
            return;
        }
        System.out.println("FIGHT!");
        while (character1.isAlive() && character2.isAlive()) {
            character1.kick(character2);
            System.out.println(character1Name + " attacks " + character2Name + ". " + character2Name + " has "
                    + character2.getHp() + " hp.");
            if (!character2.isAlive()) {
                System.out.println(character1Name + " wins!");
                break;
            }
            character2.kick(character1);
            System.out.println(character2Name + " attacks " + character1Name + ". " + character1Name + " has "
                    + character1.getHp() + " hp.");
            if (!character1.isAlive()) {
                System.out.println(character2Name + " wins!");
                break;
            }
        }
    }
}
