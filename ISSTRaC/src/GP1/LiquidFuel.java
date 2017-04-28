package GP1;

public class LiquidFuel extends Vehicle
{
    public static final double LF_BASE_COST = 50000;
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
    
    public double calcThrust()
    {
        return 0.0;
    }
    
    public double calcWeight()
    {
        return 0.0;
    }
    
    public String toString()
    {
        String message = "";
        message += "Type: Liquid Fuel";
        message += super.toString();
        return message;
    }
}
