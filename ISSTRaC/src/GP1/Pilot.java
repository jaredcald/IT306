package GP1;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.10.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This DDC defines the parent 'Pilot' class, which will provide the
// implementation details for the subclass for a particular 'Pilot' object.
//=======================================================================//
public class Pilot extends Astronaut 
{
    final int PILOT_RATE = 4;
    private final double[] P_SALARY = {1500,2500,3000,4500};
    private final double[] P_RATE = {-0.25, -0.15, 0, 0.15};
    int experienceType;
    double experienceAmount;
    
    public double calcExpMod()
    {
        return P_RATE[this.getYearsExp()];
    }
    
    public double calcSalary()
    {
        return P_SALARY[this.getYearsExp()];
    }
}
