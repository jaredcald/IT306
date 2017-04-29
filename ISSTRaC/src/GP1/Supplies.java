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
public class Supplies extends Payload
{
    // Static Variable Declaration:
    private static int baseWeight = 25;
    private static double baseCost = 7000;

    Supplies(){
            super(baseWeight, baseCost);
    }
    
    public String toStringBrief()
    {
        String message = "";
        
        message += "Supplies: " + this.getWeight() + ", " + this.getCost();
        
        return message;
    }
}
