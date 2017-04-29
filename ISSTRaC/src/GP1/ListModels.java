package GP1;

import javax.swing.DefaultComboBoxModel;

//=======================================================================\\
// Student Name: Benjamin Bristol (Lead)
// Student Name: Jared Caldwell (Support)
// Student Name: Anmol Dua (Support)
// Date: 4.27.17
// Course/Section: IT 306.001
// Assignment: Group Project
// This DDC defines all models for UI, which will provide the implementation
// information related to combo and list box models.  This is a utility class
// that is solely used for population of Swing controls.
//=======================================================================//
class VehicleModel extends DefaultComboBoxModel{
    public final static String[] VEHICLES = {"Cold Gas", "Solid Fuel", "Liquid Fuel"};
    
    public VehicleModel()
    {
        super();
        for(int counter = 0; counter < VEHICLES.length; counter++)
        {
            super.addElement(VEHICLES[counter]);
        }
    }
}

class PayloadModel extends DefaultComboBoxModel{
    public final static String[] PAYLOADS = {"Structure", "Equipment", "Supplies"};
    
    public PayloadModel()
    {
        super();
        for(int counter = 0; counter < PAYLOADS.length; counter++)
        {
            super.addElement(PAYLOADS[counter]);
        }
    }
}

class CrewModel extends DefaultComboBoxModel{
    public final static String[] CREWTYPE = {"Mission Captain", "Pilot", "Engineer", "Co-Pilot"};
    
    public CrewModel()
    {
        super();
        for(int counter = 0; counter < CREWTYPE.length; counter++)
        {
            super.addElement(CREWTYPE[counter]);
        }
    }
}

class ExperienceModel extends DefaultComboBoxModel{
    public final static String[] CREWEXP = {"Trainee", "Novice", "Experienced", "Veteran"};
    
    public ExperienceModel()
    {
        super();
        for(int counter = 0; counter < CREWEXP.length; counter++)
        {
            super.addElement(CREWEXP[counter]);
        }
    }
}
