package GP1;

import java.util.Random;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.27.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This DDC defines a Mission Object, and serves as the primary storage
// object for the ISSTRaC application.
//=======================================================================//	
public class Mission
{
    // Instance Variables:
    private int missionID;
    private String missionName;
    private String missionDate;
    private Vehicle missionVehicle;
        // This represents the amount of wind resistance encountered
        // during the mission.  It is a random value generated at
        // object creation time.
    private int missionWindValue;
    
    // Static Variables for Mission ID Generation:
    private static int numMissions;
    public static final int MISS_ID_RATE = 10;
    public static final int MISS_ID_INITIAL = 1000;
    
    // Default Constructor:
    public Mission()
    {
        // Generate Random Value to represent Wind Resistance:
        Random windVal = new Random();
        this.missionWindValue = windVal.nextInt(25) + 1;
        
        this.missionName = "";
        this.missionDate = "";
        this.missionVehicle = null;
        
        this.missionID = MISS_ID_INITIAL + (MISS_ID_RATE * Mission.getNumMiss());
        Mission.setNumMiss(1);
    }
    
    // Accessors:
    public int getMissionID() { return this.missionID; }
    public String getMissionName() { return this.missionName; }
    public String getMissionDate() { return this.missionDate; }
    public int getMissionWindValue() { return this.missionWindValue; }
    
    public Vehicle getMissionVehicle()
    {
        // TODO: Clone function.
        return this.missionVehicle;
    }
    
    public static int getNumMiss() { return Mission.numMissions; }
    
    // Mutators:
    public boolean setMissionName(String aName)
    {
        if(aName.equals("") || aName.equals(" "))
        {
            return false;
        }
        else
        {
            this.missionName = aName;
            return true;
        } 
    }
    
    public boolean setMissionDate(String aDate)
    {
        // TODO: Possibly validate against date structure.
        if(aDate.equals("") || aDate.equals(" "))
        {
            return false;
        }
        else
        {
            this.missionDate = aDate;
            return true;
        } 
    }
    
    public boolean setMissionVehicle(Vehicle aVehicle)
    {
        // TODO: Clone function.
        this.missionVehicle = aVehicle;
        return true;        
    }
    
    public static boolean setNumMiss(int amount)
    {
        if(Mission.getNumMiss() + amount < 0)
        {
            return false;
        }
        else
        {
            Mission.numMissions = Mission.getNumMiss() + amount;
            return true;
        }
    }
    
    // NOTE: This function could be bypassed, possibly remove?
    public double calcMissionSuccess()
    {
        return this.getMissionVehicle().calcSuccess();
    }
    
    public double calcMissionCost()
    {
        double totCost = 0.0;
        totCost += this.getMissionVehicle().calcFuelCost(this.getMissionWindValue());
        totCost += this.getMissionVehicle().calcCost();
        return totCost;
    }
    
    // Condensed toString() method for Combo Boxes:
    public String toStringBrief()
    {
        String message = "";
        
        message += this.getMissionID() + ": " + this.getMissionName();
        message += "||Payloads: " + this.getMissionVehicle().getCurrNumPayloads();
        message += "||Crew: " + this.getMissionVehicle().getCurrNumCrew();
        
        return message;
    }
    
    public String toString()
    {
        String message = "";
        
        message += "Mission Name: " + this.getMissionName();
        message += "|Mission Details: ";
        message += this.getMissionVehicle().toString();
        message += "\nSuccess: " + this.calcMissionSuccess();
        message += "\nTotal Cost: " + this.calcMissionCost();
        message += "\nFuel Cost: " + this.getMissionVehicle().calcFuelCost(this.getMissionWindValue());
        
        return message;
    }
}
