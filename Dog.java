public class Dog extends Animal {
    private String breed;

    public Dog(String animalName, String ownerName, int age, String breed) {
        super(animalName, ownerName, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return getAnimalName() + ", " + getOwnerName() + ", " + getAge() + ", Dog, " + breed;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog other = (Dog) obj;

        return super.equals(other) && breed.equals(other.breed);
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Buddy", "Ali", 3, "Labrador");
        Dog d2 = new Dog("Buddy", "Ali", 3, "Labrador");

        System.out.println(d1.toString());
        System.out.println(d1.equals(d2));
    }
}
