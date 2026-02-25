public class Wizard extends Character {
    private int magicPower;
    private String staffColor;

    public Wizard(String name, int age, double height, int strength, int magicPower, String staffColor) {
        super(name, age, height, strength); // Envía los datos básicos al padre
        this.magicPower = magicPower;
        this.staffColor = staffColor;
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Imprime Nombre, Edad, etc.
        System.out.println("Poder Mágico: " + magicPower + "/100");
        System.out.println("Color del Báculo: " + staffColor);
    }

    public int getMagicPower() { return magicPower; }
    public void setMagicPower(int magicPower) { this.magicPower = magicPower; }

    public String getStaffColor() { return staffColor; }
    public void setStaffColor(String staffColor) { this.staffColor = staffColor; }
}
