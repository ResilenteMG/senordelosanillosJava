public class Character {
    private String name;
    private int age;
    private double height;
    private int strength;


    public Character(String name, int age, double height, int strength) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.strength = strength;
    }


    public void printDetails() {
        System.out.println("--- Ficha Técnica ---");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Altura: " + height + "m");
        System.out.println("Fuerza: " + strength);
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public int getStrength() { return strength; }
    public void setStrength(int strength) { this.strength = strength; }
}