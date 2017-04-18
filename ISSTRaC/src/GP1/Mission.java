package GP1;

public class Mission
{
    private int missionID;
    private String missionName;
    private String missionDate;
    private Vehicle missionVehicle;
    
    public int getMissionID() { return this.missionID; }
    public String getMissionName() { return this.missionName; }
    public String getMissionDate() { return this.missionDate; }
    
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
    
    public Vehicle getMissionVehicle()
    {
        // Clone function.
        return this.missionVehicle;
    }
    
    public boolean setMissionVehicle(Vehicle aVehicle)
    {
        // Clone function.
        this.missionVehicle = aVehicle;
        return true;        
    }
    
    public String toString()
    {
        String message = "";
        
        message += "Mission Name: " + this.getMissionName() + "\n";
        message += "Mission Date: " + this.getMissionDate() + "\n";
        message += "Mission Details:\n";
        message += this.getMissionVehicle().toString();
        
        return message;
    }
}
