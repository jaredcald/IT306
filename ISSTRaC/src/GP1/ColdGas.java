package GP1;

public class ColdGas extends Vehicle
{
    public static final double CG_BASE_COST = 70000;
    public static final double CG_BASE_WEIGHT = 2000;
    public static final double CG_SUCC_RATE = 0.50;
    public static final double CG_MAX_WEIGHT = 10000;
    public static final int CG_MAX_CREW = 4;
    public static final int CG_MAX_PAY = 3;
    public static final double CG_THRUST = 500;
    
    public ColdGas()
    {
        super(CG_MAX_PAY, CG_MAX_CREW);
        this.setVehicleCost(CG_BASE_COST);
    }    
    
    public boolean addPayload(Payload aPayload)
    {
        if(this.getCurrNumPayloads() >= this.CG_MAX_PAY)
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
        if(this.getCurrNumCrew() >= this.CG_MAX_CREW)
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
        return (((CG_THRUST - windResist) / this.calcWeight()) * Vehicle.EV_THRESH) * Vehicle.LHY_COST_PER_KG;
    }
    
    public double calcSuccess()
    {
        double totSuccess = CG_SUCC_RATE;
        
        for(int counter = 0; counter < this.getCurrNumCrew(); counter++)
        {
            totSuccess += this.getCrew(counter).calcExpMod();
        }
        return totSuccess; 
    }
    
    public double calcWeight()
    {
        double totWeight = super.calcWeight();
        totWeight += CG_BASE_WEIGHT;
        return totWeight;
    }
    
    public String toString()
    {
        String message = "";
        message += "Type: Cold Gas";
        message += super.toString();
        return message;
    }
}
