import javax.swing.*;
/**
 * Created by jc339438 on 6/12/2016.
 */
public class BloodData
{
    public String bloodType;
    public char rhFactor;
    public BloodData()
    {
        bloodType = "O";
        rhFactor = '+';
    }
    public BloodData(String type, char factor)
    {
        bloodType = type;
        rhFactor = factor;
    }
    public void setBloodType(String type)
    {
        bloodType = type;
    }
    public void setRhFactor(char factor)
    {
        rhFactor = factor;
    }
    public String getBloodType()
    {
        return bloodType;
    }
    public char getRhFactor()
    {
        return rhFactor;
    }
}
