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
public class LiquidFuel extends Vehicle
{
    // Static Variable Declaration:
    public static final double LF_BASE_COST = 50000;
    public static final double LF_BASE_WEIGHT = 3500;
    public static final double LF_SUCC_RATE = 0.75;
    public static final double LF_MAX_WEIGHT = 30000;
    public static final int LF_MAX_CREW = 5;
    public static final int LF_MAX_PAY = 4;
    public static final double LF_THRUST = 300;
    
    public LiquidFuel()
    {
        super(LF_MAX_PAY, LF_MAX_CREW);
        this.setVehicleCost(LF_BASE_COST);
    }
    
    public boolean addPayload(Payload aPayload)
    {
        if(this.getCurrNumPayloads() >= this.LF_MAX_PAY)
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
        if(this.getCurrNumCrew() >= this.LF_MAX_CREW)
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
        return (((LF_THRUST - windResist) / this.calcWeight()) * Vehicle.EV_THRESH) * Vehicle.LHY_COST_PER_KG;
    }
    
    public double calcSuccess()
    {
        double totSuccess = LF_SUCC_RATE;
        
        for(int counter = 0; counter < this.getCurrNumCrew(); counter++)
        {
            totSuccess += this.getCrew(counter).calcExpMod();
        }
        return totSuccess; 
    }
    
    public double calcWeight()
    {
        double totWeight = super.calcWeight();
        totWeight += LF_BASE_WEIGHT;
        return totWeight;
    }
    
    public String toString()
    {
        String message = "";
        message += "Type: Liquid Fuel";
        message += super.toString();
        return message;
    }
}
