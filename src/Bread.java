/**
 * Created by jc339438 on 6/12/2016.
 */
public class Bread
{
    public String breadType;
    public int breadCalories;
    public final static String MOTTO = "The Staff Of Life";
    public Bread(String type, int calories)
    {
        breadType = type;
        breadCalories = calories;
    }
    public String getBreadType()
    {
        return breadType;
    }
    public int getBreadCalories()
    {
        return breadCalories;
    }
}
