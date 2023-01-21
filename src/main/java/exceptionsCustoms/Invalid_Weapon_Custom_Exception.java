package exceptionsCustoms;

public class Invalid_Weapon_Custom_Exception extends Exception {

    // custom class exception passing values to superclass of exception
    public Invalid_Weapon_Custom_Exception(String hero_Obj, String weapon_Obj) {
        super(hero_Obj + " cannot equip " + weapon_Obj);
    }
}

