public class Cat extends Pet{

    public Cat(String name){
        super(name);
    }

    public String getName(){
        return this.name;
    }

    @Override   
    public void makeSound(){
        System.out.println(this.getName() + " says: Hello!, I am Cat");
    }
}
