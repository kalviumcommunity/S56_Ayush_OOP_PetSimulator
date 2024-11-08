// Single Inheritance:   Base Class is Pet and Derived Class is Dog

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " says: Hello!, I am Dog!");
    }
}
