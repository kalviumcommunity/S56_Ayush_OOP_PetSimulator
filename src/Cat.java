public class Cat{

    private String name;

    public Cat(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void makeSound(){
        System.out.println(this.getName() + " says: Hello!, I am Cat");
    }
}
