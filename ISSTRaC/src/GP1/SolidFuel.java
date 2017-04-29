package GP1;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.27.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This application will present the UI for the ISSTRaC application, 
// and allow a user to enter all of the data requirements as specified in 
// the earlier project documentation.
//=======================================================================//	
public class SolidFuel extends Vehicle
{
    // Static Variable Declaration:
    public static final double SF_BASE_COST = 90000;
    public static final double SF_BASE_WEIGHT = 5000;
    public static final double SF_SUCC_RATE = 0.65;
    public static final double SF_MAX_WEIGHT = 50000;
    public static final int SF_MAX_CREW = 6;
    public static final int SF_MAX_PAY = 6;
    public static final double SF_THRUST = 750;
            
    public SolidFuel()
    {
        super(SF_MAX_PAY, SF_MAX_CREW);
        this.setVehicleCost(SF_BASE_COST);
    }
    
    public boolean addPayload(Payload aPayload)
    {
        if(this.getCurrNumPayloads() >= this.SF_MAX_PAY)
        {
            return false;
        }
        else
        {
            this.setPayload(aPayload);
            return true;
        }
    }
    
    public boolean addCrew(Astronaut anAstronaut)
    {
        if(this.getCurrNumCrew() >= this.SF_MAX_CREW)
        {
            return false;
        }
        else
        {
            this.setCrew(anAstronaut);
            return true;
        }
    }
    
    public double calcFuelCost(int windResist)
    {
        return (((SF_THRUST - windResist) / this.calcWeight()) * Vehicle.EV_THRESH) * Vehicle.LHY_COST_PER_KG;
    }
    
    public double calcSuccess()
    {
        double totSuccess = SF_SUCC_RATE;
        
        for(int counter = 0; counter < this.getCurrNumCrew(); counter++)
        {
            totSuccess += this.getCrew(counter).calcExpMod();
        }
        return totSuccess; 
    }
    
    public double calcWeight()
    {
        double totWeight = super.calcWeight();
        totWeight += SF_BASE_WEIGHT;
        return totWeight;
    }
    
    public String toString()
    {
        String message = "";
        message += "Type: Solid Fuel";
        message += super.toString();
        return message;
    }
}
