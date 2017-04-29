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
    private final String EXP_TYPE[] = {"Trainee", "Novice", "Experienced", "Veteran"};
    private int expIndex;
    private String name;
    private double weight;
    private double height;
    
    public String getName() { return this.name; }
    public int getYearsExp() { return this.expIndex; }
    public double getWeight() { return this.weight; }
    public double getHeight() { return this.height; }
    
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
    
    public boolean setExpIndex(int anExp)
    {
        if(anExp < 0 || anExp > EXP_TYPE.length)
        {
            return false;
        }
        else
        {
            this.expIndex = anExp;
            return true;
        }
    }
    
    public abstract double calcExpMod();
    
    public abstract double calcSalary();            
}

