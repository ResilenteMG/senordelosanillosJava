public class Human extends Character {
    private String kingdom;
    private boolean isNoble;

    public Human(String name, int age, double height, int strength, String kingdom, boolean isNoble) {
        super(name, age, height, strength); // Envía los datos comunes a la Superclase
        this.kingdom = kingdom;
        this.isNoble = isNoble;
    }

    @Override
    public void printDetails() {
        super.printDetails(); // Llama a la impresión básica de Character
        System.out.println("Reino: " + kingdom);
        System.out.println("¿Es de linaje noble?: " + (isNoble ? "Sí" : "No"));
    }


    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public boolean isNoble() {
        return isNoble;
    }

    public void setNoble(boolean noble) {
        isNoble = noble;
    }
}
