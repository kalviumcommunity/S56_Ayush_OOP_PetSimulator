public class PetManager {
    static private int totalPets;

    public static void addPet(){
        totalPets++;
    }

    public static int getTotalPets(){
        return totalPets;
    }

    public static void setTotalPets(int totalPets){
        totalPets = totalPets;
    }

    public static void removePet(){
        totalPets--;
    }

}   
