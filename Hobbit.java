public class Hobbit extends Character {
    private int stealthLevel;
    private int mealsPerDay;

    public Hobbit(String name, int age, double height, int strength, int stealthLevel, int mealsPerDay) {
        super(name, age, height, strength);
        this.stealthLevel = stealthLevel;
        this.mealsPerDay = mealsPerDay;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Nivel de Sigilo: " + stealthLevel);
        System.out.println("Comidas al día: " + mealsPerDay);
    }

    public int getStealthLevel() { return stealthLevel; }
    public void setStealthLevel(int stealthLevel) { this.stealthLevel = stealthLevel; }
    public int getMealsPerDay() { return mealsPerDay; }
    public void setMealsPerDay(int mealsPerDay) { this.mealsPerDay = mealsPerDay; }
}