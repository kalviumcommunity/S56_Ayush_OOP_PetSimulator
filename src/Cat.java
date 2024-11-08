// Heirarchical Inheritance:  Base Class is Pet and Derived Classes are Cat, Dog

public class Cat extends Pet{

    public Cat(String name){
        super(name);
    }

    @Override   
    public void makeSound(){
        System.out.println(this.getName() + " says: Hello!, I am Cat");
    }
}
