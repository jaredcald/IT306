package GP1;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.27.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This DDC defines the parent 'CoPilot' class, which will provide the
// implementation details for the subclass for a particular 'CoPilot' object.
//=======================================================================//
public class Copilot extends Astronaut
{
    private final double[] CP_SALARY = {1000,2000,3000,4000};
    private final double[] CP_RATE = {-0.15, -0.05, 0.05, 0.15};
    int experienceType;
    double experienceAmount;
    
    public double calcExpMod()
    {
        return CP_RATE[this.getYearsExp()];
    }
    
    public double calcSalary()
    {
        return CP_SALARY[this.getYearsExp()];
    }
    
    public String toStringBrief()
    {
        String message = "";
        
        message += "Co-Pilot: " + this.getName() + ", " + EXP_TYPE[this.getYearsExp()];
        
        return message;
    }
}
