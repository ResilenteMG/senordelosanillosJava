public class Elf extends Character {
    private int dexterity;
    private int bowSkill;

    public Elf(String name, int age, double height, int strength, int dexterity, int bowSkill) {
        super(name, age, height, strength);
        this.dexterity = dexterity;
        this.bowSkill = bowSkill;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Destreza: " + dexterity);
        System.out.println("Habilidad con Arco: " + bowSkill + "%");
    }

    public int getDexterity() { return dexterity; }
    public void setDexterity(int dexterity) { this.dexterity = dexterity; }
    public int getBowSkill() { return bowSkill; }
    public void setBowSkill(int bowSkill) { this.bowSkill = bowSkill; }
}