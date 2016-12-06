/**
 * Created by jc339438 on 6/12/2016.
 */
public class SandwichFilling{
    public String filling;
    public int fillingCalories;
    public SandwichFilling(String type, int calories)
    {
        filling = type;
        fillingCalories = calories;
    }
    public String getSandwichFilling()
    {
        return filling;
    }
    public int getFillingCalories()
    {
        return fillingCalories;
    }

}