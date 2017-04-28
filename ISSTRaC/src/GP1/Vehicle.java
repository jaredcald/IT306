package GP1;

public abstract class Vehicle
{
    public static final String[] VEHICLETYPES = {"Cold Gas", "Solid Fuel", "Liquid Fuel"};
    public static final double VEH_BASE_COST = 10000;
    public static final double VEH_MAX_COST = 100000;
    
    private Payload[] payloadArray;
    private Astronaut[] crewArray; 
    private double vehicleCost;
    private double vehicleWeight;
    
    private int currNumPayloads;
    private int currNumCrew;
    
    public Vehicle(int payloadSize, int crewSize)
    {
        this.payloadArray = new Payload[payloadSize];
        this.crewArray = new Astronaut[crewSize];
    }
    
    public double getVehicleCost(){ return this.vehicleCost; }
    public double getVehicleWeight() { return this.vehicleWeight; }
    public int getCurrNumPayloads() { return this.currNumPayloads; }
    public int getCurrNumCrew() { return this.currNumCrew; }
    
    public boolean setVehicleCost(double typeCost)
    {
        if((typeCost + VEH_BASE_COST) < 0 || (typeCost + VEH_BASE_COST) > VEH_MAX_COST)
        {
            return false;
        }
        else
        {
            this.vehicleCost = VEH_BASE_COST + typeCost;
            return true;
        }
    }
    
    public void setPayload(Payload aPayload)
    {
        this.payloadArray[this.currNumPayloads++] = aPayload;
    }
    
    public void setCrew(Astronaut anAstronaut)
    {
        this.crewArray[this.currNumCrew++] = anAstronaut;
    }
    
    public abstract boolean addPayload(Payload aPayload);
    public abstract boolean addCrew(Astronaut anAstronaut);
    
    public abstract double calcThrust();
    public abstract double calcWeight();
    
    public String toString()
    {
       String message = "";
       message += "|Payloads: " + this.getCurrNumPayloads();
       message += "|Crew: " + this.getCurrNumCrew();
       return message;
    }
}
