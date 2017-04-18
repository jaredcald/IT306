package GP1;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.10.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This DDC defines the parent 'Astronaut' class, which will provide the
// implementation details for it and all subclasses related to an ISSTRaC
// mission crew.
//=======================================================================//	
public abstract class Astronaut
{
    private final String experienceType[] = {"Trainee", "Novice", "Experienced", "Veteran"};
    private final int experienceAmount[] = {3,6,9,16};
    private String name;
    private int yearsExp;
    private int age;
    private double weight;
    private double height;
    private double salary;
    
    public String getName() { return this.name; }
    public int getYearsExp() { return this.yearsExp; }
    public int getAge() { return this.age; }
    public double getWeight() { return this.weight; }
    public double getHeight() { return this.height; }
    public double getSalary() { return this.salary; }
    
    public boolean setName(String aName)
    {
        if(aName.equals("") || aName.equals(" "))
        {
            return false;
        }
        else
        {
            this.name = aName;
            return true;
        }
    }
    
    public boolean setYearsExp(int index)
    {
        // Need to validate this mutator.
        this.yearsExp = experienceAmount[index];
        return true;        
    }
    
    public boolean setAge(int aAge)
    {
        // We may implement a condition preventing astronauts of a certain age.
        if(aAge < 0 || aAge > 100)
        {
            return false;
        }
        else
        {
            this.age = aAge;
            return true;
        }
    }
    
    public boolean setHeight(double aHeight)
    {
        // We may implement a condition preventing astronauts of a certain weight.
        if(aHeight < 0 || aHeight > 72)
        {
            return false;
        }
        else
        {
            this.height = aHeight;
            return true;
        }
    }
    
    public boolean setWeight(double aWeight)
    {
        // We may implement a condition preventing astronauts of a certain weight.
        if(aWeight < 0 || aWeight > 200)
        {
            return false;
        }
        else
        {
            this.weight = aWeight;
            return true;
        }
    }
    
    public abstract double calcExpMod(int yearsExperience, int age, double weight, double pay, int payRate);
    
    public abstract double calcSalary();            
}

