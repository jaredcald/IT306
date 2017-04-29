package GP1;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.27.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This DDC defines the parent 'Engineer' class, which will provide the
// implementation details for the subclass for a particular 'Engineer' object.
//=======================================================================//
public class Engineer extends Astronaut
{
    private final double[] E_SALARY = {1000,2500,4000,8000};
    private final double[] E_RATE = {-0.15, 0.05, 0.1, 0.2};
    int experienceType;
    double experienceAmount;

    public double calcExpMod()
    {
        return E_RATE[this.getYearsExp()];
    }
    
    public double calcSalary()
    {
        return E_SALARY[this.getYearsExp()];
    }
    
    public String toStringBrief()
    {
        String message = "";
        
        message += "Engineer: " + this.getName() + ", " + EXP_TYPE[this.getYearsExp()];
        
        return message;
    }
}
