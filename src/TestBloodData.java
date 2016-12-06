/**
 * Created by jc339438 on 6/12/2016.
 */
public class TestBloodData
{
    public static void main(String[] args)
    {
        BloodData defaultBlood = new BloodData();
        System.out.println("Blood Type: " + defaultBlood.getBloodType());
        System.out.println("RH Factor: " + defaultBlood.getRhFactor());
        BloodData newType = new BloodData();
        newType.setBloodType("A");
        newType.setRhFactor('-');
        System.out.println();
        System.out.println("Blood Type: " + newType.getBloodType());
        System.out.println("RH Factor: " + newType.getRhFactor());
        System.out.println();
    }
}
