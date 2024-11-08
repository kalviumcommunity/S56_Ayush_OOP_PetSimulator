public class Main {
    public static void main(String[] args) {

        Pet.setTotalPets(0);

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

        System.out.println(Pet.getTotalPets());        
        System.out.println(Tuffy.getHunger());
        Tuffy.feed(new FoodItem("Fish", 5));
        System.out.println(Tuffy.getHunger());

    }
}
