package general.Enums;

public class Main {

    public static void main(String[] args) {
        Rarity rarity1 = Rarity.COMMON;

        System.out.println(rarity1.getDropChance());

        for (Rarity rar : Rarity.values()) {
            System.out.println(rar);
        }
    }
}
