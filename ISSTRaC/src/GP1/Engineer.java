package GP1;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.10.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This DDC defines the parent 'Engineer' class, which will provide the
// implementation details for the subclass for a particular 'Engineer' object.
//=======================================================================//
public class Engineer extends Astronaut
{
    final int ENGINEER_RATE = 3;
    int experienceType;
    double experienceAmount;

    public double calcExpMod(int yearsExperience, int age, double weight, double pay, int payRate) {
            //this.setSalary(yearsExperience * age * weight);
            return pay;
    }
    
    public double calcSalary()
    {
        
        return 0.0;
    }
}
