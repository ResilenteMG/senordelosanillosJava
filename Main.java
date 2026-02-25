public class Main {
    public static void main(String[] args) {

        System.out.println("====================================================");
        System.out.println("   SISTEMA DE GESTIÓN DE PERSONAJES - TIERRA MEDIA  ");
        System.out.println("====================================================\n");

        Human aragorn = new Human("Aragorn", 87, 1.98, 95, "Gondor", true);
        Human boromir = new Human("Boromir", 41, 1.93, 92, "Gondor", true);
        Human faramir = new Human("Faramir", 36, 1.91, 88, "Gondor", true);

        System.out.println(">>>> RAZA: HUMANOS <<<<");
        aragorn.printDetails(); System.out.println("---");
        boromir.printDetails(); System.out.println("---");
        faramir.printDetails(); System.out.println("\n");


        Elf legolas = new Elf("Legolas", 2931, 1.85, 80, 100, 95);
        Elf arwen = new Elf("Arwen", 2700, 1.78, 70, 90, 40);
        Elf galadriel = new Elf("Galadriel", 8000, 1.90, 60, 95, 20);

        System.out.println(">>>> RAZA: ELFOS <<<<");
        legolas.printDetails(); System.out.println("---");
        arwen.printDetails();   System.out.println("---");
        galadriel.printDetails(); System.out.println("\n");


        Dwarf gimli = new Dwarf("Gimli", 139, 1.37, 90, 45.5, 98);
        Dwarf gloin = new Dwarf("Gloin", 253, 1.35, 85, 50.0, 95);
        Dwarf thorin = new Dwarf("Thorin", 195, 1.40, 92, 40.0, 80);

        System.out.println(">>>> RAZA: ENANOS <<<<");
        gimli.printDetails();  System.out.println("---");
        gloin.printDetails();  System.out.println("---");
        thorin.printDetails(); System.out.println("\n");


        Wizard gandalf = new Wizard("Gandalf", 2000, 1.80, 70, 99, "Gris");
        Wizard saruman = new Wizard("Saruman", 2000, 1.82, 65, 95, "Blanco");
        Wizard radagast = new Wizard("Radagast", 1900, 1.75, 50, 85, "Pardo");

        System.out.println(">>>> RAZA: MAGOS <<<<");
        gandalf.printDetails();  System.out.println("---");
        saruman.printDetails();  System.out.println("---");
        radagast.printDetails(); System.out.println("\n");

        Hobbit frodo = new Hobbit("Frodo", 50, 1.06, 30, 95, 7);
        Hobbit sam = new Hobbit("Sam", 38, 1.05, 45, 80, 9);
        Hobbit pippin = new Hobbit("Pippin", 28, 1.10, 25, 85, 11);

        System.out.println(">>>> RAZA: HOBBITS <<<<");
        frodo.printDetails();  System.out.println("---");
        sam.printDetails();    System.out.println("---");
        pippin.printDetails(); System.out.println("\n");

        System.out.println("====================================================");
        System.out.println("   PRUEBA DE POLIMORFISMO COMPLETADA CON ÉXITO      ");
        System.out.println("====================================================");
    }
}