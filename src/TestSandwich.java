/**
 * Created by jc339438 on 6/12/2016.
 */
public class TestSandwich
{
    public static void main(String[] args)
    {
        Sandwich one = new Sandwich("Gardenia", 50, "Egg Salad", 100);
        Sandwich two = new Sandwich("Massimo", 60, "Tuna", 200);
        Sandwich three = new Sandwich("Daily", 70, "Ham", 300);
        System.out.println("Sandwich 1");
        System.out.println(Bread.MOTTO);
        System.out.println("Bread Type: " + one.getBreadType());
        System.out.println("Bread Calories: " + one.getBreadCalories());
        System.out.println("Filling Type:  " + one.getSandwichFilling());
        System.out.println("Filling Calories:  " + one.getFillingCalories());
        System.out.println("Total Calorie: " + ((one.getBreadCalories() * 2) + one.getFillingCalories()));
        System.out.println();
        System.out.println("Sandwich 2 ");
        System.out.println("Bread Type: " + two.getBreadType());
        System.out.println("Bread Calories: " + two.getBreadCalories());
        System.out.println("Filling Type:  " + two.getSandwichFilling());
        System.out.println("Filling Calories:  " + two.getFillingCalories());
        System.out.println("Total Calorie: " + ((two.getBreadCalories() * 2) + two.getFillingCalories()));
        System.out.println();
        System.out.println("Sandwich 3 ");
        System.out.println("Bread Type: " + three.getBreadType());
        System.out.println("Bread Calories: " + three.getBreadCalories());
        System.out.println("Filling Type:  " + three.getSandwichFilling());
        System.out.println("Filling Calories:  " + three.getFillingCalories());
        System.out.println("Total Calorie: " + ((three.getBreadCalories() * 2) + three.getFillingCalories()));
    }
}
