package GP1;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.10.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This DDC defines the parent 'MissionCaptain' class, which will provide the
// implementation details for the subclass for a particular 'MissionCaptain' object.
//=======================================================================//
public class MissionCaptain extends Astronaut
{
    private final double[] MC_SALARY = {2000,3000,4000,6000};
    private final double[] MC_RATE = {-0.2, -0.1, 0, 0.1};
    private int experienceType;
    private double experienceAmount;
    
    public MissionCaptain()
    {
        this.experienceType = -1;
        this.experienceAmount = 0.0;
    }

    public double calcExpMod()
    {
        return MC_RATE[this.getYearsExp()];
    }
    
    public double calcSalary()
    {
        return MC_SALARY[this.getYearsExp()];
    }
}
