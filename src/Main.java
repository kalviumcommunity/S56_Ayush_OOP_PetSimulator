public class Main {
    public static void main(String[] args) {

        Pet[] pets = new Pet[3];

        // Creating 1st pet : Ben the Dog
        Dog Tuffy = new Dog("Tuffy");
        pets[0] = Tuffy;

        // Creating 2nd pet : Tom the Cat
        Cat Tom = new Cat("Tom");
        pets[1] = Tom;

        // Creating 3rd pet : Hank the Dog
        Dog Sheru = new Dog("Sheru");
        pets[2] = Sheru;

        for(Pet pet : pets){
            pet.makeSound();
        }
        
    }
}
