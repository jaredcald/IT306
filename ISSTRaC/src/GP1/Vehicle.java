package GP1;

public abstract class Vehicle
{
    public static final String[] VEHICLETYPES = {"Cold Gas", "Solid Fuel", "Liquid Fuel"};
    public static final double VEH_BASE_COST = 10000;
    public static final double EV_THRESH = 25000; // Miles per Hour
    public static final double LHY_COST_PER_KG = 3.66;
    
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
    
    
    public Payload getPayload(int target)
    {
        // Should clone.
        return this.payloadArray[target];
    }
    
    public Astronaut getCrew(int target)
    {
        // Should clone.
        return this.crewArray[target];
    }
    
    public boolean setVehicleCost(double typeCost)
    {
        if((typeCost + VEH_BASE_COST) < 0 )
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
    
    public abstract double calcFuelCost(int windResist);
    
    public abstract double calcSuccess();
    
    public double calcCost()
    {
        double totCost = this.getVehicleCost();
        
        for(int counter = 0; counter < this.getCurrNumPayloads(); counter++)
        {
            totCost += this.getPayload(counter).calcCost();
        }
        
        for(int counter = 0; counter < this.getCurrNumCrew(); counter++)
        {
            totCost += this.getCrew(counter).calcSalary();
        }
        
        return totCost;
    }
    
    public double calcWeight()
    {
        double totWeight = 0.0;
        
        for(int counter = 0; counter < this.getCurrNumPayloads(); counter++)
        {
            totWeight += this.getPayload(counter).calcWeight();
        }
        
        for(int counter = 0; counter < this.getCurrNumCrew(); counter++)
        {
            totWeight += this.getCrew(counter).getWeight();
        }
        
        return totWeight;
    }
    
    public String toString()
    {
       String message = "";
       message += "|Payloads: " + this.getCurrNumPayloads();
       message += "|Crew: " + this.getCurrNumCrew();
       return message;
    }
}
