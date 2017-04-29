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
    public int getWeight(){ return weight; }
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
    public int calcWeight(){
        int payloadWeight = (baseWeight + weight);
        return payloadWeight;
    }

    public double calcCost(){
        double payloadCost = (this.getCost()+ baseCost);
        return payloadCost;
    }
    
    public abstract String toStringBrief();

    public String toString(){
        String line = 
                        "  Base Weight : " + baseWeight + 
                        "  Base Cost : " + String.format("%10.2f", baseCost) +
                        "  Weight : " + weight + "lbs." +
                        "  Cost : " + String.format("%10.2f", cost) + "per/lb" +
                        "  Payload Weight : " + calcWeight() + 
                        "  Payload Cost : " + calcCost();		
        return line; 
    }

    public void toCSV(){
            // To Be Added
    }
}
