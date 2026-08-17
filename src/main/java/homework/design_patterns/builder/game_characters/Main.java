package homework.design_patterns.builder.game_characters;

public class Main {
    static void main(String[] args) {
        Character character = new Character.Builder()
                .setHealth(100)
                .setArmor(200)
                .setMagic(500)
                .setDamage(0)
                .build();

        System.out.println(character);
        character.
    }

}
