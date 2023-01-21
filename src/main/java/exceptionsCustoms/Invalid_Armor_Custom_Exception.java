package exceptionsCustoms;

import constant.Enum;

public class Invalid_Armor_Custom_Exception extends Exception {
    // custom class exception passing values to superclass of exception
    public Invalid_Armor_Custom_Exception(Enum.Roles_Enum hero, String armor) {
        super(hero + " cannot equip armor " + armor);
    }
}


