public class Main {
    public static void main(String[] args) {

        Pet.setTotalPets(0);

        // Dynamic Allocation of Memory for Array of Objects
        Pet[] pets = new Pet[3];

        // Dynamic Allocation of Memory using the new keyword
        Dog Tuffy = new Dog("Tuffy");
        pets[0] = Tuffy;
        
        // Dynamic Allocation of Memory using the new keyword
        Cat Tom = new Cat("Tom");
        pets[1] = Tom;
        
        // Dynamic Allocation of Memory using the new keyword
        Dog Sheru = new Dog("Sheru");
        pets[2] = Sheru;

        for(Pet pet : pets){
            pet.makeSound();
        }

        System.out.println(Pet.getTotalPets());

        // Deallocation is done automatically in Java by the process of Garbage Collection. 
        
    }
}
