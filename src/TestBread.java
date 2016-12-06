/**
 * Created by jc339438 on 6/12/2016.
 */
public class TestBread
{
    public static void main(String[] args)
    {
        Bread one = new Bread("Gardenia", 50);
        Bread two = new Bread("Massimo", 60);
        Bread three = new Bread("Daily", 70);
        System.out.println(Bread.MOTTO);
        System.out.println("Bread Type: " + one.getBreadType());
        System.out.println("Bread Calories:  " + one.getBreadCalories());
        System.out.println(Bread.MOTTO);
        System.out.println("Bread Type: " + two.getBreadType());
        System.out.println("Bread Calories:  " + two.getBreadCalories());
        System.out.println(Bread.MOTTO);
        System.out.println("Bread Type: " + three.getBreadType());
        System.out.println("Bread Calories:  " + three.getBreadCalories());
    }
}