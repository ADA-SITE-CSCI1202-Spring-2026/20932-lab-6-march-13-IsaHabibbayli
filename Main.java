public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Milo", "Sara", 2);
        Dog d1 = new Dog("Buddy", "Ali", 3, "Labrador");
        Dog d2 = new Dog("Buddy", "Ali", 3, "Labrador");

        System.out.println("Animal object:");
        System.out.println(a1);

        System.out.println();

        System.out.println("Dog object:");
        System.out.println(d1);

        System.out.println();

        System.out.println("Checking equals:");
        System.out.println("d1 equals d2: " + d1.equals(d2));
    }
}
