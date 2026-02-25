public class Dwarf extends Character {
    private double beardLength;
    private int miningSkill;

    public Dwarf(String name, int age, double height, int strength, double beardLength, int miningSkill) {
        super(name, age, height, strength);
        this.beardLength = beardLength;
        this.miningSkill = miningSkill;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Largo de Barba: " + beardLength + " cm");
        System.out.println("Habilidad Minera: " + miningSkill + "/100");
    }

    public double getBeardLength() { return beardLength; }
    public void setBeardLength(double beardLength) { this.beardLength = beardLength; }
    public int getMiningSkill() { return miningSkill; }
    public void setMiningSkill(int miningSkill) { this.miningSkill = miningSkill; }
}