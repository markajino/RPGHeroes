package exceptionsCustoms;

public class Invalid_Level_Custom_Exception extends Exception {

    // custom class exception passing values to superclass of exception
    public Invalid_Level_Custom_Exception(int level_Obj, int required_Level_Obj) {
        super("Cannot equip equipment with player level: " + level_Obj + ". Player has to be level: " + required_Level_Obj);
    }
}

