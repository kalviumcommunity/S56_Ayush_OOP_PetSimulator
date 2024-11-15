public class Main {
    public static void main(String[] args) {

        PetManager petManager = new PetManager();
        petManager.setTotalPets(0);
        
        // Pets array depends on Abstract class Pet rather than concreate class Dog and Cat.
        Pet[] pets = new Pet[3];

        Dog Tuffy = new Dog("Tuffy");
        pets[0] = Tuffy;
        
        Cat Tom = new Cat("Tom");
        pets[1] = Tom;
        
        Dog Sheru = new Dog("Sheru");
        pets[2] = Sheru;

        for(Pet pet : pets){
            pet.makeSound();
        }

        System.out.println(petManager.getTotalPets());        
        System.out.println(Tuffy.getHunger());
        
        // Pet class depends on FoodItem class 
        Tuffy.feed(new FoodItem("Fish", 5));
        System.out.println(Tuffy.getHunger());       

    }
}
