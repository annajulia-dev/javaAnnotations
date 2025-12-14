package general.Enums;

public enum Rarity {
    COMMON(80),
    UNCOMMON(50),
    RARE(30),
    EPIC(10),
    LEGENDARY(1);

    private final int dropChance;

    private Rarity(int dropChance){
        this.dropChance = dropChance;
    }

    public int getDropChance(){
        return this.dropChance;
    }

    public String textRarity(){
        return "Rarity: " + this.name() + "\nDrop Chance: " + getDropChance() + "%";
    }
}
