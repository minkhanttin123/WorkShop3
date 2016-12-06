/**
 * Created by jc339438 on 6/12/2016.
 */
public class TestSandwichFilling
{
    public static void main(String[] args)
    {
        SandwichFilling one = new SandwichFilling("Egg Salad",100);
        SandwichFilling two = new SandwichFilling("Tuna",200);
        SandwichFilling three = new SandwichFilling("Ham", 300);
        System.out.println("Sandwich filling : " + one.getSandwichFilling());
        System.out.println("Filling calories : " + one.getFillingCalories());
        System.out.println("Sandwich filling : " + two.getSandwichFilling());
        System.out.println("Filling calories : " + two.getFillingCalories());
        System.out.println("Sandwich filling : " + three.getSandwichFilling());
        System.out.println("Filling calories : " + three.getFillingCalories());
    }
}

