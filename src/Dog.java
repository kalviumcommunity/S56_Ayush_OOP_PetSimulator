public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    // Method Overriding : Runtime Polymorphism
    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says: Hello!, I am Dog!");
    }
}
