public class FoodItem {
    private String name;
    private int nutritionValue;

    public FoodItem(String name, int nutritionValue) {
        this.name = name;
        this.nutritionValue = nutritionValue;
    }

    public String getName() { return name; }

    public int getNutritionValue() { return nutritionValue; }

    public void setName(String name) { this.name = name; }

    public void setNutritionValue(int nutritionValue) { this.nutritionValue = nutritionValue; }
}
