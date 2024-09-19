public class Pet {
    
    // Encapsulated Data Members 
    private int hunger;
    private int energy;
    private int cleanliness;
    private int happiness;
    private String name;

    static private int totalPets;

    public Pet(String name) {
        this.hunger = 20;
        this.energy = 20;
        this.cleanliness = 20;
        this.happiness = 20;
        this.name = name;
        totalPets++;
    }

    public void feed() {
        if (this.hunger > 0) {
            this.hunger -= 4;
            this.happiness += 1;
            this.energy += 1;
            System.out.println(this.name + " has been fed. Hunger level: " + this.hunger);
        } else {
            System.out.println(this.name + " is not hungry.");
        }
    }

    public void sleep(){
        if (this.energy < 20) {
            this.energy += 4;
            this.hunger += 4;
            this.cleanliness -= 2;
            this.happiness += 1;
            System.out.println(this.name + " has slept. Energy level: " + this.energy);
        } else {
            System.out.println(this.name + " is not sleepy.");
        }
    }

    public void giveBath() {
        this.cleanliness += 4;
        this.happiness += 1;
        System.out.println(this.name + " is clean now. Cleanliness level: " + this.cleanliness);
    }

    public void play() {
        if (this.energy >= 20) {
            this.energy -= 4;
            this.hunger += 4;
            this.cleanliness -= 2;
            this.happiness += 1;
            System.out.println(this.name + " is playing");
        } else {
            System.out.println(this.name + " is tired.");
        }

    }

    public void displayStatus() {
        System.out.println("Pet Name: " + this.name);
        System.out.println("Hunger Level: " + this.hunger);
        System.out.println("Energy Level: " + this.energy);
        System.out.println("Cleanliness Level: " + this.cleanliness);
        System.out.println("Happiness Level: " + this.happiness);
    }

    public void makeSound() {
        System.out.println(this.name + " says: Hello!");
    }  
    
    public static int getTotalPets() {
        return totalPets;
    }

    public static void setTotalPets(int totalPets) {
        Pet.totalPets = totalPets;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHunger() {
        return this.hunger;
    }

    public int getEnergy() {
        return this.energy;
    }

    public int getCleanliness() {
        return this.cleanliness;
    }

    public int getHappiness() {
        return this.happiness;
    }
}
