/**
 * Created by jc339438 on 6/12/2016.
 */
public class Sandwich
{
    private Bread bread;
    private SandwichFilling sandwichFilling;
    public Sandwich(String type, int calories, String filling, int cals)
    {
        bread = new Bread(type, calories);
        sandwichFilling = new SandwichFilling(filling, cals);
    }
    public String getBreadType()
    {
        return bread.getBreadType();
    }
    public int getBreadCalories()
    {
        return bread.getBreadCalories();
    }
    public String getSandwichFilling()
    {
        return sandwichFilling.getSandwichFilling();
    }
    public int getFillingCalories()
    {
        return sandwichFilling.getFillingCalories();
    }
}
