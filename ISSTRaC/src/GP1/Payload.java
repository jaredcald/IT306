package GP1;

abstract public class Payload
{	
    //class variables
    private int weight;
    private double cost;
    private int baseWeight;
    private double baseCost;
    private String payloadComments;

    //constructors
    public Payload(){
    }

    public Payload(int baseWeight, double baseCost){
            this.baseWeight = baseWeight;
            this.baseCost = baseCost;
    }

    public Payload(int baseWeight, double baseCost, double cost){
            this.baseWeight = baseWeight;
            this.baseCost = baseCost;
            this.cost = cost;
    }

    //accessors and mutators
    public int getweight(){ return weight; }
    public double getCost(){ return cost; }
    public int getBaseWeight(){ return baseWeight; }
    public double getBaseCost(){ return baseCost; }
    public String getPayloadComments() { return this.payloadComments; }
    
    public void setWeight(int weight){
            this.weight = weight;
    }
    
    public void setCost(double cost){
            this.cost = cost;
    }
    
    public boolean setPayloadComments(String someComments)
    {
        if(someComments.equals("") || someComments.equals(" "))
        {
            return false;
        }
        else
        {
            this.payloadComments = someComments;
            return true;
        }
    }

    //special instance methods
    public int calcPayloadWeight(){
            int payloadWeight = (baseWeight + weight);
            return payloadWeight;
    }

    public double calcPayloadCost(){
            double payloadCost = ((cost*weight) + baseCost);
            return payloadCost;
    }

    public String toString(){
            String line = 
                            "  Base Weight : " + baseWeight + 
                            "  Base Cost : " + String.format("%10.2f", baseCost) +
                            "  Weight : " + weight + "lbs." +
                            "  Cost : " + String.format("%10.2f", cost) + "per/lb" +
                            "  Payload Weight : " + calcPayloadWeight() + 
                            "  Payload Cost : " + calcPayloadCost();		
            return line; 
    }

    public void toCSV(){
            // To Be Added
    }
}
